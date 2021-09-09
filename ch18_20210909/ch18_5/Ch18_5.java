/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210909.ch18_5;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch18_5 {
       static void testClass(String msg,Consumer<String>cons){
           cons.accept(msg);
       }
    public static void main(String[] args) {      
        testClass("T1",new Consumer<String>(){
            public void accept(String str){
                System.out.println("Inner class:"+str);
            }
        });
        testClass("T2",s->System.out.println("lambda:"+s));
        
    }
    
}
