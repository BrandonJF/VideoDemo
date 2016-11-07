package com.vimeo.cleancode.util;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by Brandon on 11/7/16.
 */

public class BindingAdapters {

    @BindingAdapter("android:src")
    public static void setImageViewResource(SimpleDraweeView draweeView, String uri) {
        draweeView.setImageURI(uri);
    }
}
