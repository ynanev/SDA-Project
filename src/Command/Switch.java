package Command;

import java.awt.List;
import java.util.ArrayList;

import Interceptor.log;
import Interceptor.logger;

public class Switch {

	// private ArrayList<Command> history = new ArrayList<Command>();
	 
	   public Switch() {
	   }
	 
	   public void buttonPush(Command command)
	   {
		   logger log = new log(command);
		           log.LogToFile();
	              // command.execute();        
	   }
	}