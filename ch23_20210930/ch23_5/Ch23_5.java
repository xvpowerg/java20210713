/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20210930.ch23_5;

import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch23_5 {

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
      
       Optional<String> op1 = list.stream().parallel().findAny();
       Optional<String> op2 =   list.stream().findFirst();
       System.out.println(op1.get());
       System.out.println(op2.get());
       System.out.println("==================");
       list.stream().limit(3).forEach(n->System.out.println(n));
         System.out.println("==================");
        list.stream().skip(2).forEach(n->System.out.println(n));
    }
    
}
