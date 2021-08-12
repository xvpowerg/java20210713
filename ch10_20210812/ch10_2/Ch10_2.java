/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10_20210812.ch10_2;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch10_2 {

    /**
     * @param args the command line arguments
     */
    //越下越父
    //越下方能過濾越多的Exception
    public static void main(String[] args) {
     TestException2 tex2 = new TestException2();
     try{
           tex2.testException(2);
     }catch(SQLException ex){
         System.out.println(ex);
     }catch(FileNotFoundException ex){
         System.out.println(ex);
     }catch(IOException ex){
           System.out.println(ex);
     }catch(Exception ex){
         System.out.println(ex);
     }
   
    }
    
}
