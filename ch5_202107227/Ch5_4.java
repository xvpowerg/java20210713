/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5_202107227;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {
    //方法名稱一樣
    //函數參數的數量或類型不一樣
    //overloading
       static void test(String msg){
           System.out.println(msg);
       }
       static void test(){
           test("def!");
       }
       
       static int areaRectangle(String tag,int w,int h){
            System.out.println("Tag:"+tag);
            return w * h;
       }
       
       static int unitRectangle(String tag){
           return areaRectangle(tag,1,1);
       }
       
       static int max(int a,int b){
                return a > b? a: b;
       }
       
       static float max(float a,float b){
           return a > b? a: b;
       }
       
    public static void main(String[] args) {
        // TODO code application logic here
        test("Test!");
        test();
        int ans1 = max(5,6);
        int ans2 = max(2,8);
        int ans3 = max(3,7);
        float ans4 = max(6,5); 
        
        System.out.println(areaRectangle("方形1",2,5));
        System.out.println(unitRectangle("單位方形2"));
    }
    
}
