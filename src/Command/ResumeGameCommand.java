package Command;

public class ResumeGameCommand implements Command {

	   private Game game;
	 
	   public  ResumeGameCommand(Game game) 
	   {
	      this.game = game;
	   }
	 
	  
	   @Override
		public void execute() 
	   {
		   game.resume();
	   }

}
