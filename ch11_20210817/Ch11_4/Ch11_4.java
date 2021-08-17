/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11_20210817.Ch11_4;

/**
 *
 * @author xvpow
 */
public class Ch11_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TestObject tobj = new TestObject("A0001",10);
         TestObject tobj2 = new TestObject("A0001",10);
          TestObject tobj3 = new TestObject("A0001",20);
        System.out.println(tobj);
        System.out.println(tobj.getClass().getName()+"@"+(Integer.toHexString(tobj.hashCode())));
    
        System.out.println(tobj.equals(tobj2));
         System.out.println(tobj.equals(null));
          System.out.println(tobj.equals(tobj3));
          System.out.println("物件:"+tobj3);
    }
    
}
