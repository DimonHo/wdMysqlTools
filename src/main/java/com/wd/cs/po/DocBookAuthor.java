package com.wd.cs.po;

public class DocBookAuthor {
    private String id;

    private String dguid;

    private String name;

    private String nameFull;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull == null ? null : nameFull.trim();
    }
}