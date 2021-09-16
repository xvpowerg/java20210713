/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210916.Ch20_4;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch20_4 {

    public static void main(String[] args) {
       TreeSet<Item> set = new TreeSet<>();
       Item i1 = new Item(1,"A");
        Item i2 = new Item(11,"B");
        Item i3 = new Item(3,"C");
        Item i4 = new Item(4,"D");
        Item i5 = new Item(8,"F");
        Item i6 = new Item(8,"A");
        set.add(i1);
        set.add(i2);
        set.add(i3);
        set.add(i4);
        set.add(i5);
        set.add(i6);
        set.forEach(it->System.out.print(it+" "));
        
        
    }
    
}
