/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20210923.ch21_3;

import java.util.HashMap;
public class Ch21_3 {
    public static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap<>();
        map.put("A1", 100);
        map.put("B2", 200);
        map.put("C3", 600);
        map.put("D4", 500);
        //key存在合併 key 不存在 新增
        //key in map call BiFunction 
        map.merge("C3", 120, (v1,v2)->{
            System.out.println(v1+":"+v2);
            return v1+v2;
        });
        System.out.println(map.get("C3"));
        //key not in map not call BiFunction 
        map.merge("G5", 920,(v1,v2)->{
            System.out.println(v1+":"+v2);
            return v1+v2;
        } );
         System.out.println(map.get("G5"));
         
    }
    
}
