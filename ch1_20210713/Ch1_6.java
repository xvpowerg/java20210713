/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch1_20210713;

/**
 *
 * @author xvpow
 */
public class Ch1_6 {


    public static void main(String[] args) {
       int v1 = 0b10101;
       int v2 = 0b11001;
       int v3 = 0b10001;//且
       int v4 = 0b11101;//或
       
       System.out.println(v1 & v2);
       System.out.println(v1 | v2);
        
        int a = 10,b = 20;
        int tmp  = a;
        a = b;
        b = tmp;
        System.out.println(a+":"+b);
        int x1 = 0b01010;//10
        int y1 = 0b10100;//20
        int z1 = 0b11110;
        System.out.println(x1^y1);
        System.out.println(z1 ^ x1);
         System.out.println(z1 ^ y1);
         
        int x= 10 , y= 20;
        x = x ^ y;
        y = x ^ y;//y = 10
        x = x ^ y;//x = 20
        System.out.println(x+":"+y);
        
       
        
    }
    
}
