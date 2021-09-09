/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210909.Ch18_2;

public class Ch18_2 {

   public static class StaticInnerClass{
       private String msg;
       private int count;
        public StaticInnerClass(String msg,int count){
            this.msg = msg;
            this.count = count;
        }
        
        public String toString(){
         return msg+":"+count;
        }
    }
   
   public static void showValue(){
       System.out.println("showValue!!!");
   }
    public static void main(String[] args) {
            StaticInnerClass sc = new StaticInnerClass("C1",5);
            System.out.println(sc);

    }
    
}
