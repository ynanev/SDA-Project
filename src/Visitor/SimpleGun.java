package Visitor;

import Decorator.Weapon;

public class SimpleGun    implements Accessories  
{
     
	public Weapon gun ;
	
	
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SimpleGun()
	{
		name="Gun";
	}
	
	public SimpleGun(Weapon w)
	{
		gun=w;
	}
	public void accept(AccessoriesVisitor visitor)
	{
		visitor.visit(this);

	}
	
	public void setGunInKit(Weapon w)
	{
		this.gun=gun;
		
	}
	
	public Weapon getGunInKit() 
	{
		
		return this.gun;
	}
	//@Override
	//public void ModifyAccessoriesKit(Weapon w)
	//{
	//	gun=w;
	///	
	//}

}
