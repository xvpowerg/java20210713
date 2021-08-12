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
public class TestCustomerException {
    public void testRange(int a,int max){
        if (a > max){
            throw new NumberRangeException("數字大於"+max);
        }
        
    }
    
    public void testAuth(String user) throws AuthException{
        if (user == null ||!user.equals("ken")){
           throw new AuthException("錯誤的權限");
        }
        
    }
}
