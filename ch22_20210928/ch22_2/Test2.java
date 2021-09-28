/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch22_20210928.ch22_2;
import java.util.Collection;
import java.util.function.Supplier;
/**
 *
 * @author xvpow
 */
public class Test2 {
    
    public <R> R testFunc(R v){
        return v;
    }
    //產生某種集合
    public static <R extends Collection> R genCollection(Supplier<R> sp){        
        return sp.get();
    }
}
