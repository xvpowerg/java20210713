/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_202107227;
public class Ch5_2 {
    public static void main(String[] args) {
//      Integer value = null;
//      int v1 = value + 5;
//      System.out.println(v1);
        Integer value1 = Integer.valueOf(20);
        Integer value2 = Integer.valueOf(20);
        System.out.println(value1 == value2);
        Integer value3 = 128;
        Integer value4 = 128;
        System.out.println(value3 == value4);//false 因為超過byte範圍
        //1 byte -128~127 java認為這段數值最常用 於有把他暫存一組byte區間的Integer
    }
    
}
