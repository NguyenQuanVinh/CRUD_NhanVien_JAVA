/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import POJO.BoPhan;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class BoPhanDAO {
    public static ArrayList<BoPhan> layDanhSachBoPhan(){
        ArrayList<BoPhan> dsBP = new ArrayList<BoPhan>();
        try {
            String sql = "SELECT * FROM BOPHAN";
            SQLServerDataProvider provider = new SQLServerDataProvider();
            provider.open();
            ResultSet rs = provider.executeQuery(sql);
            while(rs.next()){
                BoPhan bp = new BoPhan();
                bp.setMaBP(rs.getInt("MABP"));
                bp.setTenBP(rs.getString("TENBP"));
                dsBP.add(bp);
            }
            provider.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsBP;
    }
    
}
