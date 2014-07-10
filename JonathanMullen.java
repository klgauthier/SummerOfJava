
/**
 * Jonathan Mullen class!
 * 
 * @author Jonathan Mullen
 * @version 07.10.14
 */
public class JonathanMullen extends Person
{
    public JonathanMullen()
    {
        super("Jonathan Mullen", 36, Gender.MALE, "Brown", "Brown"); // pass parameters to base class
    }
    
    public String getSaying()
    {
        return "Go Big or Stay Home."; 
        // return personalized saying
    }
}
