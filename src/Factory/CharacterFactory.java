
package Factory;

import Bridge.Color;

public class CharacterFactory
{
    public Character getCharacter(String characterType,Color color)
    {
        if(characterType == null)
          {
              return null;
          }
        
        if(characterType.equalsIgnoreCase("Superman"))
          {
             return new Superman(color);
          }
        
        else if(characterType.equalsIgnoreCase("Batman"))
          {
              return new Batman(color);
          }
        
        else if(characterType.equalsIgnoreCase("Hornet"))
          {
            return new GreenHornet(color);
          }
        else if(characterType.equalsIgnoreCase("Hercules"))
          {
              return new Hercules(color);
          }
        return null;
        
        
    }
}
