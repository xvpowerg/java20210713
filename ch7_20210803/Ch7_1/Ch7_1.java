/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210803.Ch7_1;

/**
 *
 * @author xvpow
 */
public class Ch7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Student st1 = new Student();
     st1.setAge(10);
     st1.setName("Ken");
     st1.append(50);
     st1.append(95);
     st1.append(100);
     System.out.println(st1.getAge());
     System.out.println(st1.getName());
     st1.printScore();
      
  
    }
    
}
