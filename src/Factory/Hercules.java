
package Factory;

import Bridge.Color;
import Visitor.Accessories;


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
