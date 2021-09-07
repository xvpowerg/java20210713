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
public class Ch17_3 {
      //Function 是傳入字串
      static Item  genItem(String name,Function<String,Item> func){
          return func.apply(name);
      }
      
     static String  toUpper(String data,Function<String,String> func){
          return func.apply(data);
      }     
     //Function<Item,String>
     //有一個函數收下Item 回傳 String
     //呼叫Item的方法 回傳 String
      static String  toItemName(Item data,Function<Item,String> func){
          return func.apply(data);
      }
    public static void main(String[] args) {
        Item it = new Item("A1");
        System.out.println(it);
        Item it2 = genItem("B2",n->new Item(n));//使用lambda
        System.out.println(it2);  
        //Item的建構式也是傳入字串
        Item it3 = genItem("C3",Item::new);//使用 method reference
        
        //會嘗試呼叫字串(String)中的toUpperCase方法 因為Function 傳入的是String        
        //可以思考 會呼叫"abc".toUpperCase()
        toUpper("abc",String::toUpperCase);
        Item it4 = new Item("D4");
        
        String name = toItemName(it4,Item::getName);
        System.out.println(name);
//呼叫此函數
        genItem("E5",Item::newItem);
        
        
    }
    
}
