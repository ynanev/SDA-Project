/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Parfait
 */
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
   public default void setMagazineObserver(MagazineObserver mo)
   {
	   
   }
}
