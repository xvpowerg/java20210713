/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210831.ch15_3;
import java.util.function.UnaryOperator;
/**
 *
 * @author xvpow
 */
public class AddOperator implements UnaryOperator<Integer> {
    private int n;
    public AddOperator(int number){
        n = number;
    }
    public Integer apply(Integer v){
        return v + n;
    }
}
