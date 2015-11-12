package Command;

import java.awt.List;
import java.util.ArrayList;

import Interceptor.log;
import Interceptor.logger;

public class Switch {

	// private ArrayList<Command> history = new ArrayList<Command>();
	 
	   public Switch() {
	   }
	 
	   public void buttonPushed(Command command)
	   {
		   
	               command.execute();        
	   }
	}