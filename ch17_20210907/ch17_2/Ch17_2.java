/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17_20210907.ch17_2;
import java.util.function.Consumer; 
import java.util.function.Supplier;
import java.util.Random;
public class Ch17_2 {
    static Random ran = new Random();
    //method reference
    static  void myPrint(String v){
        int id = ran.nextInt(100);
        System.out.println(id+":"+v);
    }
    static void printNames(Consumer<String>print,String ... names){
        for (String v : names){
            //System.out.println(v);
            print.accept(v);
        }
    }
    
    //method reference
    static int getNumber(){
        int[] values = {61,50,78,90,25,63};
        int v = values[ran.nextInt(values.length)];
        return v;                
    }
    
    static int[] randomInitArray(int size,Supplier<Integer> getNumber){
        int[] array = new int[size];
        int value = getNumber.get();
        for (int i = 0;i < size;i++){
            array[i]  = value;
        }
        return array;
    }
    
    public static void main(String[] args) {
        printNames(n->System.out.println(n),
                "Ken","Vivin","Lindy");
        //method reference
        //因為myPrint此方靜態所以可使用類別::方法名稱        
        printNames(Ch17_2::myPrint,
                "Ken","Vivin","Lindy");
        int[] array = randomInitArray(5,Ch17_2::getNumber);        
        System.out.println(array[2]);
    }
    
}
