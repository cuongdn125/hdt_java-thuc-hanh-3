/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        List<SinhVien> list=new ArrayList<>();
        list.add(new SinhVien("HH654","To ana a",12));
        list.add(new SinhVien("HH654","To ana a",12));
        list.add(new SinhVien("HH654","To ana a",12));
        IOFile.viet("src/object/sv.txt", list);
        List<SinhVien> l=IOFile.doc("src/object/sv.txt");
        for(SinhVien i:l)
            System.out.println(i.toString());
    }
}
