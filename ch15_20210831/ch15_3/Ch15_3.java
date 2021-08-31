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
public class Ch15_3 {


    //UnaryOperator<T> 一元運算    
    static void calculateArrayItem(int[] array,UnaryOperator<Integer> uno){
        for (int i =0;i < array.length;i++){
          array[i]   = uno.apply(array[i]);
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        AddOperator op1 = new AddOperator(6);
        int[] array1 = {1,2,3,4,5};
        calculateArrayItem(array1,op1);
        for (int v : array1){
            System.out.println(v);
        }
    }
    
}
