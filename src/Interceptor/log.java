package Interceptor;

import Command.Command;

public class log implements logger
{
       Command command;
       
       public log (Command command)
       {
    	   this.command=command;
       }
       
       @Override
       public void LogToFile()
       {
    	   System.out.println(command.toString()+"  Has been loged to file");
    	   System.out.println("-------------------------------------------");
    	  
       }
		@Override
		public String redFile()
		{
		return null;
		}
}
