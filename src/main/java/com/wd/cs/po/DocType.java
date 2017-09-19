package com.wd.cs.po;

public class DocType {
    private String id;

    private String name;

    private String dguid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDguid() {
        return dguid;
    }

    public void setDguid(String dguid) {
        this.dguid = dguid == null ? null : dguid.trim();
    }
}