package com.wd.cs.po;

import java.util.Date;

public class HisJournal {
    private String id;

    private String jguid;

    private String type;

    private String value;

    private Date lastUpdate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJguid() {
        return jguid;
    }

    public void setJguid(String jguid) {
        this.jguid = jguid == null ? null : jguid.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}