package com.chenpan.node;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Genre extends BaseEntity {
    private int gid;
    private String gname;

    public Genre() {
    }

    public Genre(int gid, String gname) {
        this.gid = gid;
        this.gname = gname;
    }

    public int getGid() { return gid; }

    public String getGname() { return gname; }

    public void setGid(int gid) { this.gid = gid; }

    public void setGname(String gname) { this.gname = gname; }
}
