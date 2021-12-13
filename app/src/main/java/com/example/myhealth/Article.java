package com.example.myhealth;

public class Article {

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
}
