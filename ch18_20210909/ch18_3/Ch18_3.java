/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210909.ch18_3;

/**
 *
 * @author xvpow
 */
public class Ch18_3 {
    public void testFunc(){
        System.out.println("testFunc!!");
    }
     public static void testStaticFunc(){
        System.out.println("testStaticFunc!!");
    }
     
     private int count;
     private String name;
    //非靜態內部類可呼叫外部類的所有方法與屬性
    class Test1{
        String name;
        public void run(){
            testFunc();
            testStaticFunc();
            count++;
            //呼叫外部類的name
            //內部類與外部類名稱衝突時
            Ch18_3.this.name = "runing....";
        }
    }
    //靜態內部類可呼叫外部類的靜態方法與屬性
    static class Test2{
            public void run(){
             //testFunc();
            testStaticFunc();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Test2 t2 = new Test2();
        t2.run();
    }
    
}
