package Visitor;



public class AccessoriesKitUseVisitor implements AccessoriesVisitor
{

	@Override
	public void visit(SimpleGun  gun) 
	{
		System.out.println("Taking out the " +gun.getGunInKit().getComponent() );
		
	}

	@Override
	public void visit(Knife knife) 
	{
		System.out.println("Taking out the " + knife.getName() );
		
	}

	@Override
	public void visit(Grenade grenade)
	{
		System.out.println("Taking out the " + grenade.getName() );
		
	}

	@Override
	public void visit(AccessoriesKit kit) 
	{
		System.out.println("Moving Kit" );
		
	}

	@Override
	public SimpleGun getGun() {
		// TODO Auto-generated method stub
		return null;
	}

}
