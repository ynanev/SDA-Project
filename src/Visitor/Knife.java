package Visitor;

import Decorator.Weapon;

public class Knife implements Accessories {
    
	String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Knife()
	{
		name="Knife";
	}
	
	
	@Override
	public void accept(AccessoriesVisitor visitor) 
	{
		visitor.visit(this);

	}


	//@Override
	//public void ModifyAccessoriesKit(Weapon w) {
		// TODO Auto-generated method stub
		
	//}

}
