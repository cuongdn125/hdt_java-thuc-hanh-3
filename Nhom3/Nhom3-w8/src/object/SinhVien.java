package object;

import java.io.Serializable;


public class SinhVien implements Serializable{
    private String ma,ten;
    private int tuoi;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, int tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return ma+"\t"+ten+"\t"+tuoi;
    }
    
}
