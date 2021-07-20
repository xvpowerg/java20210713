/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210720;

/**
 *
 * @author xvpow
 */
public class Ch3_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] array3xn = new int[3][];
       array3xn[0] = new int[3];
      // array3xn[1] = new int[2];//沒此段程式碼NullPointerException
       array3xn[2] = new int[3];
       //array3xn[0][2] = 10;//java.lang.ArrayIndexOutOfBoundsException
       array3xn[1][1] = 8;//java.lang.NullPointerException
       array3xn[2][0] = 9;
       array3xn[2][1] = 15;
       
       for (int[] array : array3xn){
           for (int v : array){
               System.out.print(v+" ");
           }
           System.out.println();
       }
       
    }
    
}
