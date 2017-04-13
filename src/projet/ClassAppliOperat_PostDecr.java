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
public class ClassAppliOperat_PostDecr {
 public static void main(String[] args)
 {
     int x = 5, y = 7, z = 6, t = 4,calcul ;
     calcul = x-- ;
     System.out.println(" x = "+x+"  x-- = "+calcul);
     calcul = y--- 1;
     System.out.println(" y = "+y+"  y---1 = "+calcul);
     calcul = z -- - z;
     System.out.println(" z = "+z+"  z-- - z = "+calcul);
     calcul = z - z-- ;
     System.out.println(" z = "+z+"  z - z-- = "+calcul);
     
 }         
         
}
