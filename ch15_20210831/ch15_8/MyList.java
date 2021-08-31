/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15_20210831.ch15_8;

/**
 *
 * @author xvpow
 */
public class MyList implements MyIterator {
    private static final int LENGTH = 200000;
    private String[] array = new String[LENGTH];
    private int index = -1;
    
    private int itIndex = -1;
    private int itCount = -1; 
    public int size(){
        return index+1;
    }
    public void add(String value){
        array[++index] = value;
         ++itIndex;
    }
    public String get(int i){        
        if (i < 0 || i > index){
            throw new IndexOutOfBoundsException("index:"+i);
        }
        return array[i];
    }
    public boolean hasNext(){
        if (itIndex >= 0){
            return true;
        }
          return false;
    }
    public String next(){        
        itIndex--;
        return array[++itCount];
    } 
}
