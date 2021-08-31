/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210831.ch15_1;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Supplier;
    /*
    Consumer<T>  消費者
    Supplier<T> 提供者    
    Function<T,R>    轉換
    UnaryOperator<T> 一元運算    
    Predicate<T> 驗證
    */
public class Ch15_1 {
     static List collection(String names,Supplier<List> listSup){         
         String[] nameArray = names.split(",");                 
         List nameList = listSup.get();
         for(String n : nameArray){
             nameList.add(n);
         }
         return nameList;
     }   
    public static void main(String[] args) {
        // TODO code application logic here
      List<String>  nameList = collection("Len,Join,Ben",
              new ArrayListSupplier());
        System.out.println(nameList);
        System.out.println(nameList.get(2));
    }
    
}
