/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13_20210824.demo;
import ch13_20210824.erp.ErpReport;
import ch13_20210824.report.MyReport;
/**
 *
 * @author xvpow
 */
public class DemoReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ErpReport erp = new MyReport();
        erp.exportReport();        
    }
    
}
