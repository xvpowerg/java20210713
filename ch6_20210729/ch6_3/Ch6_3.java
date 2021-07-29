/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6_20210729.ch6_3;

/**
 *
 * @author xvpow
 */
public class Ch6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //封裝 Encapsulation
       //封裝好處 
       //可控管 資料進出正確性
       //未來會有更好的彈性
       
       //封裝步驟
       //1 私有屬性
       //2 提供開放的 讀(get)寫(set)窗口
       Employee emp1 = new Employee();
       emp1.name = "Lindy";
       //emp1.age = 180;
       emp1.setAge(1802);
       //emp1.id = "A00001";
       emp1.setId("A12A45");
       emp1.print();
    }
    
}
