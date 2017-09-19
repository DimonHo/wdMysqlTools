package com.wd.cs.po;

public class DocSoulu {
    private String id;

    private String dguid;

    private String souluId;

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

    public String getSouluId() {
        return souluId;
    }

    public void setSouluId(String souluId) {
        this.souluId = souluId == null ? null : souluId.trim();
    }
}