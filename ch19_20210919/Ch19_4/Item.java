/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch19_20210919.Ch19_4;

/**
 *
 * @author xvpow
 */
public class Item {
    private int id;
    private String name;
    Item(int id,String name){
        this.id = id;
        this.name = name;
    }
    
    public String toString(){
        return this.id +":"+this.name;
    }
    
   public boolean equals(Object obj){
       if (obj == null || obj instanceof Item == false){
           return false;
       }
       Item item = (Item)obj;
       return this.id == item.id && this.name.equals(item.name);
   }
}
