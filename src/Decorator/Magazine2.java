package Decorator;

import Observer.Magazine;
import Observer.MagazineObserver;

public class Magazine2 extends WeaponAccessoryDecorator implements Magazine 
{
     private static int bullets=30;
     private MagazineObserver magazineObserver;
     
	 public MagazineObserver getMagazineObserver() 
	 {
		return magazineObserver;
	}
	 @Override
	public void setMagazineObserver(MagazineObserver mo) 
	{
		this.magazineObserver = mo;
        this.magazineObserver.attach(this);
	}

	public int getBullets() {
		return bullets;
	}

	public static void setBullets(int bullets) {
		Magazine2.bullets = bullets;
	}

	public Magazine2 (Weapon weaponToBeDecorated)
	 {
	        super(weaponToBeDecorated);

     }
	 
	 @Override
	    public void buy() {
	        super.buy();
	        buyMagazine1();
	    }

	    private void buyMagazine1()
	    {
	    	
	    }

	    @Override
	    public String getComponent() 
	    {
	        return super.getComponent() + ", Atached 30-bullets Magazine";
	    }
	    
	    @Override
	    public void update() 
	    {
	        if(bullets > 0)
	        {
	        	bullets = bullets - 1;
	          System.out.println("You have  now "+ bullets+ " bullet(s) in your magazine" );
	        
	        }
	        
	        else if(bullets == 0)
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
	    	 bullets = 30;
	         System.out.println("Your Magazine was reloaded");
	    }
	    

}
