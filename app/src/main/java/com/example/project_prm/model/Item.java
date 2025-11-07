package com.example.project_prm.model;

public class Item {
    int idsp;
    String tensp;
    int soluong;
    String hinhanh;

    public Item() {
    }

    public Item(int idsp, String tensp) {
        this.idsp = idsp;
        this.tensp = tensp;
    }

    public int getIdsp() {
        return idsp;
    }

    public void setIdsp(int idsp) {
        this.idsp = idsp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }
}
