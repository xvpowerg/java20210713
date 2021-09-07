/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210907.ch17_3;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch17_3_2 {

   static String itemToString(String title,
           Function<String,String> func){
        return func.apply(title);
   }
    public static void main(String[] args) {
        // TODO code application logic here
        Item itemObj = new Item("Ken");
        
                String titleAndName2 = 
                itemToString("Title",t->itemObj.concatTitleAndName(t));
                //非靜態呼叫方式
        String titleAndName = 
                itemToString("Title",itemObj::concatTitleAndName);
        System.out.println(titleAndName);
        
          String titleAndName3 = 
                itemToString("Title",String::toUpperCase);
    }
    
}
