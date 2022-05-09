/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B1_ReviewOOP;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Review OOP 1. Tinh dong goi: - public, protected, default,private 2. Tinh
     * ke thua - Cha, con: extends Dac trung cua 1 doi tuong: thuoc tinh(cac
     * bien) va phuong thuc(cac ham)
     */
    /**
     * Bai tap: Tao 1 class Nguoi gom 2 thuoc tinh ten-String,tuoi-int va cac
     * phuong thuc mac dinh contructor co va khong tham so, getter, setter Tao 1
     * class SinhVien ke thua tu class Nguoi va them thuoc tinh mssv-String,
     * diem-double va cac phuong thuc mac dinh contructor , getter, setter,
     * display():void Nhap vao 1 sinh vien va in thong tin ra.
     */
    public static void main(String[] args) {
        // nhap thong tin cua 1 doi tuong
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten:");
        String ten = scanner.nextLine();
        System.out.print("Nhap tuoi:");
        int tuoi = Integer.valueOf(scanner.nextLine());
        System.out.print("Nhap mssv:");
        String mssv = scanner.nextLine();
        System.out.print("Nhap diem:");
        double diem = Double.valueOf(scanner.nextLine());

        // khoi tao 1 doi tuong
//        SinhVien sinhVien = new SinhVien();
//        // c1: Dung set: de gan gia tri cua thuoc tinh cho doi tuong
//        sinhVien.setDiem(diem);
//        sinhVien.setMssv(mssv);
//        sinhVien.setTen(ten);
//        sinhVien.setTuoi(tuoi);
        // c2: Su dung contructor full tham so de gan gia tri
        SinhVien sinhVien = new SinhVien(mssv, diem, ten, tuoi);
        sinhVien.display();
    }

}
