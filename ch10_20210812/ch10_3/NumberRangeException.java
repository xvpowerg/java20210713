/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210812.ch10_3;

/**
 *
 * @author xvpow
 */
public class NumberRangeException extends RuntimeException{
    public NumberRangeException(){}
    public NumberRangeException(String msg){
        super(msg);
    }
}
