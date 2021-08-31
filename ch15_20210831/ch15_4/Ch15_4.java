/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210831.ch15_4;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
/**
 *
 * @author xvpow
 */
public class Ch15_4 {

    static List filter(Predicate<Integer> p,int ... values){
        List list = new ArrayList();
        for (int v : values){
            if (p.test(v)){
                list.add(v);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TestEven te = new TestEven();
      List<Integer> evenlist = filter(te,5,6,8,9,12,3);
      System.out.println(evenlist);
    }
    
}
