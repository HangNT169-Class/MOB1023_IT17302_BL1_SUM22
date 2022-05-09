/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_ReviewOOP;

/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi {

    private String mssv;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String mssv, double diem, String ten, int tuoi) {
        super(ten, tuoi);
        this.mssv = mssv;
        this.diem = diem;
    }

    public String getMssv() {
        return mssv;
    }

    public double getDiem() {
        return diem;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public void display() {
        System.out.println(this.diem + " - " + this.mssv + " - " + super.getTen() + " - " + super.getTuoi());
    }
}
