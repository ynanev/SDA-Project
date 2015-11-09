package Visitor;

import Decorator.Weapon;

public class AccessoriesKit implements Accessories {
	static Accessories [] accessories ;
	
	Weapon w;
	public AccessoriesKit() 
	{
        this.accessories= new Accessories[] { new Knife(),
            new SimpleGun(), new Grenade() };
    }
	
	 public void accept (AccessoriesVisitor visitor) 
	 {    
	        for(Accessories  accsessoar : accessories)
	        {
	        	accsessoar.accept(visitor);
	        }
	        visitor.visit(this);    
	    }
	 public void ModifyAccessoriesKit(Weapon w) 
		{
	      accessories[1]= new SimpleGun(w);
	       
	       
	    }

	public void setGunInKit(Weapon w) 
	{
		this.w=w;
		
	}

	
	public Weapon getGunInKit() 
	{
		return w;
		
	}
	
	

}
