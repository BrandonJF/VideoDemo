package com.vimeo.cleancode.views;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;
import android.widget.Toast;

import com.vimeo.cleancode.R;
import com.vimeo.cleancode.databinding.ActivityBrowseBinding;
import com.vimeo.cleancode.interfaces.HandlerInterface;
import com.vimeo.cleancode.networking.VimeoAPIService;
import com.vimeo.cleancode.util.EndlessRecyclerViewScrollListener;
import com.vimeo.cleancode.viewmodels.BrowseViewModel;

import org.json.JSONObject;

import java.util.ArrayList;

public class BrowseActivity extends AppCompatActivity implements HandlerInterface.View {

    private ListView mListView;
    private ArrayList<JSONObject> items = new ArrayList<>();
    private ActivityBrowseBinding mBinding;
    private BrowseViewModel mBrowseViewModel;
    private Snackbar mLoadingSnackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_browse);
        mBrowseViewModel = new BrowseViewModel(VimeoAPIService.getInstance(), this);
        mBinding.setBrowseModel(mBrowseViewModel);
        setupRecycler();
    }


    private void setupRecycler() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mBinding.browseRvVideos.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(mBinding.browseRvVideos.getContext(),
                linearLayoutManager.getOrientation());
        mBinding.browseRvVideos.addItemDecoration(dividerItemDecoration);
        mBrowseViewModel.getData();
        mBinding.browseRvVideos.setAdapter(mBrowseViewModel.getVideoAdapter());
        EndlessRecyclerViewScrollListener scrollListener = new EndlessRecyclerViewScrollListener(linearLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                mBrowseViewModel.getDataAtPage(page);
            }
        };
        // Adds the scroll listener to RecyclerView
        mBinding.browseRvVideos.addOnScrollListener(scrollListener);
    }

    @Override
    public void displayToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void toggleLoadingState(boolean isLoading) {
        if (mLoadingSnackbar == null) {
            mLoadingSnackbar = Snackbar.make(mBinding.getRoot(), "Loading...", Snackbar.LENGTH_INDEFINITE);
        }
        if (isLoading) {
            mLoadingSnackbar.show();
        } else {
            mLoadingSnackbar.dismiss();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBrowseViewModel = null;
        mBinding.setBrowseModel(null);
        mBinding.executePendingBindings();
    }
}
