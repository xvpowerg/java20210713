/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch16_20210902.Ch16_5;

/**
 *
 * @author xvpow
 */
public class Ch16_5 {        
    static void testLambda(ShowValue sv){
        sv.print();
    }    
  static void testLambda2(OneParameter op){
        op.test("Value!!");
    }  
    static void testLambda3(TwoParameter op){
        op.test("Value1!!","Value2");
    }  
    public static void main(String[] args) {
        // TODO code application logic here
        //只有Functional Interface才可用lambda
        //我只把方法的功能完成即可
        testLambda(()->{System.out.println("Test!!");});
        //因為只有一條命令 還可以縮寫 注意;要移除
        testLambda(()->System.out.println("Test2!!"));
        //有一個傳入參數 標準寫法
        testLambda2((String v)->{System.out.println(v);});
        
        //有一個傳入參數 因為只有一個參數所以可以移除()
        //因為只有一條命令所以{}可以移除
         testLambda2(v->System.out.println(v));
         //有一個以上傳入參數 標準寫法
         testLambda3((String x1,String x2)->{System.out.println(x1+":"+x2);});
         //有一個以上傳入參數 所以無法移除()但可移除參數類型
         //移除參數類型必須同時移除
           testLambda3((x1,x2)->System.out.println(x1+":"+x2));
    }
    
}
