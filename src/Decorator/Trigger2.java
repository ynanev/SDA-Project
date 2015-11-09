package Decorator;

public class Trigger2 extends WeaponAccessoryDecorator {

	 public Trigger2 (Weapon weaponToBeDecorated)
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
	        return super.getComponent() + ", Atached Trigger2";
	    }


}
