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
public class Ch1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        int a=10,b=20,c=30;
        //且運算
        if (a < b && c > x++){
            System.out.println("Test1");
        }else{
            System.out.println("Test2");
        } 
        System.out.println(x);
        
            //且短路一定是false  左邊為false時 則短路(不往右邊執行)
        if (a > b && c > x++){
            System.out.println("Test1");
        }else{
            System.out.println("Test2");
        } 
        System.out.println(x);
        /*
        int x = 0;
        int a=10,b=20,c=30;
        
        */
        //或的短路一定是true 
        if (a > b || c > ++a ){
            System.out.println("Test3");
        }else{
            System.out.println("Test4");
        }
        System.out.println(a);
         //或的短路一定是true 只要左邊為true就不往右邊 
         if (a < b || c > ++a ){
            System.out.println("Test3");
        }else{
            System.out.println("Test4");
        }
         System.out.println(a);
    }
    
}
