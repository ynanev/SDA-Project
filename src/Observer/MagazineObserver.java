
package Observer;

import java.util.ArrayList;
import java.util.List;


public class MagazineObserver 
{
    private List<Magazine> magazines = new ArrayList<Magazine>();

    
  /*  public void triggered()
    {
      notifyAllObservers(); 
    }*/
    
    public void attach(Magazine magazine)
    {
      magazines.add(magazine);		
    }
    
    public void notifyAllObservers()
    {
      for(Magazine magazine : magazines) 
      {
         magazine.update();
      }
     }
    
    
}
