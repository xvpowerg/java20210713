/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch25_20211007.ch25_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.ArrayList;
public class Ch25_1 {

//序列化 Serialiaztion 物件變為某種類型(可能是檔案 可能是json)
//反序列化 某序列化產生的檔案還原為物件   
    public static void main(String[] args) {
        File file = new File("c:\\mydir\\list.obj");
        ArrayList<String> list = new ArrayList<>();
        list.add("Howard");
        list.add("Vivin");
        list.add("Join");
        list.add("Ben");
        try(FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream objOut = new  ObjectOutputStream(fout);   ){
            objOut.writeObject(list);
        }catch(FileNotFoundException ex){            
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }
        
    }
    
}
