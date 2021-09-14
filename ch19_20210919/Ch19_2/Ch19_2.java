/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210919.Ch19_2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_2 {

    public static void main(String[] args) {
        //陣列的缺點操作性不足
        //擴充性差
        //變動性差
       //加了泛型 可限定ArrayList內資料的類型
        ArrayList<String> arrayList  = new ArrayList<>();
        arrayList.add("Ken");
        arrayList.add("Vivin");
        arrayList.add("Iris");
        
        
        //取數值
        for(int i = 0;i < arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
        System.out.println();
        System.out.println("==================");
        //foreach
        for (String v : arrayList){
            System.out.print(v+" ");
        }
         System.out.println();
          System.out.println("==================");
       arrayList.forEach(v->System.out.print(v+" "));
    }
    
}
