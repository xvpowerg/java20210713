/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210810.Ch9_3;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
        //因為父類別回傳值是int所以 複寫回傳值只能用int
       public int testReturn(int a,int b){
        return a+b;
    }       
        public Test2 testReturnObj(){
         return new Test2();
     }
     @Override
     public void testParameter(Object obj){
         System.out.println("Test2 testParameter Object:"+obj);
     }
        //如果參數不一樣這時是多載(Overloading)
     //@Override
     public void testParameter(String obj){
         System.out.println("Test2 testParameter String:"+obj);
     }
}
