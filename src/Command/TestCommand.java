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
		
		s.buttonPush(startGame);
		s.buttonPush(stopGame);
		s.buttonPush(pauseGame);
		s.buttonPush(resumeGame);
	}

}
