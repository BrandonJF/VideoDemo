package com.vimeo.cleancode.interfaces;

/**
 * Created by Brandon on 11/8/16.
 */

public interface HandlerInterface {
    void onVideoClickListener(int position);
    interface View {
        void displayToast(String message);
    }
}
