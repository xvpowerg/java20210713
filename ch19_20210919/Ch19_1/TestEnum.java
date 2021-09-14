/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210919.Ch19_1;

/**
 *
 * @author xvpow
 */
public class TestEnum {
    //enum預設為static  
   enum Fruit{
        Apple,
        Banana,
        Kiwi
    }
   //建立時類似以下方式
//    static class Fruit  extends Enum{
//        static Fruit Apple = new Fruit();
//        static Fruit Banana = new Fruit();
//        static Fruit Kiwi = new Fruit();
//    }
    

    static int price(Fruit f){
        switch(f){
            case Apple:
                return 50;
            case Banana:
                return 10;
            case Kiwi:
                return 20;    
        }
        return 0;
    }
}
