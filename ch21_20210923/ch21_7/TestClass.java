/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20210923.ch21_7;

/**
 *
 * @author xvpow
 */
public class  TestClass<T> {
    private T value;
    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "TestClass{" + "value=" + value + '}';
    }
    
}
