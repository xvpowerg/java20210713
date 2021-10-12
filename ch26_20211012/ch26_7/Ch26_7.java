/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20211012.ch26_7;
import ch26_20211012.ch26_6.*;
import java.sql.DriverManager;
import java.sql.Connection;
// 下達SQL指令 
import java.sql.Statement;
//查詢資料後的結果
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ch26_7 {
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:derby://localhost:1527/test20211012";
        String user = "qwer";
        String password = "12345";
        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stm =  conn.createStatement();){
            //交易
            conn.setAutoCommit(false);
            stm.executeUpdate("INSERT INTO MYUSER(id,user_name,weight) VALUES(500,'Joy',5.56)");
            stm.executeUpdate("INSERT INTO MYUSER(id,user_name,weight) VALUES(200,'XXXX',5.56)");
            conn.commit();
           ResultSet reset =  stm.executeQuery("SELECT * FROM MYUSER");
           while(reset.next()){
                System.out.println(reset.getInt(1));
                System.out.println(reset.getString("user_name"));
                System.out.println(reset.getFloat(3));
                System.out.println("==========================");
           }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
    }
    
}
