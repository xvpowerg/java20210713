/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210831.ch15_4;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class TestEven  implements Predicate<Integer> {
    public boolean test(Integer v){
        if (v % 2 == 0) return true;
        return false;
    }
}
