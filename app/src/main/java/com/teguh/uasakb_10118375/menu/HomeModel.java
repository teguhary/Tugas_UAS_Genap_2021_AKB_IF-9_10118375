package com.teguh.uasakb_10118375.menu;

/*
    Tanggal Pengerjaan  : 9 Agustus 2021
    NIM                 : 10118375
    Nama                : Teguh Ary Erdiansyah
    Kelas               : IF-9

*/

public class HomeModel {

    String title,alamat,image,deskripsi;

    HomeModel()
    {

    }
    public HomeModel(String title, String alamat, String image, String deskripsi) {
        this.title = title;
        this.alamat = alamat;
        this.image = image;
        this.deskripsi = deskripsi;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}
