/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B13_Thread;

/**
 *
 * @author hangnt
 */
public class Bai2_DemGioDuAnChay implements Runnable {

    @Override
    public void run() {
        int a = 0;
        while (true) {
            try {
                a++;
                System.out.println(a);
//                System.out.println(setInterval(a));
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                break;
            }
        }
        System.out.println(setInterval(a));
    }

    private String setInterval(int number) {
        //khai báo 3 biến hour, minute, second đại diện cho giờ phút giây
        int hour, minute, second;
        //1h = 3600s -> hour = n / 3600
        hour = number / 3600;
        //1p = 60s, vì ở trên ta đã chia 3600 để lấy giờ
        //vậy nên ta cần lấy phần dư của nó chia cho 60
        minute = number % 3660 / 60;
        //phần dư còn lại chính là số giây
        second = number % 3600 % 60;
        return hour + ":" + minute + ":" + second;
    }
// https://www.tra-loi-cau-hoi-phat-trien-web.com/vi/java/java-chuyen-doi-giay-thanh-ngay-gio-phut-va-giay-bang-timeunit/1068628981/
    public static void main(String[] args) {
        new Bai2_DemGioDuAnChay().run();
    }
}
