/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210715;

/**
 *
 * @author xvpow
 */
public class Ch2_1 {

    public static void main(String[] args) {
        int score = 90;
        
        if (score >= 60) System.out.println("及格好開心");            
        else System.out.println("不及格");       
             System.out.println("回家吃自己");
        
        
        // A 100 90
        //B 80~70
        //C 60~50
        int value = 95;
        if (value >=90 && value <= 100) System.out.println("A");
        else if(value >= 70 &&  value<= 80) System.out.println("B");
        else if(value >= 50 && value <= 60) System.out.println("C");
        else System.out.println("Error");
        
//        int x = 10;
//        if (x < 12){
//            int y = 7;
//        }else{
//            int z = 8;
//        }
//        
//        System.out.println(y+":"+z);
        
    }
    
}
