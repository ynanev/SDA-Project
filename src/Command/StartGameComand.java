package Command;

public class StartGameComand implements Command {

	   private Game game;
	 
	   public  StartGameComand(Game game) 
	   {
	      this.game = game;
	   }
	 
	  
	   @Override
		public void execute() 
	   {
		   game.start();
	   }

}
