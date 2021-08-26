/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14_20210826.Ch14_2;

/**
 *
 * @author xvpow
 */
public class DoctorStrange implements DoctorStrangeSkill{
    public void runing(){
        System.out.println("DoctorStrange 跑");
    }
    public void flying(){        
        System.out.println("DoctorStrange 飛");
    }    
    public void  jumping(){        
        System.out.println("DoctorStrange 跳");
    }    
    public void attackMagic(){        
        System.out.println("DoctorStrange 鬥氣");
    }
   public void helpMagic(){       
       System.out.println("DoctorStrange 治癒術");
   }
}
