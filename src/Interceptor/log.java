package Interceptor;

import Command.Command;

public class log
{
       Command command;
       
       public log (Command command)
       {
    	   this.command=command;
       }
       
       
       public void LogToFile()
       {
    	   System.out.println(command.toString()+"  Hase been loged to file");
    	   command.execute();
       }
}
