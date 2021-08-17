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
public class TestObject {
    //所有的類別有一個共通的父類別 就是Object
    private String id;
    private  int size;
    TestObject(String id,int size){
        this.id = id;
        this.size = size;
    }
    @Override
    public String toString(){
        return "ID:"+id+" Size:"+size;
    }
    public boolean equals(Object obj){
        //instanceof 檢查obj參數是否為TestObject類型
        //如果是回傳ture
        if (obj==null || obj instanceof TestObject ==false){
            return false;
        }
        TestObject tobj = (TestObject)  obj;
        return this.size == tobj.size && 
                this.id.equals(tobj.id);
    }
}
