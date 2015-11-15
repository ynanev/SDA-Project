package Decorator;

import Observer.Magazine;
import Observer.MagazineObservable;

public class Magazine1 extends WeaponAccessoryDecorator implements Magazine
{
	private static int bullets=20;
	private MagazineObservable magazineObserver;

	public MagazineObservable getMagazineObserver() 
	{
		return magazineObserver;
	}
	@Override
	public void setMagazineObserver(MagazineObservable mo) 
	{
		this.magazineObserver = mo;
        this.magazineObserver.attach(this);
	}

	@Override
	public int getBullets() 
	{
		return bullets;
	}

	public static void setBullets(int bullets) {
		Magazine1.bullets = bullets;
	}

	public Magazine1 (Weapon weaponToBeDecorated)
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
	        return super.getComponent() + ", Atached 20-bullets Magazine";
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
