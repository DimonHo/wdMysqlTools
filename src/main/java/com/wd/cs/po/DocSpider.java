package com.wd.cs.po;

public class DocSpider {
    private String id;

    private String spiderTitle;

    private String spiderAuthor;

    private String spiderAbstract;

    private String spiderSource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSpiderTitle() {
        return spiderTitle;
    }

    public void setSpiderTitle(String spiderTitle) {
        this.spiderTitle = spiderTitle == null ? null : spiderTitle.trim();
    }

    public String getSpiderAuthor() {
        return spiderAuthor;
    }

    public void setSpiderAuthor(String spiderAuthor) {
        this.spiderAuthor = spiderAuthor == null ? null : spiderAuthor.trim();
    }

    public String getSpiderAbstract() {
        return spiderAbstract;
    }

    public void setSpiderAbstract(String spiderAbstract) {
        this.spiderAbstract = spiderAbstract == null ? null : spiderAbstract.trim();
    }

    public String getSpiderSource() {
        return spiderSource;
    }

    public void setSpiderSource(String spiderSource) {
        this.spiderSource = spiderSource == null ? null : spiderSource.trim();
    }
}