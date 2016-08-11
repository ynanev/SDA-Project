
package Observer;


public interface  Magazine 
{
	  
	
	public default int getBullets() 
	{
		return 0;
		
	}
   public default void update()
    {
	   
    }
   public default void reloadMagazine() 
    {  
    }
   public default void setMagazineObserver(MagazineObservable mo)
   {
	   
   }
}
