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
public class Ch2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for (int i = 1;i <= 5;i++){
           //break 離開迴圈
           //if ( i == 3) break;
           // continue 不執行 continue之後的動作
           if ( i == 3) continue;
           System.out.println(i);
       }
    }
    
}
