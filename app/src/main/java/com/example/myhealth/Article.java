package com.example.myhealth;

import android.os.Parcel;
import android.os.Parcelable;

public class Article implements Parcelable {

    public String header;
    public String articleBody;

    public Article(String header, String articleBody) {
        this.header = header;
        this.articleBody = articleBody;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getArticleBody() {
        return articleBody;
    }

    public void setArticleBody(String articleBody) {
        this.articleBody = articleBody;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.header);
        dest.writeString(this.articleBody);
    }

    public void readFromParcel(Parcel source) {
        this.header = source.readString();
        this.articleBody = source.readString();
    }

    protected Article(Parcel in) {
        this.header = in.readString();
        this.articleBody = in.readString();
    }

    public static final Parcelable.Creator<Article> CREATOR = new Parcelable.Creator<Article>() {
        @Override
        public Article createFromParcel(Parcel source) {
            return new Article(source);
        }

        @Override
        public Article[] newArray(int size) {
            return new Article[size];
        }
    };
}
