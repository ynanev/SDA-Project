package Decorator;

public class CommponentsFactory
{
    Weapon w;
	
	public  Weapon createSingleAccessoar (String component)
	{
		if(component.equalsIgnoreCase(" "))
		{
			return null;
		}
		else if(component.equalsIgnoreCase("magazine1"))
		{
		    return new Magazine1(w);
		
		}
		else if(component.equalsIgnoreCase("magazine2"))
		{
		    return new Magazine2(w);
		
		}
		else if(component.equalsIgnoreCase("Scope1"))
		{
		    return new Scope1(w);
		
		}
		else if(component.equalsIgnoreCase("Scope2"))
		{
		    return new Scope2(w);
		
		}
		else if(component.equalsIgnoreCase("Trigger1"))
		{
		    return new Trigger1(w);
		
		}
		else if(component.equalsIgnoreCase("Trigger2"))
		{
		    return new Trigger2(w);
		
		}
		return null;
		
	
	
}
}
