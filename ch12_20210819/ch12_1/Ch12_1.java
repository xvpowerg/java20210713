/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210819.ch12_1;

/**
 *
 * @author xvpow
 */
public class Ch12_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Fruit fruit1 = new  Fruit("Apple",100);
       Fruit fruit2 = fruit1;
       Fruit fruit3 = new  Fruit("Apple",100);
        System.out.println(fruit1);
        System.out.println("水果:"+fruit1);
        //equals 預設使用==
        System.out.println(fruit1 == fruit2);
        System.out.println(fruit1.equals(fruit2) );
        
        System.out.println(fruit1 == fruit3);
        System.out.println(fruit1.equals(fruit3) );
    }
    
}
