package com.vimeo.cleancode.events;

/**
 * Created by Brandon on 11/8/16.
 */

public class LoadingEvent {
    private boolean mIsLoading;

    public LoadingEvent(boolean mIsLoading) {
        this.mIsLoading = mIsLoading;
    }

    public boolean isLoading() {
        return mIsLoading;
    }
}
