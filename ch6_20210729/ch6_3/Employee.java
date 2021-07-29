/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210729.ch6_3;

import ch6_20210729.ch6_2.*;

/**
 *
 * @author xvpow
 */
public class Employee {
    //property
    //id長度 不可小於6
    //id的第一個字必須是英文字母
    //id的第二到結尾必須是數字
    //id 也不可為null
    private String id;
    //name 長度不可小於1 不可大於250
    //name 不可為null
    String name;
    //private 私有化
    //private 只能在 當前物件讀寫
    private int age;   
    //Method 方法
    void print(){
      System.out.println(name+":"+
                        id+":"+getAge());  
    }
    //public 誰都可以讀的到
    //寫入
    public void setAge(int inAge){
        if (inAge > 150 || inAge < 3){
            System.out.println("錯誤的年齡!");            
            return;
        }
        age = inAge;
    }
    //讀取
    public int getAge(){
        return age;
    }
    
    
    private boolean checkID(String inId){
        boolean pass = true;
        //字串變大寫
        inId = inId.toUpperCase();
        //字串轉換成字元陣列
         char[]idArray =  inId.toCharArray();
         for (int i =0;i < idArray.length;i++){
             if (i == 0){
                 if (idArray[i] < 'A' ||  idArray[i] > 'Z') return false;                                      
             }else{
                 if (idArray[i] < '0' || idArray[i] >'9' ){
                     return false;
                 }
             }
         }
        return pass;
    }
    
    public void setId(String inId){
       if(inId.length() < 6){
           System.out.println("長度小於6");
           return;
       }
       if (!checkID(inId)){
           System.out.println("ID格式錯誤");
           return;
       }
        
        id = inId;
    }
   
    public String getId() {
        return id;
    }
    
}
