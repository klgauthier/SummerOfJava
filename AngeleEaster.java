
/**
 * AngeleEaster - class extends Person.
 * 
 * @author Angele Easter
 * @version July 10, 2014
 */
public class AngeleEaster extends Person
{
    public AngeleEaster()
    {
        super("Angele Easter", 43, Gender.FEMALE, "Brown", "Hazel"); //pass parameters to base class
    }
    
    public String getSaying()
    {
        return "Fire bad, tree pretty. -- Buffy"; // returns personalized saying
    }
}
