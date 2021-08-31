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
public class Ch15_2 {

        static int stringToInt(String data,
                Function<String,Integer> stoi){
            if (data  == null || data.isEmpty()){
                return 0;
            }
            return stoi.apply(data);
        }
    public static void main(String[] args) {
                int len = stringToInt("12345",new StringLenToInt());
                System.out.println(len);
                int value = stringToInt("789",new StringParseInt());
                System.out.println(value);
    }
    
}
