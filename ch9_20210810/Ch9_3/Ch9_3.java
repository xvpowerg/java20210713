/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210810.Ch9_3;

/**
 *
 * @author xvpow
 */
public class Ch9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Test1 t1 = new Test2();
        
        Test1 rValue =  t1.testReturnObj();
        System.out.println(rValue);        
        t1.testParameter(Integer.valueOf(1));
        t1.testParameter("AAA");
        //==============我想呼叫 testParameter(String obj)怎麼做????
    }
    
}
