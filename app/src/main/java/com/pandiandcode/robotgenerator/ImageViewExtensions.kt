package com.pandiandcode.robotgenerator

import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by Rocio Ortega on 26/09/2018.
 */
fun ImageView.loadUrl(url: String) {
    Picasso.get()
            .load(url)
            .fit()
            .into(this)
}