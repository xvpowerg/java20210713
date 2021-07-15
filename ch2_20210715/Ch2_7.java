/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2_20210715;

/**
 *
 * @author xvpow
 */
public class Ch2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
//        for (int i = 1;i<=3;i++){            
//            for (int k = 1;k<=3;k++){
//                System.out.printf("S %d_%d%n",i,k);
//                if(k + i == 3){
//                    break;
//                    //continue;
//                }
//                System.out.printf("%d_%d%n",i,k);
//                System.out.printf("E %d_%d%n",i,k);
//            }
//                System.out.println("======================");
//        }

        label:
        for (int i = 1;i<=3;i++){            
            for (int k = 1;k<=3;k++){
                System.out.printf("S %d_%d%n",i,k);
                if(k + i == 3){
                    break label;
                   // continue label;
                }
                System.out.printf("%d_%d%n",i,k);
                System.out.printf("E %d_%d%n",i,k);
            }
                System.out.println("======================");
        }
        
        
    }
    
}
