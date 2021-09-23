/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20210923.ch21_7;

/**
 *
 * @author xvpow
 */
public class Ch21_7 {
    //泛型建立物件時定義變數的類型
    public static void main(String[] args) {
        TestClass<String> tclass = new TestClass();
        tclass.setValue("Vivin");
        String value = tclass.getValue();
        System.out.println(value);
        
            TestClass<Integer> tclass2 = new TestClass(); 
            tclass2.setValue(100);
    }
    
}
