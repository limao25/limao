package com.example.cuscircletabayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.example.cuscircletabayout.utils.DisplayUtil;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class LimaoTablayoutView extends View {

    //这是初始化上下文
    private Context mContext;
    //图形画笔
    private Paint paint;
    //文字画笔
    private Paint textpaint;

    private int viewwidth;
    private int viewhegiht;//测量的高度

    private int customizeViewDeFaultHeight = 100;//自定义控件默认的高度
    private float textwidth;
    private int tabposition = 0;//选择时的位置

    private List<String> tabTextList;//文字数组
    private float view_be_corners;//圆角的大小
    private int tabTextColor;//颜色
    private int tabSelectTextcolor;
    private int selectcolor;

    private float tabTextSize;
    private int tanTextStyle;
    private int view_bg;
    private int arcControlx = 30;//值越大，嘟嘟越大？
    private int tabNumer;//tab的数量

    private int arrControly = 3;
    private int arcWidth = 50;

    private int conterx;

    public LimaoTablayoutView(Context context) {
        this(context,null);
    }

    public LimaoTablayoutView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public LimaoTablayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;

        //初始化数据
        initData();
        //初始化attrs
        initAttrs(attrs,defStyleAttr);

    }

    private void initAttrs(AttributeSet attrs, int defStyleAttr) {

        //获取自定义属性
        TypedArray typedArray = mContext.obtainStyledAttributes(attrs, R.styleable.bottomCircleView, defStyleAttr, 0);

        //获取到点击的每一个下表
        int indexCount = typedArray.getIndexCount();

        for (int i = 0; i < indexCount; i++){
            //取出每一个的下标？
            int index = typedArray.getIndex(i);

            //这些应该是根据点击的不同更换属性
            if (index == R.styleable.bottomCircleView_arcControlX){
                arcControlx = typedArray.getInt(index,arcControlx);
            }else if (index == R.styleable.bottomCircleView_select_tab_color){
                selectcolor = typedArray.getColor(index,selectcolor);
            } else if (index == R.styleable.bottomCircleView_view_bg_corners) {
                view_bg = typedArray.getColor(index,view_bg);
            }else if (index == R.styleable.bottomCircleView_tabtextcolor){
                tabTextColor = typedArray.getColor(index,tabTextColor);
            }else if (index == R.styleable.bottomCircleView_tabSelectTextColor){
                tabSelectTextcolor = typedArray.getColor(index,tabSelectTextcolor);
            }else if (index == R.styleable.bottomCircleView_tabTextSize){
                tabTextSize = typedArray.getDimension(index,tabTextSize);
            }else if (index == R.styleable.bottomCircleView_view_bg_corners){
                view_be_corners = typedArray.getDimension(index,view_be_corners);
            }

        }

        typedArray.recycle();

    }

    RectF rectF_bg;
    RectF rectF_bg1;

    private void initData() {
        view_be_corners = DisplayUtil.dip2px(mContext,5);
        view_bg = ContextCompat.getColor(mContext,R.color.tab_select_color);
        selectcolor = ContextCompat.getColor(mContext,R.color.tab_normal_color);
        tabTextColor = ContextCompat.getColor(mContext,R.color.tab_text_color);

        tabSelectTextcolor = ContextCompat.getColor(mContext,R.color.tab_text_color);
        tabTextSize = DisplayUtil.dip2px(mContext,14);
        tanTextStyle = Typeface.NORMAL;

        paint = new Paint(paint.ANTI_ALIAS_FLAG);
        paint.setStyle(Paint.Style.FILL);

        textpaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        textpaint.setStyle(Paint.Style.FILL);
        Typeface font = Typeface.create(Typeface.SANS_SERIF, tanTextStyle);
        textpaint.setTypeface(font);

        tabTextList = new ArrayList<>();
        tabTextList.add("tab01");
        tabTextList.add("tab02");
        tabTextList.add("tab03");
        tabNumer = tabTextList.size();

    }

}
