/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210831.ch15_8;

/**
 *
 * @author xvpow
 */
public class Ch15_8 {

      static void foreach(MyIterator it){
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
    public static void main(String[] args) {
      MyList myList = new MyList();
      myList.add("A");
      myList.add("B");
      myList.add("C");
      System.out.println(myList.get(0));
      System.out.println(myList.get(1));
      System.out.println(myList.get(2));
      System.out.println(myList.size());
//      foreach(myList);
      myList.foreach();
    }
    
}
