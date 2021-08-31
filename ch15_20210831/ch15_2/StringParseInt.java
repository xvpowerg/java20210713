/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210831.ch15_2;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class StringParseInt implements Function<String,Integer>{
    public Integer apply(String str){
        return Integer.parseInt(str);
    }
}
