/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20210930.ch23_3;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch23_3 {

  
    public static void main(String[] args) {
        Optional empOp = Optional.empty();
        //System.out.println(empOp.get());
        Optional<String> nameOp1 = Optional.of("Ken");
        System.out.println(nameOp1.get());
        //Optional.of 的參數不可為null
      //  Optional<String> nameOp2 = Optional.of(null);
      //ofNullable 參數可為null
       Optional nameOp3 =  Optional.ofNullable(null);
 
       //Optional 內容存在的情況
       Optional<String> testOp1 = Optional.ofNullable("Vivin");
       if (testOp1.isPresent()) System.out.println(testOp1.get());
       testOp1.ifPresent(v->System.out.println(v));
       String name1 = testOp1.orElse("Empty");
       System.out.println(name1);
       
       
    }
    
}
