/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210919.Ch19_3;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Ch19_3 {
    static void printList(List<Integer> list,String msg){
        System.out.println("========Start:"+msg+"===========");
        for (int v : list){
            System.out.print(v+" ");
        }
        System.out.println();
        System.out.print("=========End:"+msg+"==========");
       System.out.println();    
    }
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(2);
       list.add(8);
       list.add(6);
       printList(list,"Original");
       list.add(25);//附加在後面
        printList(list,"add");
       List<Integer> a1 = new ArrayList();
       a1.add(71);
       a1.add(83);
       list.addAll(a1);
       printList(list,"addall");
       //插入
       list.add(3, 125);
         printList(list,"insert");
         
        //remove
        list.remove(Integer.valueOf(25));
          printList(list,"remove");
         //移除一群 
       //list.removeAll
       //只要是正數 就是找的到
       int index = list.indexOf(6);
       System.out.println(index);
       //有條件的移除
       list.removeIf(v->v%2==0);
     printList(list,"removeAll");
      list.replaceAll(n-> n+2);
    printList(list,"replaceAll");
    }
    
}
