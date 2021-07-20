/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3_20210720;
import java.util.Arrays;
public class Ch3_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        //一定考!!!!!
        int[] array = {8,11,15,19,7,2};        
        Arrays.sort(array);
        for (int a : array){
            System.out.print(a+" ");
        }
        System.out.println();
        //1 比所有都小一律為-1
         int index = Arrays.binarySearch(array, 1);
        System.out.println(index);
        //2 比所有都大 (陣列長度+1)*-1
           index = Arrays.binarySearch(array, 99);
          System.out.println(index);
        //3 在中間  找比n大一點的長度 * -1
        int n = 13;
           index = Arrays.binarySearch(array, n);
           System.out.println(index);
        //4 找到了       
          index = Arrays.binarySearch(array, 11);
            System.out.println(index);
         System.out.println();
    }
    
}
