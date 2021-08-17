/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210817.Ch11_1;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
//子類
public class SubTestOverride extends TestOverride {
     //如果子類拋出的是catched 例外 會有以下規則
    //複寫拋出例外一樣
//     public void testExFunc(boolean thex)throws TestException{
//        System.out.println("SubTestOverride!!");
//        if (thex){
//            throw new TestException("Sub TestException 測試!!");
//        }        
//    }
   
    //也可不拋出
    public void testExFunc(boolean thex){
        System.out.println("SubTestOverride!!");    
    }
   //也可拋出子類
//    public void testExFunc(boolean thex)throws SubTestException{
//       System.out.println("SubTestOverride!!");    
//    } 
 //不可拋父類別的例外   
//    public void testExFunc(boolean thex)throws IOException{
//       System.out.println("SubTestOverride!!");    
//    } 
//***************//  
//RuntimeException 類型的複寫 什麼類型都可拋出
 //在子類別拋出的是uncatched Exception無規則
 //簡化思考:果父類別拋出的是uncatched Exception 
    //那麼子類只能拋出uncatched Exception 所有系列
//    public void testRunttimeExceptionFunc()throws TestRuntimeException{
//        
//    }
    
//     public void testRunttimeExceptionFunc()throws SubTestRuntimeException{
//      
//    }
    //會出錯因為子類拋出的是必要例外檢測(catched)的例外 受到規則管理
//        public void testRunttimeExceptionFunc()throws IOException{
//      
//        }
}
