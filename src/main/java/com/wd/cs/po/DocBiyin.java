package com.wd.cs.po;

public class DocBiyin {
    private String id;

    private String byJournal;

    private String byTitle;

    private String byAuthor;

    private String byVolume;

    private String byIssue;

    private String byPages;

    private String bySource;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getByJournal() {
        return byJournal;
    }

    public void setByJournal(String byJournal) {
        this.byJournal = byJournal == null ? null : byJournal.trim();
    }

    public String getByTitle() {
        return byTitle;
    }

    public void setByTitle(String byTitle) {
        this.byTitle = byTitle == null ? null : byTitle.trim();
    }

    public String getByAuthor() {
        return byAuthor;
    }

    public void setByAuthor(String byAuthor) {
        this.byAuthor = byAuthor == null ? null : byAuthor.trim();
    }

    public String getByVolume() {
        return byVolume;
    }

    public void setByVolume(String byVolume) {
        this.byVolume = byVolume == null ? null : byVolume.trim();
    }

    public String getByIssue() {
        return byIssue;
    }

    public void setByIssue(String byIssue) {
        this.byIssue = byIssue == null ? null : byIssue.trim();
    }

    public String getByPages() {
        return byPages;
    }

    public void setByPages(String byPages) {
        this.byPages = byPages == null ? null : byPages.trim();
    }

    public String getBySource() {
        return bySource;
    }

    public void setBySource(String bySource) {
        this.bySource = bySource == null ? null : bySource.trim();
    }
}