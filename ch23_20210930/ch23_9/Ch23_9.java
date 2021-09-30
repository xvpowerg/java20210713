/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20210930.ch23_9;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
/**
 *
 * @author xvpow
 */
public class Ch23_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                ArrayList<String> list = new ArrayList<>();
               list.add("Vivin");
               list.add("Gigi");
               list.add("Lucy");
               list.add("Ken");
               list.add("Iris");
               list.add("Lindy");
               
               //System.out.println("Gigi".substring(0, 1));
               //System.out.println("Gigi".charAt(0)+"");
               //key重複會出錯
//        Map<String,String> dataMap =  
//                list.stream().collect(Collectors.toMap((k)->k.charAt(0)+"", 
//                   (v)->v));
//        System.out.println(dataMap);
  Map<String,String> dataMap2 = list.stream().collect(Collectors.toMap((k)->k.charAt(0)+"", v->v, 
          (nv,ov)->nv+","+ov));
  System.out.println(dataMap2);
  long count = list.stream().count();
  System.out.println(count);
    }
    
}
