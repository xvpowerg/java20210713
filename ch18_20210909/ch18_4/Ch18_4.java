/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210909.ch18_4;

/**
 *
 * @author xvpow
 */
public class Ch18_4 {
    static class MyDog extends Dog{
        public void bark(){
            System.out.println("阿！！");
        }
    }
    static void runConnection(Connection conn){
        conn.connecting();
        conn.closeing();
    }
    public static void main(String[] args){
        Dog dog1 = new MyDog();
        dog1.bark();
        //只有這一次 dog2是哈哈!!
        //匿名內部類 override
        //步驟1 new Dog();
        //步驟2 new Dog(){};這時就變為匿名內部類 這個特殊的類別繼承了Dog
        //步驟3 new Dog(){加入要複寫的方法};
        Dog dog2 = new Dog(){
            public void bark(){
                System.out.println("哈哈！！");
            }
        };
        dog2.bark();
        //匿名內部類介面實作
        runConnection(new Connection(){
             public void connecting(){
                 System.out.println("資料庫連線");
             }
            public void closeing(){
                System.out.println("資料庫斷線");
            }
        });
        
    }
}
