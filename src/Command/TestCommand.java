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
		
		s.buttonPushed(startGame);
		s.buttonPushed(stopGame);
		s.buttonPushed(pauseGame);
		s.buttonPushed(resumeGame);
	}

}
