/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210803.Ch7_3;

/**
 *
 * @author xvpow
 */
public class Ch7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Animal ani1 = new Animal("Bobo",2.3f,5.2f);
      ani1.setHeight(5.5f);
      ani1.setWeight(0);
      ani1.getHeight();
      ani1.getWeight();
      ani1.getName();
      ani1.print();
      
      Dog dog1 = new Dog("momo",2,0.5f,1);
      dog1.setHeight(20);
      dog1.setWeight(6);
      dog1.print();
    }
    
}
