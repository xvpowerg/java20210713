/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20210930.ch23_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch23_8 {

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
              //希望stream剩下的name當中有i這個單字 
              List<String> filterList = list.stream().filter(n->n.indexOf("i") > -1).
                      collect(Collectors.toList());
              System.out.println(filterList);
             TreeSet<String> treeSet =  list.stream().filter(n->n.indexOf("i") > -1).
                      collect(Collectors.toCollection(TreeSet::new));
             System.out.println(treeSet);
    }
    
}
