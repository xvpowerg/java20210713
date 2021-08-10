/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210810.Ch9_1.Ch9_1_2;
import ch9_20210810.Ch9_1.Test1;
public class Ch9_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //因為不在同一個package所以要import
       Test1 t1 = new Test1();
       System.out.println(t1.publicVar);
       Test1_2 obj = new Test1_2();
       obj.testValue();
       
       t1.publicMethod();
       
    }
    
}
