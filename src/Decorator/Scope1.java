package Decorator;

public class Scope1 extends WeaponAccessoryDecorator {

	 public Scope1 (Weapon weaponToBeDecorated)
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
	        return super.getComponent() + ", Atached Scope1";
	    }

}
