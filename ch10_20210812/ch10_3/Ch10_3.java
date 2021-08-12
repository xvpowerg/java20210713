/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210812.ch10_3;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        TestCustomerException tce = new TestCustomerException();
        try{
           tce.testAuth("ken");  
        }catch(AuthException ex){
            System.out.println(ex);
        }
        tce.testRange(30, 50);
        
       
    }
    
}
