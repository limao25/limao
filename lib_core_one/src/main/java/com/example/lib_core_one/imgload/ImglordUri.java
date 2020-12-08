package com.example.lib_core_one.imgload;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.lib_core_one.R;

public class ImglordUri {

    public void NormalLord(Context context, String uri, ImageView imgview){

        RequestOptions options = new RequestOptions().placeholder(R.drawable.imgfail);

        Glide.with(context).load(uri).apply(options).into(imgview);

    }

    public void CircleLord(Context context,String uri,ImageView imageView){

        RequestOptions options = new RequestOptions().placeholder(R.drawable.imgfail);

        Glide.with(context).load(uri).transform(new CircleCrop()).apply(options).into(imageView);

    }


}
