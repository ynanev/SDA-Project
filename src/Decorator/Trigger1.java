package Decorator;

public class Trigger1 extends WeaponAccessoryDecorator {

	 public Trigger1 (Weapon weaponToBeDecorated)
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
	        return super.getComponent() + ", Atached Trigger1";
	    }

}
