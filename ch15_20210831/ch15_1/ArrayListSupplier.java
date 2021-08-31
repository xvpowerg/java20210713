/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210831.ch15_1;
import java.util.function.Supplier;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class ArrayListSupplier 
        implements Supplier<List>{
    public List get(){
        return new ArrayList();
    }
}
