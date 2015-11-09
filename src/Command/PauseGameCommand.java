package Command;

public class PauseGameCommand implements Command {

	   private Game game;
		 
	   public  PauseGameCommand(Game game) 
	   {
	      this.game = game;
	   }
	 
	  
	   @Override
		public void execute() 
	   {
		   game.pause();
	   }

}
