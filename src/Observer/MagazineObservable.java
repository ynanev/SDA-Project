/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/** 
 *
 * @author Parfait
 */
public class MagazineObservable 
{
	
	////////////observable
    private List<Magazine> magazines = new ArrayList<Magazine>();

    
   
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
