package Command;

import java.awt.List;
import java.util.ArrayList;

public class Switch {

	 private ArrayList<Command> history = new ArrayList<Command>();
	 
	   public Switch() {
	   }
	 
	   public void eXecute(Command command) {
	               command.execute();        
	   }
	}