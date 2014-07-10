
/**
 * Extends Person abstract class and overrides getSaying() to return their saying.
 * 
 * @author Roberto Radice
 */
public class RobertoRadice extends Person
{
    public RobertoRadice()
    {
        super("Roberto Radice", 58, Gender.MALE, "Brown", "Gray");//Pass the parameters to the base class
    }
    
    public String getSaying()
    {
        return "I am a rock ... something";//return saying
    }
}
