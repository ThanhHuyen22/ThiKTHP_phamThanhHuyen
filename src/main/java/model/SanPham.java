/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class SanPham {

    private int masp;
    private String tensp;
    private int dongia;
    private int maloai;
    private int khuyenmai;
    private String hinh;
    private Date ngaycapnhat;

    
    public SanPham(){
    }

    public SanPham(int masp, String tensp, int dongia, int maloai, int khuyenmai, String hinh, Date ngaycapnhat) {
        this.masp = masp;
        this.tensp = tensp;
        this.dongia = dongia;
        this.maloai = maloai;
        this.khuyenmai = khuyenmai;
        this.hinh = hinh;
        this.ngaycapnhat = ngaycapnhat;
    }

    public int getMasp() {
        return masp;
    }

    public String getTensp() {
        return tensp;
    }

    public int getDongia() {
        return dongia;
    }

    public int getMaloai() {
        return maloai;
    }

    public int getKhuyenmai() {
        return khuyenmai;
    }

    public String getHinh() {
        return hinh;
    }

    public Date getNgaycapnhat() {
        return ngaycapnhat;
    }

    @Override
    public String toString() {
        return "SanPham{" + "masp=" + masp + ", tensp=" + tensp + ", dongia=" + dongia + ", maloai=" + maloai + ", khuyenmai=" + khuyenmai + ", hinh=" + hinh + ", ngaycapnhat=" + ngaycapnhat + '}';
    }
    
}
