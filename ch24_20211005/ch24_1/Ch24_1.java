/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20211005.ch24_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class Ch24_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Iris");
        list.add("Ken");
        list.add("Vivin");
        list.add("Ben");
        list.add("Lindy");
        list.add("Joy");
        list.add("Lucy");
   
       Map<Integer,List<String>> group = 
               list.stream().collect(Collectors.groupingBy(n->n.length()));
       System.out.println(group);
        Map<Integer,Long> groupCount = 
                list.stream().collect(
                        Collectors.groupingBy(n->n.length(),Collectors.counting()));
        System.out.println(groupCount);
        //分隔 開頭 結尾
        String msg = list.stream().collect(Collectors.joining(",", "name:", "."));
        System.out.println(msg);
    }
    
}
