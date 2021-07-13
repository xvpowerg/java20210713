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
public class Ch1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int a = 0;
     System.out.println(++a);
     System.out.println(a++);
     System.out.println(a);
     
     int b = 0;
     int x = ++b + ++b + b-- + b++;
     //       1  + 2   + 2  +  1 
     System.out.println(x);
     System.out.println(b);
        
    }
    
}
