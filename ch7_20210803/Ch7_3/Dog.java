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
public class Dog extends Animal{
    private int age;
    //子類不會繼承父類的
    //1 建構式
    //2 私有的
    //3 無法讀取的
    Dog(){}
    Dog(String name,float weight,float height,int age){
        //呼叫父類別的建構式
        //只能在建構式呼叫
        //只能是建構式的第一條命令
        super(name,weight,height);
        this.age = age;
    }
    // @Override 檢查 是否為正確的覆寫
  
    public void print(){
        System.out.print("a:"+age);
        //super. 呼叫父類別的(方法)
       super.print();
    }
}
