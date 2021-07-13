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
public class Ch1_7 {

    public static void main(String[] args) {
        int x1 = 0b01010;//10
        int y1 = 0b10100;//20
        //         00101
        //x >> n  x / 2^n 
        System.out.println(y1 >> 1);
         //x < n  x << 2^n 
        System.out.println(y1 << 2);        
        System.out.println(1 << 5);//2^n次方
               
    }    
}
