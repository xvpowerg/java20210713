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
public class Ch3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //左邊[]數量必須等於右邊[]數量
        int[][] array1 = new int[2][3];
        int[] array2[] = new int[2][3];
        int array3[][] = new int[2][3];
        
        int[][] array4 = new int[2][];
        int[][] array5 = { {1,2,3},
                           {4,5,6}};
        int[][] array6 = {{1,2},
                         {4,5,6,7},
                         {8,9,11}};
        int[][] array7 =  new int[][]{
            {8,9,11,12},
            {17,25},
        };        
         int[][][] array8 = new int[3][2][];
         int[][][] array9 = {{ {1,5,6} ,{9,11} },
                             { { 7,8}}  
                            };
    }
    
}
