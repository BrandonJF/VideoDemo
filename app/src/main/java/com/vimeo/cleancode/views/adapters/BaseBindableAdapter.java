package com.vimeo.cleancode.views.adapters;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AlphaAnimation;

import com.vimeo.cleancode.util.WeakOnListChangedCallback;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Brandon on 11/7/16.
 */

public abstract class BaseBindableAdapter<T, V extends BaseBindableAdapter.ViewHolder> extends RecyclerView.Adapter<V> {
    private ObservableArrayList<T> mData = new ObservableArrayList<>();
    private boolean mInitializedDisplay = false;
    private final ObservableList.OnListChangedCallback<ObservableArrayList<T>> onListChangedCallback;

    public BaseBindableAdapter(Collection<T> items) {
        setItems(items);
        onListChangedCallback = new ObservableList.OnListChangedCallback<ObservableArrayList<T>>() {
            @Override
            public void onChanged(ObservableArrayList<T> list) {
                notifyDataSetChanged();
            }

            @Override
            public void onItemRangeChanged(ObservableArrayList<T> ts, int i, int i1) {
                notifyItemRangeChanged(i, i1);
            }

            @Override
            public void onItemRangeInserted(ObservableArrayList<T> ts, int i, int i1) {
                notifyItemRangeInserted(i, i1);
            }

            @Override
            public void onItemRangeMoved(ObservableArrayList<T> ts, int i, int i1, int i2) {
                notifyItemMoved(i, i1);
            }

            @Override
            public void onItemRangeRemoved(ObservableArrayList<T> ts, int i, int i1) {
                notifyItemRangeRemoved(i, i1);
            }
        };

        mData.addOnListChangedCallback(new WeakOnListChangedCallback(onListChangedCallback));
    }


    protected void setAnimation(View view) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(500);
        view.startAnimation(anim);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void addItem(int i, T item) {
        mData.add(i, item);
    }

    public void addItems(List<T> itemList) {
        mData.addAll(itemList);
    }

    protected void setItems(Collection items) {
        mData.addAll(items);
    }

    protected List<T> getData() {
        return mData;
    }

    private void removeItem(int i) {
        mData.remove(i);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

}

