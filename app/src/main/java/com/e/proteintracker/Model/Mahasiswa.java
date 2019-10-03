package com.e.proteintracker.Model;

import android.media.Image;

public class Mahasiswa {

    private String nama;
    private String nim;
    private String nohp;
    private String image;
    public Mahasiswa(String nama, String npm, String nohp, String image ) {
        this.nama = nama;
        this.nim = nim;
        this.nohp = nohp;
        this.image = image;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {this.nim = nim; }
    public String getNohp() {
        return nohp;
    }
    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
    public String getImage() { return image; }
    public void setImage(String image) {this.image = image;}
    }

