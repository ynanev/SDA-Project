package Command;

public class TestCommand 
{
	public static void main(String args[])
	{
		Game game = new Game();
		Command startGame = new StartGameComand(game);
		Command stopGame  = new StopGameCommand(game); 
		Command pauseGame = new PauseGameCommand(game);
		Command resumeGame= new ResumeGameCommand(game);
		
		
		Switch s = new Switch();
		
		s.eXecute(startGame);
		s.eXecute(stopGame);
		s.eXecute(pauseGame);
		s.eXecute(resumeGame);
	}

}
