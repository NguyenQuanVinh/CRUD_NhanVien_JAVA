package POJO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class BoPhan {
    private int maBP;
    private String tenBP;

    public BoPhan() {
    }

    public BoPhan(int maBP, String tenBP) {
        this.maBP = maBP;
        this.tenBP = tenBP;
    }

    public int getMaBP() {
        return maBP;
    }

    public void setMaBP(int maBP) {
        this.maBP = maBP;
    }

    public String getTenBP() {
        return tenBP;
    }

    public void setTenBP(String tenBP) {
        this.tenBP = tenBP;
    }

    @Override
    public String toString() {
        return getTenBP();
    }

    
    
}
