package com.optus.sample.utils

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

object BindingAdapters {

    @BindingAdapter("bind:imageUrl")
    @JvmStatic
    fun loadImage(view: ImageView, imageUrl: String?) {
        Log.v("====","Inside imageUrl ${imageUrl}")
        if (imageUrl != null && imageUrl.isNotEmpty()){
            Picasso.get()
                .load(imageUrl).into(view)
        }
        //.placeholder(R.drawable.placeholder)
    }


}