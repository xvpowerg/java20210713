/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_202107227;

public class Ch5_1 {
    public static void main(String[] args) {
        //只要不是連續的true字串 就回傳false
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);
        boolean b2 = Boolean.parseBoolean("tRUe");
        System.out.println(b2);
        boolean b3 = Boolean.parseBoolean("tR  Ue");
        System.out.println(b3);
       boolean b4 = Boolean.parseBoolean(null);
       System.out.println(b4);
       
    }
    
}
