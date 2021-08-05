/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8_20210805.Ch8_1;

/**
 *
 * @author xvpow
 */
public class Ch8_1 {

     //希望寫一個方法 可以印出所有的Person
      //希望寫一個方法 可以設定所有的Person
    static void initPerson(Person p,String name,int age){
        p.setAge(age);
        p.setName(name);
    }
    static void printPerson(Person p){
      printPersons(p);
    }
    
    //輸出一群Person
    static void printPersons(Person ... personList){
        for (Person p : personList){
            p.print();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //多形 Polymorphic
       // Person p1 = new Student();
        //Person p2 = new Teacher();
        
        Student st1 = new Student();
        Teacher t1 = new Teacher();
        Employee e1 = new Employee();
        initPerson(st1,"Ken",25);
        initPerson(t1,"Vivin",35);
        initPerson(e1,"Iris",26);
        printPersons(st1,t1,e1);
        
    }
    
}
