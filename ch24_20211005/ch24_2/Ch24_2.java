/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20211005.ch24_2;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch24_2 {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(15);
            list.add(30);
            list.add(70);
          Optional<Integer> sumOpt =  list.stream().reduce((v1,v2)->{
                System.out.println(v1+":"+v2);
                return v1+v2;
            });
          int value = sumOpt.get();
          System.out.println(value);     
           System.out.println("=============================");          
          Integer sumInt = list.stream().reduce(9, (v1,v2)->{
              System.out.println(v1+":"+v2);
              return v1+v2;});
          System.out.println(sumInt);
          System.out.println("=============================");
    //多了  parallel才會執行combiner
        int value2 = list.stream().parallel().reduce(1, (v1,v2)->{
              System.out.println("a:"+v1+":"+v2);
              return v1+v2;
          }, (v1,v2)->{
              System.out.println("c:"+v1+":"+v2);
              return v1+v2;});
        System.out.println(value2);
        }
}
