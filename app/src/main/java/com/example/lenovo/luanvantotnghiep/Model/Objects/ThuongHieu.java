package com.example.lenovo.luanvantotnghiep.Model.Objects;

/**
 * Created by Lenovo on 6/22/2017.
 */

public class ThuongHieu {
    int maThuongHieu;
    String tenThuongHieu, hinhThuongHieu;
    int luotMua;

    public ThuongHieu() {
    }

    public ThuongHieu(int maThuongHieu, String tenThuongHieu, String hinhThuongHieu, int luotMua) {
        this.maThuongHieu = maThuongHieu;
        this.tenThuongHieu = tenThuongHieu;
        this.hinhThuongHieu = hinhThuongHieu;
        this.luotMua = luotMua;
    }

    public int getMaThuongHieu() {
        return maThuongHieu;
    }

    public void setMaThuongHieu(int maThuongHieu) {
        this.maThuongHieu = maThuongHieu;
    }

    public String getTenThuongHieu() {
        return tenThuongHieu;
    }

    public void setTenThuongHieu(String tenThuongHieu) {
        this.tenThuongHieu = tenThuongHieu;
    }

    public String getHinhThuongHieu() {
        return hinhThuongHieu;
    }

    public void setHinhThuongHieu(String hinhThuongHieu) {
        this.hinhThuongHieu = hinhThuongHieu;
    }

    public int getLuotMua() {
        return luotMua;
    }

    public void setLuotMua(int luotMua) {
        this.luotMua = luotMua;
    }
}
