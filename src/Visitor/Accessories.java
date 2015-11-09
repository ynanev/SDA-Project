package Visitor;

import Decorator.Weapon;

public interface Accessories 
{
	void accept(AccessoriesVisitor visitor);
	//void ModifyAccessoriesKit(Weapon w) ;
	//void setGunInKit(Weapon w);
	//Weapon getGunInKit();
}
