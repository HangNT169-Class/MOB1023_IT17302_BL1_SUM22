/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B10_DocGhiFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * 1. Tao class Teacher gom cac thuoc tinh: ten, tuoi,namSinh, diaChi,
     * truongDayHoc. Va cac contrutor, getter, setter. Ghi 5 doi tuong Teacher
     * vao file. Xuat file ra
     */
    public static void main(String[] args) {
//
//        //        try {
////            // Goi ham doc file
////            new Main().ghiFileObjectOutputStream();
////        } catch (IOException ex) {
////            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
////        }
//        try {
//            new Main().docGileObjectInputStream();
//        } catch (Exception ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
//        } 
    }

    // ghiFile
    public void ghiFileObjectOutputStream() throws FileNotFoundException, IOException {
        //  Tao 1 file moi
        File file = new File("test.txt");
        // Kiem tra su ton tai cua file
        if (!file.exists()) {
            try {
                // create file moi
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // add cac phan tu vao list
        List<Teacher> lists = new ArrayList<>();
        // add 5 phan tu vao list
        lists.add(new Teacher("ten1", 10, "2003", "Ha Noi", "FPTPoly"));
        lists.add(new Teacher("ten12", 101, "2005", "Ha Noi", "FPTPoly"));
        lists.add(new Teacher("ten13", 104, "2009", "Ha Noi", "FPTPoly"));
        lists.add(new Teacher("ten14", 106, "2001", "Ha Noi", "FPTPoly"));
        lists.add(new Teacher("ten15", 108, "2002", "Ha Noi", "FPTPoly"));

        // Ghi ra file
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Ghi tung doi tuong vao file
        for (Teacher t : lists) {
            // viet vao file
            oos.writeObject(t);
        }

        // Close file
        oos.close();
        fos.close();
    }

    // doc file
    public void docGileObjectInputStream() throws FileNotFoundException, IOException, ClassNotFoundException {
        //  Tao 1 file moi
        File file = new File("test.txt");
        // Kiem tra su ton tai cua file
        if (!file.exists()) {
            try {
                // create file moi
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // doc file
        FileInputStream fis = new FileInputStream(file);// dung de mo file
        ObjectInputStream ois = new ObjectInputStream(fis);// doc data trong file

        // Tao doi tuong
        Teacher teacherIn = new Teacher();
        List<Teacher> arrListTeachInput = new ArrayList<>();

        // add data file vao list
        while (fis.available() > 0) {
            teacherIn = (Teacher) ois.readObject();
            arrListTeachInput.add(teacherIn);
        }

        // Doc ra man hinh
        for (Teacher teacher : arrListTeachInput) {
            teacher.display();
        }

        // close
        ois.close();
        fis.close();
    }
   
}
