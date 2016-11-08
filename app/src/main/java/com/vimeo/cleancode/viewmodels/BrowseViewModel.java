package com.vimeo.cleancode.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Observable;
import android.databinding.ObservableArrayList;
import android.support.annotation.Nullable;
import android.util.Log;

import com.vimeo.cleancode.VideoAdapter;
import com.vimeo.cleancode.interfaces.HandlerInterface;
import com.vimeo.cleancode.models.ChannelVideosResponse;
import com.vimeo.cleancode.models.Datum;
import com.vimeo.cleancode.networking.VimeoAPIService;
import com.vimeo.cleancode.views.adapters.VideoListAdapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Brandon on 11/6/16.
 */

public class BrowseViewModel extends BaseObservable implements HandlerInterface{
    private final String TAG = this.getClass().getName();
    private VimeoAPIService mAPI;
    private VideoListAdapter mVideoAdapter;
    private ObservableArrayList<VideoViewModel> mVideoViewModels = new ObservableArrayList<>();
    private HandlerInterface.View mViewHandler;



    public BrowseViewModel(VimeoAPIService vimeoAPIService, HandlerInterface.View viewHandler) {
        mViewHandler = viewHandler;
        mAPI = vimeoAPIService;
        setupAdapter();
    }

    private void setupAdapter() {
        mVideoAdapter = new VideoListAdapter(mVideoViewModels, this);
    }

    private void addVideos(List<VideoViewModel> videos) {
        mVideoAdapter.addItems(videos);
    }

    public VideoListAdapter getVideoAdapter() {
        return mVideoAdapter;
    }

    public void getData() {
        getDataAtPage(1);
    }

    public void getDataAtPage(int page) {
        rx.Observable<ChannelVideosResponse> mChannelObservable = mAPI.getStaffPicks(page)
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
        List<VideoViewModel> viewModelCollection = new ArrayList<>();
        for (Datum video : videoModels) {
            viewModelCollection.add(new VideoViewModel(video));
        }
        addVideos(viewModelCollection);
    }


    @Override
    public void onVideoClickListener(int position) {
        mViewHandler.displayToast("Item number " + String.valueOf(position) + " has been selected");
    }
}
