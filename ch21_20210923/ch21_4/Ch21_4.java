/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20210923.ch21_4;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch21_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item i1 = new Item("A1",100);
        Item i2 = new Item("A1",200);
        Item i3 = new Item("B2",600);
        Item i4 = new Item("B2",200);
        Item i5 = new Item("C1",800);
        Item i6 = new Item("C1",900);
        List<Item> list = new ArrayList<>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);
        list.add(i6);
        //相同name的 金額相加
        HashMap<String,Integer> groupMap = new HashMap();
        for (Item v1 : list){            
           groupMap.merge(v1.getName(), 
                   v1.getPrice(), 
                   (ov,nv)->ov+nv);
        }
    System.out.println(groupMap);
        
//        for (Item it : list){
//            int sum = it.getPrice();
//            String name = it.getName();
//            if (groupMap.containsKey(name)){
//               sum +=  groupMap.get(name);
//            }
//            groupMap.put(name, sum);
//        }
//        System.out.println(groupMap);
    }
    
}
