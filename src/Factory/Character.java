
package Factory;
import Bridge.Color;
import Visitor.Accessories;
import Bridge.BlueColor;


public abstract class Character 
{
	

	    protected Color color;
      
        public Character(Color c)
        {
            this.color=c;
        }    
        abstract public void applyColor();
        public abstract void createCharacter();
        public abstract void setKit(Accessories kit);
        public abstract Accessories getKit();
		
}
