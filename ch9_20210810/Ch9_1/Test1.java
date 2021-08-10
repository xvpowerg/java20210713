/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9_20210810.Ch9_1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public String publicVar = "public";
    protected String protectedVar = "protectedVar";
    String defaultVar = "defaultVar";
    private String privateVar = "privateVar";

    public void publicMethod(){
        System.out.println("publicMethod");
    }
    
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }
    
    void defaultMethod(){
        System.out.println("defaultMethod");
    }
      
     private void privateMethod(){
           System.out.println("privateMethod");
      }
 }
