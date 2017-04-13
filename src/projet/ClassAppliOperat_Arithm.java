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
public class ClassAppliOperat_Arithm 
{
    public static void main(String[] args)
    { 
        int x=6,y=12,z=12, t=16, calcul ;
        calcul=x*y-z+t;
        System.out.println("x*y-z+t="+calcul);
        calcul=x*y-(z+t);
        System.out.println("x*y-(z+t)="+calcul);
        calcul=x*y%z+t;
        System.out.println("x*y%z+t="+calcul);
        calcul=((x*y)%z)+t;
        System.out.println("((x*y)%z)+t="+calcul);
        calcul=x*y%(z+t);
        System.out.println("x*y%(z+t)="+calcul);
        calcul=x*(y%(z+t));
        System.out.println("x*(y%(z+t))="+calcul);
    
    
    }
    
}
