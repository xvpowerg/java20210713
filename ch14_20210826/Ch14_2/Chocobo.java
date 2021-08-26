/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210826.Ch14_2;

/**
 *
 * @author xvpow
 */
public class Chocobo implements Fly,Run,Jump{
    public void flying(){
        System.out.println("Chocobo flying");
    }
    public void runing(){
        System.out.println("Chocobo runing");
    }
    public void jumping(){
        System.out.println("Chocobo jumping");
    }
}
