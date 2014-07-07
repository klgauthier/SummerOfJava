
/**
 * Kevin Gauthier class!
 * 
 * @author Kevin Gauthier
 * @version 07.07.14
 */
public class KevinGauthier extends Person
{
    public KevinGauthier(String name, int age, Gender gen, String hairColor, String eyeColor)
    {
        super(name, age, gen, hairColor, eyeColor); // pass parameters to base class
    }
    
    public String getSaying()
    {
        return "Fact. Bears eat beets. Bears. Beets. Battlestar Galactica."; 
        // return personalized saying
    }
}
