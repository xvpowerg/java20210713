/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210824.report;
import ch13_20210824.erp.ErpReport;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class MyReport extends ErpReport{
    
      protected  void reportStyle(ArrayList<String> data){
          for (String v : data){
              System.out.print(v+" ");
          }
      }
}
