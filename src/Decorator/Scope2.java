package Decorator;

public class Scope2 extends WeaponAccessoryDecorator {

	 public Scope2 (Weapon weaponToBeDecorated)
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
	        return super.getComponent() + ", Atached Scope2";
	    }

}
