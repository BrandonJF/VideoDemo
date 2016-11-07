package com.vimeo.cleancode.util;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import java.lang.ref.WeakReference;

/**
 * Created by Brandon on 11/7/16.
 */

public class WeakOnListChangedCallback<T extends ObservableArrayList> extends ObservableList.OnListChangedCallback<T> {
    private WeakReference<ObservableList.OnListChangedCallback<T>> reference;
    public WeakOnListChangedCallback(ObservableList.OnListChangedCallback<T> delegate) {
        this.reference = new WeakReference<>(delegate);
    }

    @Override
    public void onChanged(T t) {
        if (reference.get() != null) {
            reference.get().onChanged(t);
        }
    }

    @Override
    public void onItemRangeChanged(T t, int i, int i1) {
        if (reference.get() != null) {
            reference.get().onItemRangeChanged(t, i, i1);
        }
    }

    @Override
    public void onItemRangeInserted(T t, int i, int i1) {
        if (reference.get() != null) {
            reference.get().onItemRangeInserted(t, i, i1);
        }
    }

    @Override
    public void onItemRangeMoved(T t, int i, int i1, int i2) {
        if (reference.get() != null) {
            reference.get().onItemRangeMoved(t, i, i1, i2);
        }
    }

    @Override
    public void onItemRangeRemoved(T t, int i, int i1) {
        if (reference.get() != null) {
            reference.get().onItemRangeRemoved(t, i, i1);
        }
    }
}

