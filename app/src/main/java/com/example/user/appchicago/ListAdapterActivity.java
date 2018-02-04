package com.example.user.appchicago;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.concurrent.ExecutionException;

public class ListAdapterActivity extends ListActivity {

    private String[] nameIds = {};
    private String[] tagsIds = {};
    private String[] imageIdsURL = {};

    String res = null;
    Context context;
    private myListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_adapter);

        String[] params_key = {"name", "AQUASPRITES"};
        String[] auth_key = {"Bearer 6BKSy6Yd-CiynSsOtawhQIdppxQgpRVs"};

        Intent intent = getIntent();
        String resURL = intent.getStringExtra("URL");

//        Log.e("log",resURL);

        try{
            res = myJson.Post(resURL, params_key, auth_key[0]);

            JSONArray data = new JSONArray(res);

            nameIds = new String[data.length()];
            tagsIds = new String[data.length()];
            imageIdsURL = new String[data.length()];

            for (int i = 0; i < data.length(); i++) {
                JSONObject jsonObject = data.getJSONObject(i);
//                Bitmap scr = myJson.Download_Image("https://7days.us/" + jsonObject.getString("small_img"));
                nameIds[i] = jsonObject.getString("name");
                tagsIds[i] = jsonObject.getString("tags");

                if (jsonObject.getString("small_img").equals("null")) {
                    imageIdsURL[i] = "https://7days.us/vendor/img/logo7.png";
                } else
                    imageIdsURL[i] = "https://7days.us/" + jsonObject.getString("small_img");
            }


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        mAdapter = new myListAdapter(this);
        setListAdapter(mAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String selection = mAdapter.getString(position);
        Toast.makeText(this, selection, Toast.LENGTH_LONG).show();
    }

    private class myListAdapter extends BaseAdapter {
        private LayoutInflater mLayoutInflater;

        myListAdapter(Context context) {
            mLayoutInflater = LayoutInflater.from(context);
        }

        @Override
        public int getCount() {
            return nameIds.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            if (convertView == null)
                convertView = mLayoutInflater.inflate(R.layout.list_item, null);

            View v = convertView;

            // Then we get reference for Picasso
            ImageView img = (ImageView) v.getTag();
            if (img == null) {
                img = (ImageView) v.findViewById(R.id.imageView);
                v.setTag(img); // <<< THIS LINE !!!!
            }

//            ImageView image = (ImageView) findViewById(R.id.imageView);

//            Log.e("log", imageIdsURL[position]);
            Picasso.with(getApplicationContext())
                    .load(imageIdsURL[position])
                    .placeholder(R.drawable.progress_animation)
                    .into(img);

            TextView signTextView = (TextView) convertView.findViewById(R.id.text_name);
            signTextView.setText(nameIds[position]);

            TextView dateTextView = (TextView) convertView.findViewById(R.id.text_tags);
            dateTextView.setText(tagsIds[position]);

            return convertView;
        }

        String getString(int position) {
            return nameIds[position] + " (" + tagsIds[position] + ")";
        }
    }
}
