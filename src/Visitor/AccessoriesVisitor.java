package Visitor;

import Decorator.Weapon;

public interface AccessoriesVisitor
{
	    void visit(SimpleGun  gun);
	    void visit(Knife knife);
	    void visit(Grenade grenade);
	    void visit(AccessoriesKit kit);
	     SimpleGun getGun();

}
