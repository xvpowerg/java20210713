/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210916.Ch20_2;

import java.util.HashSet;

/**
 *
 * @author xvpow
 */
public class Ch20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item i1 = new Item(1,"A");
        Item i2 = new Item(2,"B");
        Item i3 = new Item(3,"C");
        Item i4 = new Item(4,"D");
        Item i5 = new Item(3,"C");
        
        HashSet<Item> set = new HashSet<>();
        set.add(i1);
        set.add(i2);
        set.add(i3);
        set.add(i4);
        set.add(i5);
        //i5 跟 i3如何判斷是否一樣?
        set.forEach(it->System.out.print(it+" "));
        //HashCode 可用來預先處裡兩物件是否相等
        //HashCode 相等物件相等機率大
        //HashCode 不相等物件一定不相等
        System.out.println(i3.equals(i5));
    }
    
}
