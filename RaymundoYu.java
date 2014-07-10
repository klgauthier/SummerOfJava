
/**
 * Raymundo Yu class!
 * 
 * @author Raymundo Yu
 * @version 07.07.14
 */
public class RaymundoYu extends Person
{
    public RaymundoYu()
    {
        super("Raymundo Yu", 18, Gender.MALE, "Black", "Brown"); // pass parameters to base class
    }
    
    public String getSaying()
    {
        return "Fact: Santa Clause comes to my place everyday."; 
        // return personalized saying
    }
}