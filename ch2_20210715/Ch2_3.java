/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210715;

/**
 *
 * @author xvpow
 */
public class Ch2_3 {
//字串池   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte[] b = {64,65};
     //
     // 數字< 大寫 < 小寫     
      String name1= "Ken";
      String name2 = "Vivin";
      String name3 = "Ken";
      String name4 = new String("Ken");
                 
       //兩個字串是否相等
       //equals
      System.out.println(name1);
      System.out.println(name2);
      System.out.println(name3);
      System.out.println(name4);
      // == 再參考型態時 比較參考是否一樣
      System.out.println(name1 == name2);
      System.out.println(name1 == name3);   
      System.out.println(name1 == name4); //???  
      //字串時equals 是比較字串的每個字元 使否相等
      System.out.println(name1.equals(name4));
            
      String name5 = "";
      //null 參考型別變數不確定要放什麼時 會使用null
      String name6 = null;      
      //System.out.println(name5.equals(name6));
      if (name6 != null){
        System.out.println(name6.equals(name5));
      }
          
    
      
      
    }
    
}
