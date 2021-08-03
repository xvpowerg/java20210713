/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210803.Ch7_3;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private float height;
    private float weight;
    //預設建構式
    Animal(){}
    Animal(String name,float height,float weight){
        this.name = name;
        this.setHeight(height);
        this.setWeight(weight);
    }
    public void setHeight(float height){
        this.height = height;
    }
    public float getHeight(){
        return this.height;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public float getWeight(){
        return this.weight;
    }        
    
    public String getName(){
        return name;
    }
    public void print(){
        System.out.println("N:"+this.getName()+" H:"+this.getHeight()+" W:"+this.getWeight());
    }
}
