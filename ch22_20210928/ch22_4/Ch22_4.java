/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20210928.ch22_4;
import java.util.stream.Stream;
public class Ch22_4 {

    public static void main(String[] args) {
        //Stream 特性
        // 1 不會修改到資料來源
        // 2 有分為惰性(Lazy)與終端(Terminal)
        // 3 Stream 不可重複使用
        
        // 1 不會修改到資料來源
        String[] names = {"Ken","Vivin","Lucy"};        
        Stream<String> nameStream = Stream.of(names);
        nameStream.filter(n->n.length() > 3).forEach(v->System.out.println(v));
        System.out.println(names.length);
          // 2 有分為惰性(Lazy)與終端(Terminal)
        Stream<String> nameStream2 = Stream.of(names); 
        //filter 是 Lazyz方法
//        nameStream2.filter(v->{
//            System.out.println("filter:"+v);
//        return true;
//        });
//findFirst 是Terminal
        nameStream2.filter(v->{
            System.out.println("filter:"+v);
        return true;
        }).findFirst();
     // 3 Stream 不可重複使用
       // nameStream2.findAny();
        
    }
    
}

