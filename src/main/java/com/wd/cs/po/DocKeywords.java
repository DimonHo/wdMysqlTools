package com.wd.cs.po;

public class DocKeywords {
    private String id;

    private String dguid;

    private String keyword;

    private String rootKeyword;

    private String lowerKeyword;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDguid() {
        return dguid;
    }

    public void setDguid(String dguid) {
        this.dguid = dguid == null ? null : dguid.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getRootKeyword() {
        return rootKeyword;
    }

    public void setRootKeyword(String rootKeyword) {
        this.rootKeyword = rootKeyword == null ? null : rootKeyword.trim();
    }

    public String getLowerKeyword() {
        return lowerKeyword;
    }

    public void setLowerKeyword(String lowerKeyword) {
        this.lowerKeyword = lowerKeyword == null ? null : lowerKeyword.trim();
    }
}