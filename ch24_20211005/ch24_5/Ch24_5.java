package ch24_20211005.ch24_5;
import ch24_20211005.ch24_4.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 *
 * @author xvpow
 */
public class Ch24_5 {

    public static void main(String[] args) {
        File file = new File("c:\\mydir\\test.zip");
        File targetFile = new File("c:\\mydir\\test_copy.zip");
        System.out.println(file.exists());
     
      //自動close
        try( InputStream fileIn  =
                new BufferedInputStream( new FileInputStream(file));            
           OutputStream fileOut  =  
                   new BufferedOutputStream(new FileOutputStream(targetFile));){
            
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