/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20211007.ch25_3;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author xvpow
 */
public class Ch25_3 {
    
    public static void main(String[] args) {
        
        Path path1 = Paths.get("c:", "mydir","image1.png");
        System.out.println(path1.getFileName());
        System.out.println(path1.getRoot());
        //root不算在namecount
        System.out.println(path1.getNameCount());
        
        Path path2 = Paths.get("./../mydir/dir2/../dir3");
        Path  newPath1 = path2.normalize();
        System.out.println(newPath1);
        
        Path path3 = Paths.get("c:", "mydir");
        Path path4 = Paths.get("doc","myfile.doc");
        //如果path4帶有roor則 會取代path3的路徑
        Path resPath =  path3.resolve(path4);
        System.out.println(resPath);
        
        
    }
    
}
