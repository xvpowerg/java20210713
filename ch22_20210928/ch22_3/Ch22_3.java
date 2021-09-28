/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20210928.ch22_3;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch22_3 {
    
    static void test1(ArrayList<Object2> list){
        
    }
    static void test2(ArrayList<? extends Object1> obj1List){
           // ? extends N 指可取質不可寫入數值
      for (Object1 o1 : obj1List){
          System.out.println(o1);
      }
    }    
    static void test3(ArrayList<? super Object2> objList){
        Object3 obj1 = new Object3();
        objList.add(obj1);
        
        for (Object obj2 : objList){
            System.out.println(obj2);
        }
    }
    
    public static void main(String[] args) {
    ArrayList<Object2> obj2List = new ArrayList<>();
    //一般泛型Generic 必須一模一樣的泛型才可給予變數
    test1(obj2List);
    ArrayList<Object3> obj3List = new ArrayList<>();   
     ArrayList<Object1> obj1List = new ArrayList<>();
     ArrayList<Object4> obj4List = new ArrayList<>();
    //? extends N 只要泛型類型是N或N的子類都可放入變數
    // ? extends N 只可以取質不可寫入數值
    obj2List.add(new Object2());
    obj2List.add(new Object2());
    obj3List.add(new Object3());
    obj3List.add(new Object3());
    test2(obj2List);
    test2(obj1List);
    //? super N 只要泛型類型是N或N的父類都可放入變數
    //? super N 可寫入 必須是N的子類或N的類型 也可取質
      //? super N 也可取質 取出的數值類型是Object
      System.out.println("==========================");
    test3(obj1List);
    //test3(obj3List);
    
    }
    
}
