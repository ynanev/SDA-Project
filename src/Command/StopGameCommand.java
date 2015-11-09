package Command;

public class StopGameCommand implements Command 
{

	
	   private Game game;
	 
	   public  StopGameCommand(Game game) 
	   {
	      this.game = game;
	   }
	 
	  
	   @Override
		public void execute() 
	   {
		   game.stop();
	   }

}
