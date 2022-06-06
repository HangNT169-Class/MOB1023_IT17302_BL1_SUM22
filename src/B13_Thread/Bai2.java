/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hangnt
 */
public class Bai2 implements Runnable{

    @Override
    public void run() {
        // code
        int count = 0;
        while (true) {            
            try {
                count ++;
                System.out.println(count);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Bai2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args) {
        new Bai2().run();
    }
}
