/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20210930.ch23_7;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch23_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             ArrayList<ArrayList<String>> list = new ArrayList<>();
             ArrayList<String> a1 = new ArrayList<>();
             ArrayList<String> b2 = new ArrayList<>();
             ArrayList<String> c3 = new ArrayList<>();
             a1.add("A1");
             a1.add("A2");
             a1.add("A3");
             
             b2.add("B1");
             b2.add("B2");
             b2.add("B3");
             
             c3.add("C1");
             c3.add("C2");
             c3.add("C3");
              
             list.add(a1);
             list.add(b2);
             list.add(c3);
               //展開flatMap 內回傳的 stream
             list.stream().flatMap(alis->alis.stream()).
                     forEach(it->System.out.println(it));          
             
    }
    
}
