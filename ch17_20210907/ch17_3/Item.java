/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210907.ch17_3;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
     Item(){
       
    }
    Item(String name){
       this.name = name;
    }
    public String toString(){
        return "Item:"+name;
    }
    
    public String getName(){
        return name;
    }
    
    public static Item newItem(String name){
        return new Item(name);
    }

    public String concatTitleAndName(String title){
        return title+":"+name;
    }
}
