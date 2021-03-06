import java.util.ArrayList;
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
import Interceptor.log;
import Observer.Magazine;
import Observer.MagazineObservable;
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
	  static MagazineObservable magazineObserver =new MagazineObservable();
	  static Weapon magazine;
	  static log log;

	 public static void main (String [] args)
	{		
		 in =new Scanner(System.in);
		 
		 System.out.println("To Start 'S' To Pause 'P' To Resume 'R' To Stop 'ST");
		 input=in.nextLine();
		while (!(input.equalsIgnoreCase("S") || input.equalsIgnoreCase("P")
				|| input.equalsIgnoreCase("R") || input.equalsIgnoreCase("ST")))
		{
			System.out.println("Invalid input \n Please try again : To Start 'S' To Pause 'P' To Resume 'R' To Stop 'ST");
			input=in.nextLine();
		}

		 state = gameState();//determine command to be execute
	    if(state)
	    {
	    	setCracter();
	    }
	    getKit();
	    System.out.println("***********************************************");
	    decorateGun();
	    shoot();
	    createEnemies();	    
	   
	}
	 
	 public static void createEnemies()
	 {
		 System.out.println("Input a number of enemies to be created");
         try {
			 int num = Integer.parseInt(in.nextLine());

			 gameState();
			 Character enemy;
			 ArrayList<Character> enemyList = new ArrayList<Character>();
			 CharacterFactory characterFactory = new CharacterFactory();
			 Long times[] = new Long[4];
			 Long timesVisiting[] = new Long[4];
			 Integer iterations[] = new Integer[4];

			 int j = 0;
			 while (j < 4) {
				 long startTime = System.nanoTime();
				 for (int i = 0; i < num; i++) {

					 enemy = characterFactory.getCharacter("superman", new RedColor());
					 enemy.createCharacter();
					 enemyList.add(enemy);
					 enemy.setKit(kit);

				 }

				 long time = System.nanoTime() - startTime;
				 times[j] = time;
				 long startTimeVisit = System.nanoTime();
				 for (int i = 0; i < num; i++) {
					 kit.accept(new AccsessoriesKitCheckVisitor());
				 }
				 long stoptTimeVisit = System.nanoTime();
				 timesVisiting[j] = stoptTimeVisit;
				 iterations[j] = num;

				 num = num * 10;
				 j++;

			 }
			 for (int k = 0; k < times.length; k++) {

				 System.out.println("My thread " + iterations[k] + "Creating characters execution time: " + times[k] + " ns");
			 }
			 for (int k = 0; k < times.length; k++) {

				 System.out.println("My thread " + iterations[k] + "Visiting kits execution time: " + timesVisiting[k] + " ns");
			 }
		 }
		 catch (NumberFormatException e)
		 {
			 System.out.println("Incorrect please try again");
			 createEnemies();
		 }
		
	 }
	 public static void getKit()
	 {
		 System.out.println("Get your Kit \n Your Kit contains:\n");
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		 kit.accept(new AccsessoriesKitCheckVisitor());
		
		
		 while(!input.equalsIgnoreCase("g"))
		 {    
			 System.out.println("To get Kit 'G");
			 input=in.nextLine();
			 while( !((input.equalsIgnoreCase("g")) || (input.equalsIgnoreCase("S"))
					 || (input.equalsIgnoreCase("ST")) || (input.equalsIgnoreCase("P"))
					 || (input.equalsIgnoreCase("R"))))
			 {
				 System.out.println("Invalid input \n Please try again : To get Kit 'G");
				 input=in.nextLine();

			 }

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
	    
	     Weapon scope =null;
         Weapon trigger = null;
         Weapon decoratedWeapon;
		 System.out.println("You need to modify your gun");
		
		 while(!input.equalsIgnoreCase("T"))
		 {    
			 System.out.println("To take out the gun and modified press `T`");
			 input=in.nextLine();
			 while( !((input.equalsIgnoreCase("T")) || (input.equalsIgnoreCase("S"))
					 || (input.equalsIgnoreCase("ST")) || (input.equalsIgnoreCase("P"))
					 || (input.equalsIgnoreCase("R"))))
			 {
				 System.out.println("Invalid input \n Please try again : To take out the gun and modified press `T`");
				 input=in.nextLine();

			 }

			 gameState();
		 }
		 boolean gunParts=false;
		 while(!gunParts)
		 {    
			 System.out.println("Select Magazine: `Magazine1`,`Magazine2`");
			 input=in.nextLine();
			 while( !((input.equalsIgnoreCase("Magazine1")) || ((input.equalsIgnoreCase("Magazine2")))
					 || (input.equalsIgnoreCase("S")) || (input.equalsIgnoreCase("ST")) || (input.equalsIgnoreCase("P"))
					 || (input.equalsIgnoreCase("R"))))
			 {
				 System.out.println("Invalid input \n Please try again : Select Magazine: `Magazine1`,`Magazine2`");
				 input=in.nextLine();

			 }

			 gameState();
			 //magazine=componets.createSingleAccessoar(input);
			 
		     if(input.equalsIgnoreCase("Magazine1") ||input.equalsIgnoreCase("Magazine2") )
		     {  
		    	if(input.equalsIgnoreCase("Magazine1"))
		    	{
		    	magazine=new Magazine1(new BaseWeapon());
		    	currnetMagazine=(Magazine1) magazine;
		    	}
		    	else
		    	{
		    	magazine=new Magazine2(new BaseWeapon());
		    	currnetMagazine=(Magazine2) magazine;
		    	}
		    	
		    	gunParts=true;
		    	
		     }
		 }
		 gunParts=false;
		 while(!gunParts)
		 {    
			 System.out.println("Select Scope: `Scope1`,`Scope2`");
			 input=in.nextLine();
			 while( !((input.equalsIgnoreCase("Scope1")) || ((input.equalsIgnoreCase("Scope2")))
					 || (input.equalsIgnoreCase("S")) || (input.equalsIgnoreCase("ST")) || (input.equalsIgnoreCase("P"))
					 || (input.equalsIgnoreCase("R"))))
			 {
				 System.out.println("Invalid input \n Please try again : Select Scope: `Scope1`,`Scope2`");
				 input=in.nextLine();

			 }

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
			 System.out.println("Select Trigger : `Trigger1`,`Trigger2`");
			 input=in.nextLine();
			 while( !((input.equalsIgnoreCase("Trigger1")) || ((input.equalsIgnoreCase("Trigger2")))
					 || (input.equalsIgnoreCase("S")) || (input.equalsIgnoreCase("ST")) || (input.equalsIgnoreCase("P"))
					 || (input.equalsIgnoreCase("R"))))
			 {
				 System.out.println("Invalid input \n Please try again : Select Trigger : `Trigger1`,`Trigger2`");
				 input=in.nextLine();

			 }
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
		System.out.println("Time to learn to shoot");
		
    	currnetMagazine.setMagazineObserver(magazineObserver);
    	  String ans="Y";
          boolean stop1 = false;


          while((ans.equalsIgnoreCase("Y") || ans.equalsIgnoreCase("N")) && stop1 ==false)
          {
                Scanner input = new Scanner(System.in);
                System.out.println();
                System.out.println("Shoot ?  1)Y  or 2)N");
                ans = input.nextLine();

               if(ans.equalsIgnoreCase("Y"))
                {
                    magazineObserver.notifyAllObservers();
                }
			  else if(ans.equalsIgnoreCase("N"))
			   {
				   System.out.println("Shooting has stopped");
				   stop1 =true;
			   }
			  else
			   {
				   System.out.println("Incorrect input please try again");
				    ans="Y";
			   }
          }
    	System.out.println(currnetMagazine.getBullets());
		
	 }
	 
	 public static void setCracter()
	 {   
		 state=false;
		 while(!state)
		 {
		 System.out.println("Type the name of the character to select");
		 System.out.println("Superman,Hornet,Hercules,Batman");

		 input=in.nextLine();
         while( !((input.equalsIgnoreCase("Superman")) || ((input.equalsIgnoreCase("Hornet")))
			   || (input.equalsIgnoreCase("Batman")) || ((input.equalsIgnoreCase("Hercules")))
			    || (input.equalsIgnoreCase("S")) || (input.equalsIgnoreCase("ST")) || (input.equalsIgnoreCase("P"))
			    || (input.equalsIgnoreCase("R"))))
		 {
			 System.out.println("Please try again : Type the name of the character to select");
			 System.out.println("Superman,Hornet,Hercules,Batman");
			 input=in.nextLine();

		 }
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
			while( !((input.equalsIgnoreCase("Red")) || ((input.equalsIgnoreCase("Blue")))
					 || (input.equalsIgnoreCase("S")) || (input.equalsIgnoreCase("ST")) || (input.equalsIgnoreCase("P"))
					 || (input.equalsIgnoreCase("R"))))
			 {
				 System.out.println("Invalid input \n  Please try again : Type Color to select");
				 System.out.println("Red,Blue");
				 input=in.nextLine();

			 }

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
			   log=new log(gamestate);
			   log.LogToFile();
			   s.buttonPushed(gamestate);
			   state=true;
			   return true;
		   }
		   else if(input.equalsIgnoreCase("p"))
		   {
			   gamestate=new PauseGameCommand(game);
			   log=new log(gamestate);
			   log.LogToFile();
			   s.buttonPushed(gamestate);
			   state=false;
			   gamePoaused();	   
			   return false;
		   }
		   else if(input.equalsIgnoreCase("r"))
		   {
			   
			   gamestate=new ResumeGameCommand(game);
			   log=new log(gamestate);
			   log.LogToFile();
			   s.buttonPushed(gamestate);
			   state=true;
			   gamePoaused();
			   return true;
		   }
		   else if(input.equalsIgnoreCase("st"))
		   {
			   gamestate=new StopGameCommand(game);
			   log=new log(gamestate);
			   log.LogToFile();
			   state=false;
			   s.buttonPushed(gamestate);		   
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

