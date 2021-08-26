/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210826.Ch14_5;
import java.util.function.Consumer;
/**
 *
 * @author xvpow
 */
public class Ch14_5 {

    /*
    Consumer<T>  消費者
    Supplier<T> 提供者
    
    Function<T,R>    轉換
    UnaryOperator<T> 一元運算
    
    Predicate<T> 驗證
    */
    //1 參數可傳0~n
    //2 希望輸出樣式可變化
    public static void printNames(Consumer<String> printStyle,String ... names){
        for (String n : names){
            printStyle.accept(n);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Consumer sty1 = new PrintStyle1();      
        printNames(sty1,"Ken","Vivin","Lindy");
    }
    
}
