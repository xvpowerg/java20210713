/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20210930.ch23_1;
import java.util.ArrayList;
public class Ch23_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      list.add("Vivin");
      list.add("gigi");
      list.add("Lucy");
      list.add("Ken");
      list.add("Iris");
       //allMatch 只要一個條件不符合就短路
     boolean b1 =  list.stream().peek(v->System.out.println(v)).allMatch(n->n.length() > 3);
     System.out.println(b1);
     System.out.println("========================");
     
       //anyMatch 與 noneMatch 只要一個條件符合就短路
       //anyMatch 回傳true
       //noneMatch 回傳false
     boolean b2 =  list.stream().peek(v->System.out.println(v)).anyMatch(n->n.length() > 3);
      System.out.println(b2);
     boolean b3 =  list.stream().peek(v->System.out.println(v)).noneMatch(n->n.length() > 3);
        System.out.println(b3);
    }
    
}
