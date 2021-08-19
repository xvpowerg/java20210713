/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20210819.ch12_2;

/**
 *
 * @author xvpow
 */
public class Ch12_2 {
//約8~9成屬性不會是靜態的(static)    
//約5成方法是靜態的(static) 方法內部會使用到類別的屬性 就可使用靜態的
    
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     TestStatic ts1 = new TestStatic();
     TestStatic ts2 = new TestStatic();
     //非static的屬性是獨立的每個屬性不互相影響
     ts1.noStaticValue = "TS1";
     ts2.noStaticValue = "TS2";
 
     //staticValue 是資源共享 所以數值會被修改
     //ts1.staticValue = "staticTest1";
     TestStatic.staticValue = "staticTest1";
     //ts2.staticValue = "staticTest2";
     TestStatic.staticValue = "staticTest2";
     
     System.out.println(ts1.noStaticValue);
     System.out.println(ts2.noStaticValue);
     //最好不要這樣呼叫靜態
     System.out.println(ts1.staticValue);     
     System.out.println(ts2.staticValue);

     //最好這樣呼叫靜態
     System.out.println( TestStatic.staticValue);
     System.out.println( TestStatic.staticValue);
     
   
     
    }
    
}
