/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20210923.ch21_1;
import java.util.TreeSet;
import java.util.Comparator;
public class Ch21_1 {
        static class TestCmp  implements Comparator<Student> {
                public int compare(Student st1,Student st2){
                        int cmp = st1.getScore1() - st2.getScore1();
                        if ( cmp != 0){
                            return    cmp;       
                        }else if ((cmp = st1.getScore2() - st2.getScore2()) != 0){
                             return  cmp;    
                        }else{
                            return  st1.getName().compareTo(st2.getName());     
                        }                                               
                }
        }
    
    
    public static void main(String[] args) {
        Student st1 = new Student("Ken",80,75);
        Student st2 = new Student("Ken",56,95);
        Student st3 = new Student("Iris",99,65);
        Student st4 = new Student("Iris",99,83);
        Student st5 = new Student("Gigi",76,92);
        Student st6 = new Student("Lucy",99,83);
   //    TestCmp tcmp1 = new TestCmp();
   Comparator<Student> tcmp =  Comparator.comparing(st->st.getScore1());
   //thenComparing方法參數的function必須回傳 有實作Comparable的物件
   tcmp  = tcmp.thenComparing(st->st.getScore2()).
           thenComparing(st->st.getName());
   tcmp = tcmp.reversed();
//    Comparator<Student> tcmp = 
//            Comparator.<Student,Integer>comparing(st->st.getScore1()).
//                    thenComparing(st->st.getScore2()).
//                    thenComparing(st->st.getName());
     TreeSet<Student> treeSet = new TreeSet<>(tcmp);
     treeSet.add(st1);
     treeSet.add(st2);
     treeSet.add(st3);
     treeSet.add(st4);
     treeSet.add(st5);
     treeSet.add(st6);
     treeSet.forEach(v->System.out.println(v));
    }
    
}
