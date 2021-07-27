/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_202107227;

/**
 *
 * @author xvpow
 */
public class Ch5_6 {

    static void swapArray(int[] array ){
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }
    public static void main(String[] args) {
      int[] array = {5,6};
      System.out.println(array[0]+":"+array[1]);
      swapArray(array);
//      int tmp = array[0];
//      array[0] = array[1];
//      array[1] = tmp;
      System.out.println(array[0]+":"+array[1]);
      
    }
    
}
