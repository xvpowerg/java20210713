/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210805.Ch8_4;

/**
 *
 * @author xvpow
 */
public class Ch8_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test3();
        t1.print();
        //強制轉型
        //t1 是一個 Test2
        if (t1 instanceof Test2){
            Test2 t2 = (Test2)t1;
            t2.showTest2();
        }else if(t1 instanceof Test3){
              Test3 t3 = (Test3)t1;
              t3.showTest3();
        }
        
        
    }
    
    
    
    
}
