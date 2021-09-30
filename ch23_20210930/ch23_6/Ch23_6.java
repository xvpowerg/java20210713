/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20210930.ch23_6;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch23_6 {
    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList<>();
               list.add("Vivin");
               list.add("gigi");
               list.add("Lucy");
               list.add("Ken");
               list.add("Iris");
               
      list.stream().map(s->s.length()).forEach(System.out::println);
      System.out.println("===========================");
      int sum =  list.stream().mapToInt(s->s.length()).sum();
      System.out.println(sum);
    }
    
}
