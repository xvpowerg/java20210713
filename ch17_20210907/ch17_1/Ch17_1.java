/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210907.ch17_1;

/**
 *
 * @author xvpow
 */
public class Ch17_1 {

    static int calculateInt(int a,int b,CalculateInt cint){
        return cint.calculate(a, b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int ans1 = calculateInt(2,5,(int a,int b)->{return a + b;});
        System.out.println(ans1);
        //因為命令只有一行可以移除{} 並且不須return
        int ans2 = calculateInt(6,2,(a,b)-> a / b);
    }
    
}
