/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.Scanner;

/**
 *
 * @author Parfait
 */
public class ObserverTest 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        MagazineObservable magazineObserver =new MagazineObservable();
        String ans="Y";
        
        new concreteMagazine(magazineObserver);
        
        while(ans.equalsIgnoreCase("Y"))
        {
              Scanner input = new Scanner(System.in);
              System.out.println();
              System.out.println("Shoot ?  1)Y  or 2)N");
              ans = input.nextLine();
        
             if(ans.equalsIgnoreCase("Y"))
              {   
          //        magazineObserver.triggered();
              }
           
        }
        
        
        System.out.println("Shooting has stopped");
        
        
    }
    
}
