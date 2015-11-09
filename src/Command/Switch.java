package Command;

import java.awt.List;
import java.util.ArrayList;

import Interceptor.log;

public class Switch {

	// private ArrayList<Command> history = new ArrayList<Command>();
	 
	   public Switch() {
	   }
	 
	   public void eXecute(Command command)
	   {
		           log log=new log(command);
		           log.LogToFile();
	              // command.execute();        
	   }
	}