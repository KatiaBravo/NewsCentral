package com.katiabravo.newscentral;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by wendy on 9/17/2017.
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {
    private String mUrl;

    public NewsLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }
    @Override
    protected void onStartLoading() { forceLoad(); }

    @Override
    public List<News> loadInBackground() {
        if (mUrl== null) {
            return null;
        }

        List<News> news = QueryUtils.fetchNews(mUrl);

        return news;
    }
}
