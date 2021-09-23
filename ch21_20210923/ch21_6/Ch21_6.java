/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20210923.ch21_6;
import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch21_6 {
        public static void main(String[] args) {
            Item i1 = new Item("A1",100);
            Item i2 = new Item("A1",200);
            Item i3 = new Item("B2",600);
            Item i4 = new Item("B2",200);
            Item i5 = new Item("C1",800);
            Item i6 = new Item("C1",900);  
            Comparator<Item> cmp = Comparator.comparing(it->it.getPrice());
            cmp = cmp.thenComparing(it->it.getName());
            TreeMap<Item,String> map = new TreeMap(cmp);
            map.put(i1, "cp001");
            map.put(i2, "cp002");
            map.put(i3, "cp003");
            map.put(i4, "cp004");
            map.put(i5, "cp005");
            map.put(i6, "cp006");
            System.out.println(map);            
        }
}
