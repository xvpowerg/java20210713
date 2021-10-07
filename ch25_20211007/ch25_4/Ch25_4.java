/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20211007.ch25_4;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

/**
 *
 * @author xvpow
 */
public class Ch25_4 {

    public static void main(String[] args) {
       Path path =   Paths.get("c:", "mydir","test.zip");
       Path pathcopy =   Paths.get("c:", "mydir","test_copy.zip");
       try{
           Files.copy(path, pathcopy,StandardCopyOption.REPLACE_EXISTING);
       }catch(IOException ex){
            System.out.println(ex);
       }
       
    }
    
}
