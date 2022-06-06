/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_Thread.DemoGeneric;

/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi {

    private String maSV;
    private double diem;

    public SinhVien(String maSV, double diem, String ten, int tuoi, String diaChi) {
        super(ten, tuoi, diaChi);
        this.maSV = maSV;
        this.diem = diem;
    }

    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public void display() {
        System.out.println(super.getTen() + " - " + super.getTuoi() + " - " + super.getDiaChi() + " - " + maSV + " - " + diem);
    }

}
