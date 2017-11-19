package com.katiabravo.newscentral;

/**
 * Created by wendy on 9/15/2017.
 */

public class News {

    String mTitle;
    String mDate;
    String mType;
    String mUrl;

    public News (String type, String title, String date, String url){
        mType = type;
        mTitle = title;
        mDate = date;
        mUrl = url;
    }

    public String getType(){return mType;}
    public String getTitle(){return mTitle;}
    public String getDate(){return mDate;}
    public String getUrl(){return mUrl;}

}
