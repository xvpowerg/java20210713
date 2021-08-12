/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210812.ch10_2;
import java.io.IOException;//是FileNotFoundException父類
import java.io.FileNotFoundException;//是IOException子類
import java.sql.SQLException;
//所有的Exception都是 Exception的子類
//直接繼承Exception都是 checked exceptions
//直接繼承RuntimeException都是 unchecked exceptions
/**
 *
 * @author xvpow
 */
public class TestException2 {
    //checked exceptions 如果有多筆例外拋出如何處理
    public void testException(int type)throws 
            IOException,FileNotFoundException,SQLException,Exception{
        switch(type){
            case 1:
                throw new IOException("IOException E1");
            case 2:
              throw new FileNotFoundException("FileNotFoundException E2");  
            case 3:
                 throw new SQLException("SQLException E3");  
            default:
                 throw new Exception("Exception E4");  
        }
    }
}
