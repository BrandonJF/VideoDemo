package com.vimeo.cleancode.views;

import android.databinding.DataBindingUtil;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_browse);
        setupModel();
    }

    private void setupModel() {
        VimeoAPIService vimeoAPIService = VimeoAPIService.getInstance();
        mBinding.setBrowseModel(new BrowseViewModel(vimeoAPIService));
    }
    private class StaffPicksAsyncTask extends AsyncTask<Void, Void, ArrayList<JSONObject>> {

        @Override
        protected ArrayList<JSONObject> doInBackground(Void... params) {
            String url = "https://api.vimeo.com/channels/staffpicks/videos";
            String token = "bearer b8e31bd89ba1ee093dc6ab0f863db1bd";
            ArrayList<JSONObject> videos = new ArrayList<>();

//            StringBuilder builder = new StringBuilder();
//            HttpClient client = new DefaultHttpClient();
//            HttpGet httpGet = new HttpGet(url);
//            httpGet.addHeader("Authorization", token);
//            try {
//                HttpResponse response = client.execute(httpGet);
//                HttpEntity entity = response.getEntity();
//                InputStream content = entity.getContent();
//                BufferedReader reader = new BufferedReader(new InputStreamReader(content));
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    builder.append(line);
//                }
//                JSONObject object = new JSONObject(builder.toString());
//                JSONArray data = object.getJSONArray("data");
//                for (int i = 0; i < data.length(); i++) {
//                    videos.add(data.getJSONObject(i));
//                }
//            } catch (ClientProtocolException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
            return videos;
        }

        @Override
        protected void onPostExecute(ArrayList<JSONObject> result) {
            items = result;
            mAdapter.addAll(items);
            mAdapter.notifyDataSetChanged();
        }
    }
}
