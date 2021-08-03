/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210803.Ch7_1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    private int[] scores = new int[3];
    private int index = 0;
    public void setName(String name){
        //this.表示當前物件的xxx(方法,屬性)
        //this.兩種用法
        //1 因為參數跟屬性名稱一樣時 區別是屬性還是參數
        //2 因為有快速的方式可選方法或屬性
        this.name = name;                
    }
    public String getName(){
       return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void append(int score){
        //避免append時超過array的index
        if (index < scores.length){
            scores[index] = score;
            index++;
        }
    }    
    public void printScore(){        
        for (int s : scores){
            if (s != 0){
                System.out.println(s);
            }           
        }
    }
}
