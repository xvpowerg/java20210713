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
public class Ch2_2 {

    public static void main(String[] args) {
        // 參數可以是 byte short int char String  enum
        int action = 30;
        //宣告常數
        final int FORWARD = 1;       
        //放在case 的變數必須是常數
        switch (action) {
            default:
                System.out.println("錯誤");
            case FORWARD:
                System.out.println("前進");
                break;
            case 2:
                System.out.println("後退");
                break;
            case 3:
                System.out.println("停止");
                break;
            case 4:
                System.out.println("跳躍");
                break;
        }

    }

}
