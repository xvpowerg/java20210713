/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210810.Ch9_4;

/**
 *
 * @author xvpow
 */
public class Ch9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //testAge接下來的命令必須在testAge()正確時才能執行
        //不然因該要中斷執行
       TestException.testAge(-200);
       //printAge 必須在testAge 正確時才能執行
        TestException.printAge();
       
    }
    
}
