/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Parfait
 */

public class concreteMagazine implements Magazine
{

    private int bulletsCount = 30;
	private MagazineObservable gun;
    public concreteMagazine(MagazineObservable gun) 
    {
        this.gun = gun;
        this.gun.attach(this);
        
    }
    
  
    
    
    @Override
    public void update() 
    {
        if(bulletsCount > 0)
        {
          bulletsCount = bulletsCount - 1;
          System.out.println("You have  now "+ bulletsCount+ " bullet(s) in your magazine" );
        
        }
        
        else if(bulletsCount == 0)
        {
            System.out.println("Sorry you have no more bullets in your magazine");
            reloadMagazine();
            System.out.println();
            System.out.println("Magazine reloaded");
        }
                
    }

    @Override
    public void reloadMagazine() 
    {
         bulletsCount = 30;
         System.out.println("Your Magazine was reloaded");
    }
    
}
