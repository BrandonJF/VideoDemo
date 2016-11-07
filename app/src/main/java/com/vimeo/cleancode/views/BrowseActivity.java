package com.vimeo.cleancode.views;

import android.databinding.DataBindingUtil;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.ListView;

import com.vimeo.cleancode.R;
import com.vimeo.cleancode.VideoAdapter;
import com.vimeo.cleancode.databinding.ActivityBrowseBinding;
import com.vimeo.cleancode.networking.VimeoAPIService;
import com.vimeo.cleancode.viewmodels.BrowseViewModel;

import org.json.JSONObject;

import java.util.ArrayList;

public class BrowseActivity extends AppCompatActivity {

    private ListView mListView;
    private VideoAdapter mAdapter;
    private ArrayList<JSONObject> items = new ArrayList<>();
    private ActivityBrowseBinding mBinding;
    private BrowseViewModel mBrowseViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_browse);
        mBrowseViewModel = new BrowseViewModel(VimeoAPIService.getInstance());
        mBinding.setBrowseModel(mBrowseViewModel);
        setupAdapter();
    }


    private void setupAdapter() {
        mBinding.browseRvVideos.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mBrowseViewModel.getData();
        mBinding.browseRvVideos.setAdapter(mBrowseViewModel.getVideoAdapter());
    }
}
