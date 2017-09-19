package com.wd.cs.po;

import java.util.Date;

public class Journal {
    private String id;

    private String journalTitle;

    private Date year;

    private String issn;

    private String eissn;

    private String journalAbb;

    private String isbn;

    private String cssn;

    private Date lastUpdate;

    private Integer isOpen;

    private String indicator;

    private String indicatorValue;

    private String category;

    private String categoryTranslated;

    private Integer core;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJournalTitle() {
        return journalTitle;
    }

    public void setJournalTitle(String journalTitle) {
        this.journalTitle = journalTitle == null ? null : journalTitle.trim();
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn == null ? null : issn.trim();
    }

    public String getEissn() {
        return eissn;
    }

    public void setEissn(String eissn) {
        this.eissn = eissn == null ? null : eissn.trim();
    }

    public String getJournalAbb() {
        return journalAbb;
    }

    public void setJournalAbb(String journalAbb) {
        this.journalAbb = journalAbb == null ? null : journalAbb.trim();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn == null ? null : isbn.trim();
    }

    public String getCssn() {
        return cssn;
    }

    public void setCssn(String cssn) {
        this.cssn = cssn == null ? null : cssn.trim();
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    public String getIndicator() {
        return indicator;
    }

    public void setIndicator(String indicator) {
        this.indicator = indicator == null ? null : indicator.trim();
    }

    public String getIndicatorValue() {
        return indicatorValue;
    }

    public void setIndicatorValue(String indicatorValue) {
        this.indicatorValue = indicatorValue == null ? null : indicatorValue.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getCategoryTranslated() {
        return categoryTranslated;
    }

    public void setCategoryTranslated(String categoryTranslated) {
        this.categoryTranslated = categoryTranslated == null ? null : categoryTranslated.trim();
    }

    public Integer getCore() {
        return core;
    }

    public void setCore(Integer core) {
        this.core = core;
    }
}