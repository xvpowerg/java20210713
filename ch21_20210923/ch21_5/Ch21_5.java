/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20210923.ch21_5;
import java.util.TreeMap;
public class Ch21_5 {
    public static void main(String[] args) {
        //Key排序 預設 小到大
        TreeMap<Integer,String> treeMap = new TreeMap();
        treeMap.put(10, "Vivin");
        treeMap.put(6, "Join");
        treeMap.put(11, "Lucy");
        treeMap.put(5, "Iris");
        treeMap.put(2, "Ben");
        treeMap.forEach((k,v)->System.out.println(k+":"+v));
        
    }
    
}
