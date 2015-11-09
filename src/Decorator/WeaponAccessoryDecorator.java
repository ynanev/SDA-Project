package Decorator;

public class WeaponAccessoryDecorator implements Weapon 
{
	protected Weapon weaponToBeDecorated;
	
	public WeaponAccessoryDecorator (Weapon weaponToBeDecorated) {
        this.weaponToBeDecorated = weaponToBeDecorated;
    }
   


	@Override
	public void buy() {
		weaponToBeDecorated.buy();
		
	}

	@Override
	public String getComponent() {
		return weaponToBeDecorated.getComponent();
		
	}



	public WeaponAccessoryDecorator createSingleAccessoar(String component)
	{
		if(component.equalsIgnoreCase(" "))
		{
			return null;
		}
		else if(component.equalsIgnoreCase("magazine1"))
		{
		    return new Magazine1(weaponToBeDecorated);
		
		}
		else if(component.equalsIgnoreCase("magazine2"))
		{
		    return new Magazine2(weaponToBeDecorated);
		
		}
		else if(component.equalsIgnoreCase("Scope1"))
		{
		    return new Scope1(weaponToBeDecorated);
		
		}
		else if(component.equalsIgnoreCase("Scope2"))
		{
		    return new Scope2(weaponToBeDecorated);
		
		}
		else if(component.equalsIgnoreCase("Trigger1"))
		{
		    return new Trigger1(weaponToBeDecorated);
		
		}
		else if(component.equalsIgnoreCase("Trigger2"))
		{
		    return new Trigger2(weaponToBeDecorated);
		
		}
		return null;
		
	}



	



	



	

}
