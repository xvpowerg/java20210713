/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20211007.ch25_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
/**
 *
 * @author xvpow
 */
public class Ch25_2 {

    public static void main(String[] args) {
        Item i1 = new Item("Item1",85);
        File file = new File("c:\\mydir\\item.obj");
        try(FileOutputStream fout = new FileOutputStream(file);
           ObjectOutputStream objOut  = new   ObjectOutputStream(fout)   ){
            objOut.writeObject(i1);
        }catch(FileNotFoundException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
        
        
    }
    
}
