/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_Thread;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Bai1 implements Runnable {

    @Override
    public void run() {
        // code
        // Show Dong ho co dang gio phut giay
        while (true) {
            try {
                Calendar cal = Calendar.getInstance(); // lay ra moi thong tin cua h phut giay cua he thong
                int h = cal.get(Calendar.HOUR);
                int m = cal.get(Calendar.MINUTE);
                int s = cal.get(Calendar.SECOND);
                System.out.println(h + ":" + m + ":" + s);
                Thread.sleep(1000); // ngoai le ngat
            } catch (InterruptedException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    public static void main(String[] args) {
        new Bai1().run();
    }
}
