/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Bridge.Color;
import Visitor.Accessories;

/**
 *
 * @author Parfait
 */
public class Superman extends  Character
{
	
	private Accessories kit;
     public Accessories getKit() {
		return kit;
	}

	@Override
     public void createCharacter()
     {
         System.out.println("Superman character is created");
         applyColor();
     }
     
    public Superman(Color c)
  	{
          super(c);
  	}    
 	@Override
 	public void applyColor() {
 		System.out.print("Superman`s color ");
         color.applyColor();
 		
 	}

	@Override
	public void setKit(Accessories kit) 
	
	{
		
		
	}

	
}
