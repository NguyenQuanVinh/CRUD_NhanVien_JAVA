package POJO;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class NhanVien extends BoPhan{
    private int maNV;
    private String hinh;
    private String hoTen;
    private String sdt;
    private String ngaysinh;
    private String gioitinh;
    private String diachi;

    public NhanVien() {
    }

    public NhanVien(int maNV, String hinh, String hoTen, String sdt, String ngaysinh, String gioitinh, String diachi) {
        this.maNV = maNV;
        this.hinh = hinh;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public NhanVien(int maNV, String hinh, String hoTen, String sdt, String ngaysinh, String gioitinh, String diachi, int maBP, String tenBP) {
        super(maBP, tenBP);
        this.maNV = maNV;
        this.hinh = hinh;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    

    

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    
            
}
