package com.vimeo.cleancode.viewmodels;

import android.databinding.BaseObservable;
import android.util.Log;

import com.vimeo.cleancode.models.Datum;

/**
 * Created by Brandon on 11/6/16.
 */

public class VideoViewModel extends BaseObservable {
    private Datum mModel;

    public VideoViewModel(Datum videoModel) {
        this.mModel = videoModel;
    }

    public String getName() {
        return mModel.getName();
    }

    public String getPictureURI() {
        return mModel.getPictures().getSizes().get(0).getLink();
    }

    public void onVideoClick() {
        Log.d("DAMN", "got a click!");
    }
}
