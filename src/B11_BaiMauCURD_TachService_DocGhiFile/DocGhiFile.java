/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_BaiMauCURD_TachService_DocGhiFile;

import B10_DocGhiFile.Main;
import B10_DocGhiFile.Teacher;
import java.io.File;
import java.io.FileInputStream;
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
public class DocGhiFile {

    public String ghiFile(String path, List<SinhVien> lists) {
        try {
            File file = new File(path);
            // Kiem tra su ton tai cua file
            if (!file.exists()) {
                file.createNewFile();
            }
            // Ghi ra file
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // Ghi tung doi tuong vao file
            for (SinhVien t : lists) {
                // viet vao file
                oos.writeObject(t);
            }
            // Close file
            oos.close();
            fos.close();
            return "Ghi file thanh cong";
        } catch (Exception e) {
            return "Ghi file khong thanh cong";
        }
    }

    public String docFile(String path, List<SinhVien> lists) {
        try {
            //  Tao 1 file moi
            File file = new File(path);
            // Kiem tra su ton tai cua file
            if (!file.exists()) {
                return "File khong ton tai";
            }

            // doc file
            FileInputStream fis = new FileInputStream(file);// dung de mo file
            ObjectInputStream ois = new ObjectInputStream(fis);// doc data trong file

            // Tao doi tuong
            SinhVien sinhVien = new SinhVien();

            // add data file vao list
            while (fis.available() > 0) {
                sinhVien = (SinhVien) ois.readObject();
                lists.add(sinhVien);
            }
            // close
            ois.close();
            fis.close();
            return "Doc File Thanh Cong";
        } catch (Exception e) {
            return "Doc file that bai";
        }
    }
}
