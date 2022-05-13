/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_ReviewOOP_Tiep;

/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi {

    private String mssv;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String mssv, double diem, String ten, int tuoi, String diaChi) {
        super(ten, tuoi, diaChi);
        this.mssv = mssv;
        this.diem = diem;
    }

    @Override
    public void display(String ten1) {
        System.out.println("Sinh vien");
    }
}
