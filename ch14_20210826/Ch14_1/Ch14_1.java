/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210826.Ch14_1;

/**
 *
 * @author xvpow
 */
public class Ch14_1 {
//USB
    public static void main(String[] args) {
        // TODO code application logic here
        Fly fly = FlyFactory.newFly(Preference.TYPE);
        fly.flying();
    }
    
}
