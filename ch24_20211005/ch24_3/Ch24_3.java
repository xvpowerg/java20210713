/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20211005.ch24_3;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author xvpow
 */
public class Ch24_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("c:\\mydir\\image1.png");
        File targetFile = new File("c:\\mydir\\image1_copy.png");
        System.out.println(file.exists());
        FileInputStream fileIn =  null;
        FileOutputStream fileOut = null;
        try{
            fileIn = new FileInputStream(file);    
            fileOut = new FileOutputStream(targetFile);
           //-1資料讀完了
            int data = -1;
            while( (data = fileIn.read()) !=-1 ){
               // System.out.println(data);
                fileOut.write(data);
            }
            
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
     
        
    }
    
}
