/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_202107227;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch5_7 {
    static void swapString( String v1 , String v2){
        String tmp = v1;
       v1 = v2;
       v2 = tmp;
    }
    public static void main(String[] args) {
       String v1 = "A";
       String v2 = "B";       
       swapString(v1,v2);
       System.out.println(v1+":"+v2);
    }
    
}
