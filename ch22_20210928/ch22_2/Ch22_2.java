/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20210928.ch22_2;
import java.util.ArrayList;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch22_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //方法泛型 自動推斷回傳類型
       Test2 t2 = new Test2();
       int v = t2.testFunc(50);
       String name = t2.testFunc("Ken");
       System.out.println(name);
       
      ArrayList<String>  list =  t2.genCollection(()->new ArrayList<String>());
      TreeSet<Integer> treeSet =  t2.genCollection(()->new TreeSet<Integer>());
       
    }
    
}
