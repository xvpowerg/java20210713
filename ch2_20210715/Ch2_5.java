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
public class Ch2_5 {
    static int test1(){
        System.out.println("Test1");
        return 1;
    }
    static boolean test2(){
        System.out.println("Test2");
        return true;
    }
     static void test3(){
        System.out.println("Test3");        
    }
    public static void main(String[] args) {
        //1 2 4
        //3 2 4
      /* for (int i = 1 ; i <=5 ; i++  ){
           System.out.println(i);
       }*/
      
        for (int i =test1();i<=3 && test2();i++,test3()){
            System.out.println(i);
        }
        //Test1
        //Test2
        //1
        //Test3
        //Test2
        //2
        //Test3
        //Test2
        //3
        //Test3
        
    }
    
}
