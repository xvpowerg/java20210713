/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20210928.ch22_5;
import java.util.ArrayList;
public class Ch22_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ArrayList<String> nameList = new ArrayList();
      nameList.add("Vivin");
      nameList.add("Ken");      
      nameList.add("Iris");
      nameList.add("Joy");
      //所有資料都必須符合條件 回傳true
        boolean b1 = nameList.stream().allMatch(n->n.length() > 2);
        System.out.println(b1);
      //所有資料只要有一條件符合 回傳true
      boolean b2 = nameList.stream().anyMatch(n->n.length() > 3);
         System.out.println(b2);
      //所有資料只要有一條件符合 回傳false
      boolean b3 = nameList.stream().noneMatch(n->n.length() == 1);
        System.out.println(b3);
    }
    
}


