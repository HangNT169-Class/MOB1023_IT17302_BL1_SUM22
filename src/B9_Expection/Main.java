/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_Expection;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * 1. Khi nao xay ra expection 2. Nhung cach xu ly khi xay expection 3.Huong
     * dan tu custom 1 expection
     */
    // https://github.com/AnhDT0407/Course-JavaCore/blob/master/Java-Lesson/Java%208/1.%20Lamda%20Expressions/3.%20So%20s%C3%A1nh%20m%E1%BA%A1nh%20m%E1%BA%BD%20v%E1%BB%9Bi%20Lambda.md
    // https://openplanning.net/10175/java-regular-expression
    // https://github.com/HangNT164/FPTUniversity_Project
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap tuoi :");

//        try {
//            // Nhung dong nghi ngo xay ra loi => vut vao try
//            int tuoi = sc.nextInt();
//        } catch (Exception e) {
//            // Khi xay ra loi => Lam dieu gi
//            System.out.println("Nhap sai dinh dang cua tuoi");
//        }
//        int a[] = {4, 5, -2, 0, 1};
//        try {
//            System.out.println(a[10]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // Khi xay ra loi => lam gi
//            System.out.println("Mang k chua du 10 phan tu ");
//        } finally {
//            // Moi thu thanh cong hoac that bai deu vao day
//            System.out.println("Buoc cuoi roi");
//        }
// https://gpcoder.com/2461-custom-exception-trong-java/#:~:text=Custom%20Exception%20l%C3%A0%20ngo%E1%BA%A1i%20l%E1%BB%87,ngo%E1%BA%A1i%20l%E1%BB%87%20ri%C3%AAng%20cho%20m%C3%ACnh.
        try {
            System.out.println("Hien thi");
            throw new MyExpection("Custom error");
        } catch (MyExpection e) {
            System.out.println(e.getMessage());
        }
    }
}
