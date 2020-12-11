package com.example.cuscircletabayout;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

public class AMaoTablayoutView extends View {
    private Paint mainPaint;
    private Context mContext;

    public AMaoTablayoutView(Context context) {
        this(context,null);
    }

    public AMaoTablayoutView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs ,0);
    }

    public AMaoTablayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        initView();
        initData();
    }

    private void initView() {
        mainPaint = new Paint();
        mainPaint.setStyle(Paint.Style.FILL);
        mainPaint.setColor(Color.BLUE);

    }

    private void initData() {

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Drawable drawable = mContext.getResources().getDrawable(R.drawable.imgfail);

        if (drawable != null){
            Bitmap bitmap = getCircleBitmap(((BitmapDrawable) drawable).getBitmap());

            canvas.drawBitmap(bitmap,0,0,mainPaint);
        }
//        canvas.drawCircle(50,50,50,mainPaint);

    }

    private Bitmap getCircleBitmap(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        //计算圆的半径
        int radius;
        if (width > height) {
            radius = height / 2;
        } else {
            radius = width / 2;
        }
        //新建画笔
        Paint paint = new Paint();
        paint.setColor(Color.GRAY);
        //创建需要返回的bitmap，后面绘制的东西都在这个bitmap里面
        Bitmap b = Bitmap.createBitmap(bitmap.getWidth(),
                bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        //使用canvas绘制一个bitmap处理
        Canvas canvas = new Canvas(b);
        //画出一个Color.GRAY的圆
        //drawCircle(float cx, float cy, float radius, @NonNull Paint paint)
        //(cx,cy)圆的中心点，radius圆的半径
        canvas.drawCircle(width / 2, height / 2, radius, paint);
        /**
         * PorterDuff.Mode.SRC_IN 在两者相交的地方绘制源图像，并且绘制的效果会受到目标图像对应地方透明度的影响
         * PorterDuff.Mode.SRC_OUT 和IN相反
         */
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        //需要上面这个圆上绘制图片,由于paint设置相交部分显示，所有只显示园的部分
        canvas.drawBitmap(bitmap, 0, 0, paint);

        return b;
    }

}
