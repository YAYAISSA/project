/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projet;

/**
 *
 * @author Admin
 */
public class ClassAppliOperat_BitDecalage {
    public static void main(String[] args)
    {
      int x,y,z,calcul = 0;
      x = -14;// 1...11110010
      y =x;
      z = x; 
      calcul = y>>2; // 1...11111100
      System.out.println(" x>>2 ="+calcul);
      calcul=y<<2;//1...11001000;
      System.out.println("y<<2 = "+calcul);
      calcul=z>>>2;//001...111100;
       System.out.println(" z>>>2 ="+calcul);
    }    
 
}
