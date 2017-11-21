package com.katiabravo.newscentral;

/**
 * Created by wendy on 9/15/2017.
 */

public class News {

    String mTitle;
    String mDate;
    String mType;
    String mUrl;
    String mAuthor;

    public News (String type, String title, String date, String url, String author){
        mType = type;
        mTitle = title;
        mDate = date;
        mUrl = url;
        mAuthor = "By: " + author;
    }

    public String getType(){return mType;}
    public String getTitle(){return mTitle;}
    public String getDate(){return mDate;}
    public String getUrl(){return mUrl;}
    public String getAuthor(){return mAuthor;}

}
