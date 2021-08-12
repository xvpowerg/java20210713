/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210812.ch10_4;

/**
 *
 * @author xvpow
 */
public class Ch10_4 {

 
    public static void main(String[] args) {
        Test test1 = new Test("Test");
        try{            
            test1.print(false);            
        }catch(Exception ex){
           System.out.println(ex);
        }finally{
            //一定會呼叫一次
           test1.close();//確保100%一定執行到close 
        }
    }
    
}
