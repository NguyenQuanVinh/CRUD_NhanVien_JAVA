/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class NguoiDungDAO {
    public static boolean kiemTraDangNhap(String user, String pass){
        boolean kq = false;
        try {
            String sql = String.format("SELECT * FROM NguoiDung WHERE TAIKHOAN = '%s' AND MATKHAU = '%s'", user, pass);
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            if(rs.next()){
                kq=true;
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
}
