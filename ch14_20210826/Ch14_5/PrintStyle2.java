/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210826.Ch14_5;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class PrintStyle2  implements Consumer<String> {
        public void accept(String s){
            System.out.println(s);
        }
}
