package com.vimeo.cleancode.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Observable;
import android.databinding.ObservableArrayList;
import android.util.Log;

import com.vimeo.cleancode.VideoAdapter;
import com.vimeo.cleancode.models.ChannelVideosResponse;
import com.vimeo.cleancode.models.Datum;
import com.vimeo.cleancode.networking.VimeoAPIService;

import java.util.Collection;
import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Brandon on 11/6/16.
 */

public class BrowseViewModel extends BaseObservable {
    private final String TAG = this.getClass().getName();
    private VimeoAPIService mAPI;
    private VideoAdapter mVideoAdapter;
    private ObservableArrayList<VideoViewModel> mVideoViewModels = new ObservableArrayList<>();

    public BrowseViewModel(VimeoAPIService vimeoAPIService) {
        mAPI = vimeoAPIService;
        setupAdapter();
        getData();
    }

    private void setupAdapter() {
        mVideoAdapter = new VideoAdapter();
    }

    public VideoAdapter getVideoAdapter() {
        return mVideoAdapter;
    }

    private void getData() {
        rx.Observable<ChannelVideosResponse> mChannelObservable = mAPI.getStaffPicks()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());

        mChannelObservable.subscribe(new Observer<ChannelVideosResponse>() {
            @Override
            public void onCompleted() {
                Log.d(TAG,"Finished loading the channel data.");
            }

            @Override
            public void onError(Throwable e) {
                Log.d(TAG,"Error - Could not finish loading the channel data:" + e.toString());
            }

            @Override
            public void onNext(ChannelVideosResponse response) {
                addVideoViewModels(response.getData());
            }
        });
    }

    private void addVideoViewModels(List<Datum> videoModels) {
        Collection<VideoViewModel> viewModelCollection = null;
        for (Datum video : videoModels) {
            viewModelCollection.add(new VideoViewModel(video));
        }
        mVideoViewModels.addAll(viewModelCollection);
    }




}
