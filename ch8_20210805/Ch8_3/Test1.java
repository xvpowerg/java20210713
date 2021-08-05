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
public class Test1 {
    Test1(){
        this(12,30);
        System.out.println("Test1()");
    }
    Test1(int v1,int v2){
        System.out.printf("Test1 v1:%d,v2:%d %n",v1,v2);
    }
}
