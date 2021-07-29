/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210729.ch6_2;


public class Ch6_2 {

    public static void main(String[] args) {
        Employee emp1;//宣告一個Employee的變數
        emp1 = new Employee();//創建一個Employee的物件放到emp1的變數內
        Employee emp2 = new Employee();
        emp1.age = 25;
        emp1.id = "A00001";
        emp1.name = "Lucy";
       
        emp2.age = 26;
        emp2.id = "A00002";
        emp2.name = "Iris";
          
        emp1.print();
        emp2.print();
        
        //員工
        // ID String
        // 姓名 String 
        // 年齡 int       
        //
        
        
    }
    
}
