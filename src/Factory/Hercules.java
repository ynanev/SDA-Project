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
public class Hercules extends  Character
{

	
	private Accessories kit;
    public Accessories getKit() {
		return kit;
	}

	public Hercules(Color c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void createCharacter()
    {
       System.out.println("Hercules character is created");
       applyColor();
    }

	@Override
	public void applyColor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setKit(Accessories kit) {
		// TODO Auto-generated method stub
		
	}

	
   
    
}
