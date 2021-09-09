/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210909.test_sinnerc;
import ch18_20210909.Ch18_2.Ch18_2;
import ch18_20210909.Ch18_2.Ch18_2.StaticInnerClass;
import static  ch18_20210909.Ch18_2.Ch18_2.showValue;
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ch18_2.StaticInnerClass sin = new Ch18_2.StaticInnerClass("D1", 35);
          System.out.println(sin);
        StaticInnerClass sin2 = new StaticInnerClass("E1",25);
          System.out.println(sin2);
          
        showValue();
    }
    
}
