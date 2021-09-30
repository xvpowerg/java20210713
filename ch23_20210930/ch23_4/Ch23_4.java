/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20210930.ch23_4;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch23_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Optional<String> empyOption =   Optional.ofNullable(null);
       //如果Optional內容是null回傳某個字串
       String msg1 = empyOption.orElse("Empty");
       System.out.println(msg1);
       String msg2 = empyOption.orElseGet(()-> "get value");
       System.out.println(msg2);
       //會拋出自訂的例外
       empyOption.orElseThrow(RuntimeException::new);
    }
    
}
