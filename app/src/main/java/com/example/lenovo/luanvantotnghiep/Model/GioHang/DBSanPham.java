package com.example.lenovo.luanvantotnghiep.Model.GioHang;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Lenovo on 10/14/2017.
 */

public class DBSanPham extends SQLiteOpenHelper {

    public static String TB_GIOHANG = "GIOHANG";
    public static String TB_GIOHANG_MASP = "MASP";
    public static String TB_GIOHANG_TENSP = "TENSP";
    public static String TB_GIOHANG_GIATIEN = "GIATIEN";
    public static String TB_GIOHANG_HINHANH = "HINHANH";

    public static String TB_YEUTHICH = "YEUTHICH";
    public static String TB_YEUTHICH_MASP = "MASP";
    public static String TB_YEUTHICH_TENSP = "TENSP";
    public static String TB_YEUTHICH_GIATIEN = "GIATIEN";
    public static String TB_YEUTHICH_HINHANH = "HINHANH";

    public DBSanPham(Context context) {
        super(context, "DBSANPHAM", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String tbGioHang = "CREATE TABLE "+TB_GIOHANG+" ("+TB_GIOHANG_MASP+" TEXT PRIMARY KEY, "+TB_GIOHANG_TENSP+" TEXT," +
                " "+TB_GIOHANG_GIATIEN+" REAL, "+TB_GIOHANG_HINHANH+" BLOB);";

        String tbYeuThich = "CREATE TABLE "+TB_YEUTHICH+" ("+TB_YEUTHICH_MASP+" TEXT PRIMARY KEY, "+TB_YEUTHICH_TENSP+" TEXT," +
                " "+TB_YEUTHICH_GIATIEN+" REAL, "+TB_YEUTHICH_HINHANH+" BLOB);";

        db.execSQL(tbGioHang);
        db.execSQL(tbYeuThich);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
