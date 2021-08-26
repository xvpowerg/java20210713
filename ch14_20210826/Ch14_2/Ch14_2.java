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
public class Ch14_2 {

        public static void testRun(Run run){
            run.runing();
        }
        public static void testFly(Fly fly){
            fly.flying();
        }
        public static  void testJump(Jump jump){
            jump.jumping();
        }
        public static void testMagic(Magic magic){  
            magic.attackMagic();
            magic.helpMagic();
        }
    public static void main(String[] args) {
        Chocobo c1 = new Chocobo();
        testRun(c1);
        testFly(c1);
        testJump(c1);
        //testMagic(c1);
        DoctorStrangeSkill ds = new DoctorStrange();
        
         testRun(ds);
        testFly(ds);
        testJump(ds);
        testMagic(ds);
    }
    
}
