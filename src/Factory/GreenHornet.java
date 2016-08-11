
package Factory;

import Bridge.Color;
import Visitor.Accessories;


public class GreenHornet extends  Character
{
	private Accessories kit;
	
     public Accessories getKit()
     {
		return kit;
	}

	public GreenHornet(Color c) 
	{
		super(c);
		
	}

	@Override
     public void createCharacter()
     {
         System.out.println("GreenHornet character is created");
         applyColor();
     }

	@Override
	public void applyColor()
	{
		
	}

	@Override
	public void setKit(Accessories kit) 
	{
		
		
	}

}
