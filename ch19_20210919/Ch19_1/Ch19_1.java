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
public class Ch19_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int price = TestEnum.price(TestEnum.Fruit.Banana);
        System.out.println(price);
        
        TestEnum.Fruit f1 = TestEnum.Fruit.Banana;
        System.out.println(f1.name());
        System.out.println(f1.ordinal());
        //無對應的enum名稱會拋出java.lang.IllegalArgumentException
        TestEnum.Fruit f2 = TestEnum.Fruit.valueOf("Kiwi");
        System.out.println(f2);
    }
    
}
