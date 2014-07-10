
/**
 * Daniel Murray class!
 * 
 * @author Daniel Murray
 * @version 07.07.14
 */
public class DanielMurray extends Person
{
    public DanielMurray()
    {
        super("Daniel Murray", 26, Gender.MALE, "Brown", "Green"); // pass parameters to base class
    }
    
    public String getSaying()
    {
        return "I Do What I Want"; 
        // return personalized saying
    }
}
