/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210916.Ch20_1;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
public class Ch20_1 {
    public static void main(String[] args) {
      //Set 不會有重複
      //Set 會依不同Set決定順序
      
      //無順序的 指的是 取出時的順序不是放入時的順序
      
        Set<String> set1 = new HashSet<>();
        set1.add("Doris");
        set1.add("Joy");
        set1.add("Iris");
        set1.add("Iris");
        set1.add("Andy");
        
        set1.forEach(v->System.out.print(v+" "));
        System.out.println();
        System.out.println("====================");
        for (String n : set1){
            System.out.print(n+" ");    
        }
          System.out.println();
        System.out.println("====================");
        
        //Set是否存在某物件
        System.out.println(set1.contains("Joy"));
        System.out.println(set1.contains("Ken"));
        
        //Set to List
        ArrayList<String> list = new ArrayList();
        list.addAll(set1);
        System.out.println(list);        
    }
    
}
