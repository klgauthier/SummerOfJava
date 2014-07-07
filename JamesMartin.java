
/**
 * Extends Person abstract class and overrides getSaying() to return their saying.
 * 
 * @author James Martin
 */
public class JamesMartin extends Person
{
    public JamesMartin()
    {
        super("James Martin", 21, Gender.MALE, "Brown", "idk");//Pass the parameters to the base class
    }
    
    public String getSaying()
    {
        return "Summer of Java";//return saying
    }
}
