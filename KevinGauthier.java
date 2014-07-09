
/**
 * Kevin Gauthier class!
 * 
 * @author Kevin Gauthier
 * @version 07.07.14
 */
public class KevinGauthier extends Person
{
    public KevinGauthier()
    {
        super("Kevin Gauthier", 21, Gender.MALE, "Blonde", "Blue"); // pass parameters to base class
    }
    
    public String getSaying()
    {
        return "Fact. Bears eat beets. Bears. Beets. Battlestar Galactica."; 
        // return personalized saying
    }
}
