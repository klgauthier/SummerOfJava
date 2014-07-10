/**
 * Remya Sreemahesh class!
 * 
 * @author Remya Sreemahesh
 * @version 10.07.14
 */

public class RemyaSreemahesh extends Person
{
    public RemyaSreemahesh()
    {
        super("Remya Sreemahesh", 32, Gender.FEMALE, "Black", "Black"); // pass parameters to base class
    }
    
    public String getSaying()
    {
        return "Work Hard and Success will follow you!!!!"; 
        // return personalized saying
    }
}