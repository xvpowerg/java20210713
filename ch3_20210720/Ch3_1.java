/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210720;
import java.util.stream.IntStream;
/**
 *
 * @author xvpow
 */
public class Ch3_1 {

    public static void main(String[] args) {
       int[] array1 = new int[5];
        array1[0] = 10;
        array1[1] = 7;
        array1[4] = 12;
       
        IntStream.of(array1).forEach(v->System.out.print(v+" "));
        
        
        for (int i =0;i < array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println("================");
        //foreach
        for (int v : array1){
            System.out.print(v+ " ");
        }
        System.out.println("================");
         
   
        //System.out.println(array1);
        //System.out.println("End!!");
    }
    
}
