/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Bridge.BlueColor;
import Bridge.RedColor;

/**
 *
 * @author Parfait
 */

public class Test 
{
     public  void main(String [] args)
     {
         CharacterFactory characterFactory = new CharacterFactory();
         
         //get an object of Superman and call its createCharacter method
          Character firstCharacter = characterFactory.getCharacter("Superman",new BlueColor());
          firstCharacter.createCharacter();
          
          //get an object of Batman and call its createCharacter method
          Character secondCharacter = characterFactory.getCharacter("Batman",new BlueColor());
          secondCharacter.createCharacter();
          
          //get an object of GreenHornet and call its createCharacter method
          Character thirdCharacter =characterFactory.getCharacter("Hornet",new RedColor());
          thirdCharacter.createCharacter();
          
           //get an object of Hercules and call its createCharacter method
          Character fourthCharacter = characterFactory.getCharacter("Hercules",new RedColor());
          fourthCharacter.createCharacter();
          
     }
}
