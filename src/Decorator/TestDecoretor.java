package Decorator;

public class TestDecoretor
{
  public static void main(String args[])
  {
	
      
      Weapon decoretedWeapon = new Magazine1(new Scope2(new Trigger1(new BaseWeapon())));
      System.out.println(decoretedWeapon.getComponent());
  }
}
