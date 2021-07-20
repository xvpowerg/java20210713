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
public class Ch3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array2x3 = new int[2][3];
        array2x3[0][0] = 12;
        array2x3[0][1] = 6;
        array2x3[1][1] = 8;
        array2x3[1][2] = 13;
        for (int r = 0;r < array2x3.length;r++){
            for (int c = 0;c < array2x3[r].length;c++){
               System.out.print(array2x3[r][c]+" ");
            }   
            System.out.println();
        }
        //foreach 取值
        for (int[] array : array2x3){
            for (int v : array){
                System.out.print(v+" ");
            }
             System.out.println();
        }
        
    }
    
}
