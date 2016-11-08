package com.vimeo.cleancode.views.adapters;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.vimeo.cleancode.databinding.ListItemVideoBinding;
import com.vimeo.cleancode.interfaces.HandlerInterface;
import com.vimeo.cleancode.viewmodels.VideoViewModel;

import java.util.Collection;

/**
 * Created by Brandon on 11/7/16.
 */

public class VideoListAdapter extends BaseBindableAdapter<VideoViewModel, VideoListAdapter.ViewHolder> {

    private static HandlerInterface mHandler;

    public VideoListAdapter(Collection<VideoViewModel> items, HandlerInterface handler) {
        super(items);
        mHandler = handler;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ListItemVideoBinding binding = ListItemVideoBinding.inflate(inflater, parent, false);
        binding.executePendingBindings();

//        binding.getRoot().setOnClickListener((view) -> {
//                    Toast.makeText(binding.getRoot().getContext(), "Item number " + + " has been selected", Toast.LENGTH_SHORT).show();
//                }
//        );
        return new VideoListAdapter.ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(VideoListAdapter.ViewHolder holder, int position) {
        ListItemVideoBinding binding = holder.getBinding();
        binding.setVideo(getData().get(position));

//        holder.getBinding().getRoot().setOnClickListener(v -> {
//            if (onItemClickListener != null)
//                onItemClickListener.onItemClick(position, item);
//        });
    }

    protected static class ViewHolder extends BaseBindableAdapter.ViewHolder implements View.OnClickListener {

        private ListItemVideoBinding mBinding;

        public ViewHolder(ListItemVideoBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
            mBinding.getRoot().setOnClickListener(this);
        }

        public void bind(ListItemVideoBinding binding) {
            mBinding = binding;
        }

        public ListItemVideoBinding getBinding() {
            return mBinding;
        }

        @Override
        public void onClick(View view) {
            mHandler.onVideoClickListener(getAdapterPosition());
        }
    }
}
