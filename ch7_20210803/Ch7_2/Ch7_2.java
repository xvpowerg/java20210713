/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7_20210803.Ch7_2;

/**
 *
 * @author xvpow
 */
public class Ch7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student st1 = new Student("Vivin",10);
       st1.printBaseInfo();
       Student st2 = new Student("Ken",16);      
       st2.printBaseInfo();
       Student st3 = new Student("Lucy",25);
       st3.printBaseInfo();
       Student st4 = new Student("B2",15);
       //輸出後的數值不希望為null
       // 
       st4.setName("B2");
       st4.printBaseInfo();
       
    }
    
}
