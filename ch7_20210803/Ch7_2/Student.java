/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210803.Ch7_2;

import ch7_20210803.Ch7_1.*;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name ;
    private int age;
    private int[] scores = new int[3];
    private int index = 0;
    //建構式 或 建構子 Constructor
    //無回傳值
    //是一種方法 所以可多載
    //方法名稱一定跟類別一樣
    //預設建構式
     Student(){
         //this()呼叫目前類別當中其他的建構式
         //this()只能在建構式呼叫與在第一個命令
         this("未設定",-1);
         System.out.print("");         
     }
     Student(String name,int age){
//         System.out.println("name age");
//        this.name = name;
//        this.age = age;
//        
// 可呼叫方法設定 參數 好處是 可使用相同的限制條件
        setName(name);
        setAge(age);
     }        
    public void printBaseInfo(){
        System.out.println(this.getName()+":"+this.getAge());
    }
    public void setName(String name){
        //this.表示當前物件的xxx(方法,屬性)
        //this.兩種用法
        //1 因為參數跟屬性名稱一樣時 區別是屬性還是參數
        //2 因為有快速的方式可選方法或屬性
        if (name.length() < 2){
            System.out.println("錯誤的年齡!");
           return;
        }
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
