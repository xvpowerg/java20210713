/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210824.erp;
import java.util.ArrayList;
public abstract class ErpReport {
    private ArrayList<String> getData(){
        ArrayList<String> data = new ArrayList<>();
        data.add("Ken");
        data.add("Vivin");
        data.add("Lindy");
        data.add("Joy");
        return data;
    }
   public void exportReport(){   
       ArrayList<String> data =  getData();  
       reportStyle(data);
   }
   protected abstract void reportStyle(ArrayList<String> data);
}
