/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210810.Ch9_1.Ch9_1_2;
import ch9_20210810.Ch9_1.Test1;
public class Test1_2 extends Test1{
    void testValue(){
        System.out.println(protectedVar);
        this.protectedMethod();        
    }
}
