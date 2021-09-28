/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20210928.ch22_1;
import java.util.Collection;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
//T extends 某個類別 有繼承Collection 才可做為datas的類型
public class Test1<E,T extends Collection<E>> {
    private T datas;
    public void  steCollection(T x){
        datas = x;        
    }
    public void addValue(E e){
        datas.add(e);        
    }
    public T getCollection(){
        System.out.println("取得");
        return datas;
    }
    public void foreach(Consumer<E> c){
        datas.forEach(c);
    }
}
