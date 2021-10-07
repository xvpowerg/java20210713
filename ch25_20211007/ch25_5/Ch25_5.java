/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20211007.ch25_5;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch25_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Path path1 =  Paths.get("c:", "mydir");
     //只能讀一層
//     try{
//         Stream<Path> stream = Files.list(path1); 
//         stream.forEach(p->System.out.println(p));
//     }catch(IOException ex){
//         System.out.println(ex);
//     }
        try{
            //最大是2147483647層
           Stream<Path> stream =   Files.walk(path1,3);
           stream.forEach(p->System.out.println(p));
        }catch(IOException ex){
            System.out.println(ex);
        }

        
        
    }
    
}
