/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.NhanVien;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class NhanVienDAO {
    public static ArrayList<NhanVien> layDanhSachNhanVien(String keys){
        ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
        String sql;
        try {
            if(keys.isEmpty()){
                 sql = "SELECT * FROM NHANVIEN nv, BOPHAN bp WHERE nv.MABP = bp.MABP";
            }else{
                 sql = "SELECT * FROM NHANVIEN nv, BOPHAN bp WHERE nv.MABP = bp.MABP AND (MANV LIKE N'%"+ keys +"%' OR HOTENNV LIKE N'%"+ keys +"%' OR TENBP LIKE N'%"+ keys +"%')";
                 
            }
            
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getInt("MANV"));
                nv.setMaBP(rs.getInt("MABP"));
                nv.setHinh(rs.getString("HINH"));
                nv.setHoTen(rs.getString("HOTENNV"));
                nv.setSdt(rs.getString("SDT"));
                nv.setNgaysinh(rs.getString("NGAYSINH"));
                nv.setGioitinh(rs.getString("GIOITINH"));
                nv.setDiachi(rs.getString("DIACHI"));
                nv.setTenBP(rs.getString("TENBP"));
                dsNV.add(nv);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsNV;
    }
    
    public static boolean themNhanVien(int maBP, String hinh, String ten, String sdt, String ngaysinh, String gioitinh, String dc){
        boolean kq = false;
        String sql = String.format("INSERT INTO NHANVIEN(MABP,HINH,HOTENNV,SDT,NGAYSINH,GIOITINH,DIACHI) VALUES(%d,N'%s',N'%s','%s','%s',N'%s',N'%s')",
                maBP,hinh, ten, sdt,ngaysinh,gioitinh,dc);
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if(n==1){
            kq=true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean capnhatNhanVien(NhanVien nv){
        boolean kq = false;
        String sql = String.format("UPDATE NHANVIEN SET MABP = %d, HINH=N'%s', HOTENNV=N'%s', SDT='%s', NGAYSINH='%s', GIOITINH=N'%s', DIACHI = N'%s' WHERE MANV=%d", nv.getMaBP(), nv.getHinh(),
                nv.getHoTen(), nv.getSdt(),nv.getNgaysinh(),nv.getGioitinh(),nv.getDiachi(), nv.getMaNV());
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if(n==1){
            kq=true;
        }
        provider.close();
        return kq;
    }
    
    public static boolean xoaNhanVien(int maNV){
        boolean kq = false;
        String sql = String.format("DELETE FROM NHANVIEN WHERE MANV = %d", maNV);
        SQLServerDataProvider provider = new SQLServerDataProvider();
        provider.open();
        int n = provider.executeUpdate(sql);
        if(n==1){
            kq=true;
        }
        provider.close();
        return kq;
    }
    
}
