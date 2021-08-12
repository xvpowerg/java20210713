/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210812.ch10_1;

/**
 *
 * @author xvpow
 */
public class Ch10_1 {

    public static void main(String[] args){
       
        TestException te = 
                new TestException();
        System.out.println("Run Start");
           //try catch 有一種群組的感覺 當testCatchException 發生例外就不執行
           //testCatchException方法之後的命令 因為被try包住 並且擷取到了Exception
           //所以Other可輸出
           
       try{              
             te.testCatchException(false);
            System.out.println("Run End");//如果有例外就不執行          
        }catch(Exception ex){
            System.out.println(ex);
        }       
       //可try 可不try 因為拋出的是unchecked Exception
        System.out.println("Other");//不管是否拋出例外都執行
        try{
              te.testUncheckedException(true);
       }catch(ArithmeticException e){
            System.out.println(e);
        }
      
    }
    
}
