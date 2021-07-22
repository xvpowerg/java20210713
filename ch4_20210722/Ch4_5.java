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
public class Ch4_5 {

    static int factorial(int n){
        if (n==0 || n==1) return 1;        
        return factorial(n-1) * n;
    }
    
    public static void main(String[] args) {
      //5!
      int x = 1;
     for (int i = 1;i<=5;i++){
         x*=i;
     }
     
     System.out.println(x);     
     System.out.println(factorial(5));
    }
    
}
