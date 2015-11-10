package Visitor;

import java.util.ArrayList;

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
		 long startTime = System.nanoTime();
	        ArrayList<Object> l = new ArrayList<Object>(3);
		 
	        for(Accessories  accsessoar : accessories)
	        {
	        	accsessoar.accept(visitor);
	        	 l.add(new Object());
	        }
	        long time = System.nanoTime() - startTime;
	        
	        visitor.visit(this);    
	        System.out.println("My thread " + 3 + " execution time: " + time + " ns");
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
