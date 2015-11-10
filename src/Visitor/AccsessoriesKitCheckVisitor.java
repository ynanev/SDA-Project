package Visitor;

import Decorator.Weapon;

public class AccsessoriesKitCheckVisitor implements AccessoriesVisitor {

	@Override
	public void visit(SimpleGun  gun) 
	{
		 System.out.println("----------> " + gun.getName() );

	}

	@Override
	public void visit(Knife knife)
	{
		System.out.println("----------> " + knife.getName() );

	}

	@Override
	public void visit(Grenade grenade) 
	{
		System.out.println("----------> " + grenade.getName() );

	}

	@Override
	public void visit(AccessoriesKit kit) 
	{
		System.out.println("----------> " + "Kit" );
	}

	@Override
	public SimpleGun getGun() {
		// TODO Auto-generated method stub
		return null;
	}

}
