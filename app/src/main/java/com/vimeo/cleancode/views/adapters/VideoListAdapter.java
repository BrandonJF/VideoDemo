package com.vimeo.cleancode.views.adapters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.vimeo.cleancode.databinding.ListItemVideoBinding;
import com.vimeo.cleancode.viewmodels.VideoViewModel;

import java.util.Collection;

/**
 * Created by Brandon on 11/7/16.
 */

public class VideoListAdapter extends BaseBindableAdapter<VideoViewModel, VideoListAdapter.ViewHolder >{

    public VideoListAdapter(Collection<VideoViewModel> items) {
        super(items);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ListItemVideoBinding binding = ListItemVideoBinding.inflate(inflater, parent, false);
        return new VideoListAdapter.ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(VideoListAdapter.ViewHolder holder, int position) {
        ListItemVideoBinding binding = holder.getBinding();
        binding.setVideo(getData().get(position));
        setAnimation(binding.getRoot());
    }

    public static class ViewHolder extends BaseBindableAdapter.ViewHolder {

        private ListItemVideoBinding mBinding;

        public ViewHolder(ListItemVideoBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bind(ListItemVideoBinding binding) {
            mBinding = binding;
        }

        public ListItemVideoBinding getBinding() {
            return mBinding;
        }
    }
}
