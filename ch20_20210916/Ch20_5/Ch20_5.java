/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch20_20210916.Ch20_5;
import java.util.TreeSet;
import java.util.Comparator;
public class Ch20_5 {
  private static class MyCmp implements Comparator<Item>{ 
      //it1 大回傳正數
      //it1 小回傳負數
      //it1 跟it2一樣 回傳0
      public int compare(Item it1,Item it2){
          if (it1.getId() > it2.getId()){
              return 1;
          }else if (it1.getId() < it2.getId()){
              return -1;
          }
          return it1.getName().compareTo(it2.getName());
      }
  }
  
    public static void main(String[] args) {
        MyCmp cmp =new  MyCmp();
    TreeSet<Item> set = new TreeSet<>(cmp);
        Item i1 = new Item(1,"A");
        Item i2 = new Item(11,"B");
        Item i3 = new Item(3,"C");
        Item i4 = new Item(4,"D");
        Item i5 = new Item(8,"F");
        Item i6 = new Item(8,"A");
        set.add(i1);
        set.add(i2);
        set.add(i3);
        set.add(i4);
        set.add(i5);
        set.add(i6);
        set.forEach(it->System.out.print(it+" "));
    }
    
}
