/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20210928.ch22_1;
import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch22_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Test1<String,ArrayList<String>> t1 = new Test1();
        ArrayList<String> list = new ArrayList<>();
        t1.steCollection(list);
        t1.addValue("Value1");
        t1.addValue("Value2");
        t1.addValue("Value3");
        t1.foreach(s->System.out.println(s));

        
        
    }
    
}
