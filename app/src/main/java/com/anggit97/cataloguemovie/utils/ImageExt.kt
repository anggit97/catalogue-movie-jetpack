package com.anggit97.cataloguemovie.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

/**
 * Created by Anggit Prayogo on 2019-08-27.
 * Github : @anggit97
 */

fun ImageView.showImageRounded(context: Context, imageSource: Any) {
    Glide.with(context)
        .load(imageSource)
        .transform(CenterCrop(), RoundedCorners(16))
        .into(this)
}