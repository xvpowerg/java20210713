/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20211007.ch25_1;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
//反序列化 某序列化產生的檔案還原為物件   
public class Ch25_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         File file = new File("c:\\mydir\\list.obj");
         try(FileInputStream fin = new FileInputStream(file);
           ObjectInputStream objInput = new ObjectInputStream(fin);){
           ArrayList<String> list = (ArrayList)  objInput.readObject();
           System.out.println(list);
         }catch(FileNotFoundException ex){
             System.out.println(ex);
         }catch(IOException | ClassNotFoundException ex){
             System.out.println(ex);
         }
    }
    
}
