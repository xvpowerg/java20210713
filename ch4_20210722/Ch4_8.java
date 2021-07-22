/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4_20210722;

/**
 *
 * @author xvpow
 */
public class Ch4_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String str = "1234";
      int value1 =  Integer.parseInt(str);
      System.out.println(value1);
      //parseInt 只能是純阿拉伯數字
      String str2 = "028852525";
      //.trim() 可去除前後空白
      int value2 =  Integer.parseInt(str2);
        System.out.println(value2);
    }
    
}
