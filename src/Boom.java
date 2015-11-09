import java.util.Scanner;

import Bridge.BlueColor;
import Bridge.RedColor;
import Command.Command;
import Command.Game;
import Command.PauseGameCommand;
import Command.ResumeGameCommand;
import Command.StartGameComand;
import Command.StopGameCommand;
import Command.Switch;
import Decorator.BaseWeapon;
import Decorator.CommponentsFactory;
import Decorator.Magazine1;
import Decorator.Magazine2;
import Decorator.Scope1;
import Decorator.Scope2;
import Decorator.Trigger1;
import Decorator.Trigger2;
import Decorator.Weapon;
import Decorator.WeaponAccessoryDecorator;
import Factory.Character;
import Factory.CharacterFactory;
import Observer.Magazine;
import Observer.MagazineObserver;
import Observer.concreteMagazine;
import Visitor.Accessories;
import Visitor.AccessoriesKit;
import Visitor.AccessoriesKitUseVisitor;
import Visitor.AccsessoriesKitCheckVisitor;

public class Boom 
{

	  static Scanner in;
	  static Game game = new Game();
	  static Switch s = new Switch();
	  static Command gamestate ;
	  static Character firstCharacter;
	  static boolean state;
	  static  Accessories kit = new AccessoriesKit();
	  static String input;
	  static Weapon gun;
	  static Magazine currnetMagazine;
	  static MagazineObserver magazineObserver =new MagazineObserver();

	 public static void main (String [] args)
	{		
		 in =new Scanner(System.in);
		 
		 System.out.println("To Start 'S' To Pause 'P' To Resume 'R' To Stop 'ST");
		 input=in.nextLine();
		 state = gameState();
	    if(state)
	    {
	    	setCracter();
	    }
	    getKit();
	    decorateGun();
	    
	   
	}
	 public static void getKit()
	 {
		 System.out.println("Get your Kit \n Your Kit contains:\n");
		 kit.accept(new AccsessoriesKitCheckVisitor());
		
		
		 while(!input.equalsIgnoreCase("g"))
		 {    
			 System.out.println("To get Kit 'G");
			 input=in.nextLine();
			 gameState();
		 }
		
			 System.out.println("You got your Kit");
		
		 firstCharacter.setKit(kit);
		 ((AccessoriesKit) kit).setGunInKit(new Magazine1(new Scope2(new Trigger1(new BaseWeapon()))));
		 ((AccessoriesKit) kit).getGunInKit().getComponent();
		 ((AccessoriesKit) kit).ModifyAccessoriesKit(new BaseWeapon());
		 firstCharacter.setKit(kit);
		 kit.accept(new AccessoriesKitUseVisitor());
		 
	 }
	 public static void decorateGun()
	 {   CommponentsFactory componets=new CommponentsFactory();
	     Weapon magazine = null;
	     Weapon scope =null;
         Weapon trigger = null;
         Weapon decoratedWeapon;
		 System.out.println("You need to modify your gun");
		
		 while(!input.equalsIgnoreCase("T"))
		 {    
			 System.out.println("To take out the gun and modifyed press `T`");
			 input=in.nextLine();
			 gameState();
		 }
		 boolean gunParts=false;
		 while(!gunParts)
		 {    
			 System.out.println("Select Magazine: `Magazine1`,`Magazine2`");
			 input=in.nextLine();
			 gameState();
			 //magazine=componets.createSingleAccessoar(input);
			 
		     if(input.equalsIgnoreCase("Magazine1") ||input.equalsIgnoreCase("Magazine2") )
		     {  
		    	if(input.equalsIgnoreCase("Magazine1"))
		    	{
		    	magazine=new Magazine1(new BaseWeapon());
		    	currnetMagazine=(Magazine1) magazine;
		    	currnetMagazine.setMagazineObserver(magazineObserver);
		    	  String ans="Y";
		          
		        
		          
		          while(ans.equalsIgnoreCase("Y"))
		          {
		                Scanner input = new Scanner(System.in);
		                System.out.println();
		                System.out.println("Shoot ?  1)Y  or 2)N");
		                ans = input.nextLine();
		          
		               if(ans.equalsIgnoreCase("Y"))
		                {   
		                    magazineObserver.triggered();
		                }
		             
		          }
		          
		          
		          System.out.println("Shooting has stopped");
		          
		    	System.out.println(currnetMagazine.getBullets());
		    	}
		    	else
		    	{
		    	magazine=new Magazine2(new BaseWeapon());
		    	currnetMagazine=(Magazine1) magazine;
		    	currnetMagazine.setMagazineObserver(magazineObserver);
		    	  String ans="Y";
		          
		        
		          
		          while(ans.equalsIgnoreCase("Y"))
		          {
		                Scanner input = new Scanner(System.in);
		                System.out.println();
		                System.out.println("Shoot ?  1)Y  or 2)N");
		                ans = input.nextLine();
		          
		               if(ans.equalsIgnoreCase("Y"))
		                {   
		                    magazineObserver.triggered();
		                }
		             
		          }
		          
		          
		          System.out.println("Shooting has stopped");
		          
		    	System.out.println(currnetMagazine.getBullets());
		    	gunParts=true;
		    	}
		     }
		 }
		 gunParts=false;
		 while(!gunParts)
		 {    
			 System.out.println("Select Scope: `Scope1`,`Scope2`");
			 input=in.nextLine();
			 gameState();
			 //scope=componets.createSingleAccessoar(input);
		     if(input.equalsIgnoreCase("Scope1") ||input.equalsIgnoreCase("Scope2") )
		     {  
		    	 if(input.equalsIgnoreCase("Scope1")) 
		    	 scope=new Scope1(magazine);
		    	 else
		    	 scope=new Scope2(magazine);
		    	 
		    	gunParts=true;
		     }
		 }
		 gunParts=false;
		 while(!gunParts)
		 {    
			 System.out.println("Select Scope: `Trigger1`,`Trigger2`");
			 input=in.nextLine();
			 gameState();
			// trigger=componets.createSingleAccessoar(input);
		     if(input.equalsIgnoreCase("Trigger1") ||input.equalsIgnoreCase("Trigger2") )
		     {
		    	if(input.equalsIgnoreCase("Trigger1")) 
		    	trigger= new Trigger1(scope);
		    	else
		        trigger= new Trigger2(scope);	
		    	gunParts=true;
		     }
		 }
		 decoratedWeapon=trigger;
		 ((AccessoriesKit) kit).ModifyAccessoriesKit(decoratedWeapon);
		 kit.accept(new AccessoriesKitUseVisitor());
		 
		 
	 }
	 public static void shoot()
	 {
		System.out.println("Time to learne to shoot");
		
		
	 }
	 
	 public static void setCracter()
	 {   
		 state=false;
		 while(!state)
		 {
		 System.out.println("Type the name of the charackter to select");
		 System.out.println("Superman,Hornet,Hercules,Bataman");
		 
		 input=in.nextLine();
		 state=gameState();
		 }
		 String color=null;
		 String dude=input;
		
		 state=false;
		 while(!state)
		 {
		 System.out.println("Type Color to select");
		 System.out.println("Red,Blue");
		 input=in.nextLine();
		 state=gameState();
		 
		 }
		 color=input;
		 
		 CharacterFactory characterFactory = new CharacterFactory();
		 if(color.equalsIgnoreCase("Red"))
		 {
		 firstCharacter = characterFactory.getCharacter(dude,new RedColor());
         firstCharacter.createCharacter();
		 }
		 if(color.equalsIgnoreCase("Blue"))
		 {
		 firstCharacter = characterFactory.getCharacter(dude,new BlueColor());
         firstCharacter.createCharacter();
		 }

		 
	 }
	 public static boolean gameState()
	 {
		
		  
		    
		   if(input.equalsIgnoreCase("s"))
		   {
			   gamestate=new StartGameComand(game);
			   s.eXecute(gamestate);
			   state=true;
			   return true;
		   }
		   else if(input.equalsIgnoreCase("p"))
		   {
			   gamestate=new PauseGameCommand(game);
			   s.eXecute(gamestate);
			   state=false;
			   gamePoaused();	   
			   return false;
		   }
		   else if(input.equalsIgnoreCase("r"))
		   {
			   
			   gamestate=new ResumeGameCommand(game);
			   s.eXecute(gamestate);
			   state=true;
			   gamePoaused();
			   return true;
		   }
		   else if(input.equalsIgnoreCase("st"))
		   {
			   gamestate=new StopGameCommand(game);
			   state=false;
			   s.eXecute(gamestate);		   
			   return false;
		   }
		   else
		   {
			   //System.out.println("Incorrect comand");
			   state=true;
			   return true;
		   }
		   
	 }
	 public static void gamePoaused()
	   {
		 while(!state)
		 {
		 System.out.println("To Start 'S' To Pause 'P' To Resume 'R' To Stop 'ST");
	     input=in.nextLine();
	     state= gameState();
		 }
		   
	   }
	
}

