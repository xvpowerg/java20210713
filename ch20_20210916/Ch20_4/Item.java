/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210916.Ch20_4;

import ch20_20210916.Ch20_2.*;

/**
 *
 * @author xvpow
 */
public class Item implements Comparable<Item>{
    private int id;
    private String name;
    /*
    正數 目前的比傳入的item大
    負數 目前的比傳入的item小
    0 目前的與傳入的item一樣
    */
    public int compareTo(Item it){
        if (this.id < it.id){
            return -1;
        }else if(this.id > it.id){
            return 1;
        }
        return this.name.compareTo(it.name);
    }
    
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    
    Item(int id,String name){
        this.id = id;
        this.name  = name;
    }
    public String toString(){
        return id+":"+name;
    }
    
    public boolean equals(Object obj){
        if (obj == null ||  obj instanceof Item == false){
            return false;
        }
        Item item = (Item)obj;
        return this.id == item.id && this.name.equals(item.name);
    }
 
    public int hashCode(){
        return this.id+this.name.hashCode();
    }
}
