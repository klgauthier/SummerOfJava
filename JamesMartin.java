
/**
 * Extends Person abstract class and overrides getSaying() to return their saying.
 * 
 * @author James Martin
 */
public class JamesMartin extends Person
{
    public JamesMartin(String name, int age, Gender gen, String hairColor, String eyeColor)
    {
        super(name,age,gen,hairColor,eyeColor);//Pass the parameters to the base class
    }
    
    public String getSaying()
    {
        return "Summer of Java";//return saying
    }
}
