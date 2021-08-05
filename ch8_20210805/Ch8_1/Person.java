/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210805.Ch8_1;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age =age;
    }
    public int getAge(){
        return age;
    }
            
    public void print(){
        System.out.println(getName()+":"+getAge());
    }
}
