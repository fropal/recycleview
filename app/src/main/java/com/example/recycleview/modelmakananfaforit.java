package com.example.recycleview;

public class modelmakananfaforit {
    private String isi;
    private String deskripsi;
    private String imgid;


    public modelmakananfaforit(String isi, String imgid, String deskripsi){
        this.isi = isi;
        this.imgid = imgid;
        this.deskripsi = deskripsi;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
