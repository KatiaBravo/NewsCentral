package com.katiabravo.newscentral;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import static android.view.View.Z;

/**
 * Created by wendy on 9/17/2017.
 */

public class NewsAdapter extends ArrayAdapter<News>{

    public NewsAdapter(Context context, List<News> news){
        super(context, 0, news);
    }

    String date;
    String time;
    private static final String DATE_AND_TIME_SEPARATOR = "T";
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView typeTextView = (TextView) listItemView.findViewById(R.id.type_view);
        typeTextView.setText(currentNews.getType());

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_view);
        titleTextView.setText(currentNews.getTitle());

        String originalDateAndTime = currentNews.getDate();

        if (originalDateAndTime.contains(DATE_AND_TIME_SEPARATOR)){
            String[] dateAndTimeParts = originalDateAndTime.split(DATE_AND_TIME_SEPARATOR);
            date = dateAndTimeParts[0];
            time = dateAndTimeParts[1];
        }

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_view);
        dateTextView.setText(date);

        TextView timeTextView = (TextView) listItemView.findViewById(R.id.time_view);
        timeTextView.setText(time);

        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author_view);
        authorTextView.setText(currentNews.getAuthor());

        return listItemView;
    }
}
