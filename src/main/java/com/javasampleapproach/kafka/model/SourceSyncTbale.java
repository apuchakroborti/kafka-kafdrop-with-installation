package com.javasampleapproach.kafka.model;

public class SourceSyncTbale{

    private int id;
    private String tablename;
    private String primarykey;

    public SourceSyncTbale() {
    }

    public SourceSyncTbale(int id, String tablename, String primarykey) {
        this.id = id;
        this.tablename = tablename;
        this.primarykey = primarykey;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public String getPrimarykey() {
        return primarykey;
    }

    public void setPrimarykey(String primarykey) {
        this.primarykey = primarykey;
    }

    public String toString(){
        String info = String.format("{ 'id': %d, 'tablename': %s, 'primarykey': %s}",id, tablename, primarykey);
        return info;
    }
}
