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
public class FlyFactory {
    public static Fly  newFly(int type){
        switch(type){
            case 1:                
                return new Bird();
            case 2:
                return new AirPlan();
            default:
                return null;
        }
    }
}
