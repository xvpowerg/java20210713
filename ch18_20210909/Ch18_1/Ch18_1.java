/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18_20210909.Ch18_1;
public class Ch18_1 {
    /*
    建立一般內部類的 兩個原因
    1 想封裝類別(非靜態的)
    2 內部類別適合放在這各類(通常內部類為靜態)
    */
   //非內部類 存取權限(Modifier)只能是 default 或 public 
   //內部類 所有存取權限(Modifier)都可
    //內部類可分 靜態或非靜態    
    private class NonStaticInnerClass{
        private String msg;
        public NonStaticInnerClass(String msg){
            this.msg = msg;
        }
        public String toString(){
            return msg;
        }
    }
    public void testNstc(){
         NonStaticInnerClass nstc = new NonStaticInnerClass("A1");
         System.out.println(nstc);
    }
    public static void main(String[] args) {
       Ch18_1 ch181= new Ch18_1();
       ch181.testNstc();
       Ch18_1.NonStaticInnerClass nstc = 
               ch181.new NonStaticInnerClass("B1");
       System.out.println(nstc);
  
        
    }
    
}
