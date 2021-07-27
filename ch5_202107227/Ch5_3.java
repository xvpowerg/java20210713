/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_202107227;

/**
 *
 * @author xvpow
 */
public class Ch5_3 {
    //假設需求為n筆資料時
    //可用長參數    
    //特性 只能放在參數的最後一筆
    static int sum(int ... values){
        int result = 0;
        for (int v : values){
           result += v;
        }
        return result;
    }
   static int namesCount(int n,String... names){
       int count = 0;
       for(int i = n;i < names.length;i++){
           count++;
       }
       return count;
   } 
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {4,5,6,7};
        System.out.println(sum(array));
        System.out.println(sum(4,8,2));
        System.out.println(sum(4,8,2,7,9,11,25));
       System.out.println(sum());           
       System.out.println(namesCount(1,"Ken","Vivin","Lindy","Lucy"));    
    }
    
}

