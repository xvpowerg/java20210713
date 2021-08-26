/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210824.ch3_4;



public class Ch13_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test2();
        t1.func1();
        t1.func2();
        //建議實作上使用以下寫法
        //Test1.func2();
        //Test2.func2();
    }
    
}
