/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210902.Ch16_1;

/**
 *
 * @author xvpow
 */
public class Ch16_1 {
 
    public static void main(String[] args) {
        // TODO code application logic here
        //Ｎ各Item 哪個大
        Item i1 = new Item(10);
        Item i2 = new Item(52);
        Item i3 = new Item(2);
        
        Item[] values = {i1,i2,i3};
         Object obj = MyComparator.max(values);
         System.out.println(obj);
    }
    
}
