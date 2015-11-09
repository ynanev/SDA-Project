package Visitor;

public class Test {

	public static void main(String[] args) 
	{
		
		   
		        Accessories kit = new AccessoriesKit();
		        kit.accept(new AccsessoriesKitCheckVisitor());
		        kit.accept(new AccessoriesKitUseVisitor());
		    

	}

}
