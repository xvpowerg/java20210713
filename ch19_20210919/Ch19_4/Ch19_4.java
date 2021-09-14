/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210919.Ch19_4;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch19_4 {

     static void printList(List<Item> list,String msg){
        System.out.println("========Start:"+msg+"===========");
        for (Item v : list){
            System.out.print(v+" ");
        }
        System.out.println();
        System.out.print("=========End:"+msg+"==========");
       System.out.println();    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Item item1 = new Item(1,"A");
        Item item2 = new Item(2,"B");
        Item item3 = new Item(3,"C");
        Item item4 = new Item(2,"B");
        Item del = new Item(2,"B");
       ArrayList<Item> list = new ArrayList(); 
       list.add(item1);
        list.add(item2); 
        list.add(item3); 
        list.add(item4); 
        printList(list,"Original");
        //是使用equals做比較
        list.remove(del);
         printList(list,"remove");       
    }
    
}
