/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20210923.ch21_2;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

        // Key        Value
        // 經緯度     地點
       // 身分證      人
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A1", 100);
        map.put("B2", 200);
        map.put("C3", 600);
        map.put("D4", 500);
        
        System.out.println(map.get("C3"));
        System.out.println(map.get("A3"));
        //containsKey key是否存在
        System.out.println(map.containsKey("D4"));
        System.out.println(map.containsKey("D5"));     
        //key存在put 會覆蓋
        map.put("B2", 950);
        System.out.println(map.get("B2"));
        //輪巡取值
        map.forEach((k,v)->System.out.println(k+":"+v));
    }
    
}
