/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210916.Ch20_3;
import java.util.TreeSet;
public class Ch20_3 {
    public static void main(String[] args) {
        // TODO code application logic here        
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        //每次add做排序 預設是小到大
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(26);
        treeSet.add(8);
        treeSet.add(2);
            
        treeSet.forEach(v->System.out.print(v+" "));
        
        int first = treeSet.first();
        int last = treeSet.last();
        System.out.println();
        System.out.println(first);
        System.out.println(last);
        System.out.println("====================");
        int floor = treeSet.floor(7);
        System.out.println("floor:"+floor);
        int lower = treeSet.lower(7);
        System.out.println("lower:"+lower);
        
        floor = treeSet.floor(8);//n <=8
        System.out.println("floor:"+floor);
        lower = treeSet.lower(8);//n < 8
         System.out.println("lower:"+lower);
        
          int ceiling = treeSet.ceiling(8); //n>=8
          int higher = treeSet.higher(8);//n>8
          System.out.println("ceiling:"+ceiling);
          System.out.println("higher:"+higher);
          
          Integer v  = treeSet.ceiling(100); //找不到會回傳null
          System.out.println("ceiling:"+v);
      
        
    }
    
}
