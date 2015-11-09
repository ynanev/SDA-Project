/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Bridge.Color;
import Visitor.Accessories;
import Visitor.AccessoriesKit;

/**
 *
 * @author Parfait
 */
public class Batman extends  Character
{
	private Accessories kit;
	
     public Accessories getKit() {
		return kit;
	}

	@Override
     public void createCharacter()
     {
         System.out.println("Batman character is created");
         applyColor();
     }
     
     public Batman(Color c)
 	{
         super(c);
 	}    
	@Override
	public void applyColor() {
		System.out.print("Batman`s color ");
        color.applyColor();
		
	}

	
	public void setKit(Accessories kit)
	{
		this.kit=kit;
		
	}

	
}
