/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210805.Ch8_3;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1{
    Test2(){
        this(20,30);
        System.out.println("Test2()");
    }
    Test2(int v1,int v2){

       System.out.printf("Test2 v1:%d,v2:%d%n",v1,v2);
    }
    Test2(int v1,int v2,int v3){
         System.out.printf("Test2 v1:%d,v2:%d,v3:%d %n"
                           ,v1,v2,v3);
    }
}
