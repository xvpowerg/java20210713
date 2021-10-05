/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20211005.ch24_6;

/**
 *
 * @author xvpow
 */
public class Ch24_6 {

    public static void main(String[] args) {
            
            
            try(TestClose1 tc1 = new TestClose1();
                TestClose2 tc2 = new TestClose2(true);){                
                System.out.println("Runing!!!");                
            }catch(Exception ex){
                System.out.println(ex);
            }
        
    }
    
}
