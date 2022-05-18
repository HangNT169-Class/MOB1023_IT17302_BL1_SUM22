/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5_OverviewList;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class MangDong {

    public static void main(String[] args) {
        // Tu cap nhap size cho cac phan tu trong mang
        ArrayList<String> lists = new ArrayList<>();
        System.out.println(lists.size());
        lists.add("s1");
        System.out.println(lists.size());
        List<String> list = new ArrayList<>();
        list.add("s1");
        list.add("s2");
        list.add("s3");
        System.out.println(list);
    }
}
