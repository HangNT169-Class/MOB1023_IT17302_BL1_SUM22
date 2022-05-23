/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B7_BaiMauCURD_TachService;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class SinhVienService {

    public void sortByName(List<SinhVien> lists) {
        lists.sort((o1, o2) -> {
            return o1.getTen().compareTo(o2.getTen());
        });
    }

    public List<SinhVien> searchByName(List<SinhVien> listSinhViens, String name) {
        List<SinhVien> listSearch = new ArrayList<>();
        // code
        for (SinhVien sv : listSinhViens) {
            if (sv.getTen().contains(name)) {
                listSearch.add(sv);
            }
        }
        return listSearch;
    }
}
