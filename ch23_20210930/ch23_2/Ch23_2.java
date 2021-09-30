/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20210930.ch23_2;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author xvpow
 */
public class Ch23_2 {

   
    static Optional<String> findName(ArrayList<String> list,String name){
        int index = list.indexOf(name);
        if (index == -1){
            return Optional.empty();
        }
        return Optional.of(name);
    }
    
    public static void main(String[] args) {
      ArrayList<String> list = new ArrayList<>();
      list.add("Vivin");
      list.add("gigi");
      list.add("Lucy");
      list.add("Ken");
      list.add("Iris");
      //System.out.println(findName(list,"Lucy"));
      //System.out.println(findName(list,"Ben"));
      
    Optional<String>  nameOp =   findName(list,"Ben");
    if (nameOp.isPresent()){
        System.out.println(nameOp.get());
    }

      
    }
    
}
