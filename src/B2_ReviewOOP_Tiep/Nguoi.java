/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_ReviewOOP_Tiep;

/**
 *
 * @author hangnt
 */
public class Nguoi {

    private String ten;
    private int tuoi;
    private String diaChi;

    public Nguoi() {
    }

    public Nguoi(String ten, int tuoi, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }
    // gettter

    // setter
    // display
    public void display(String s) {
        System.out.println("Nguoi");
    }
}
