/**
 * Roberto Radice class!
 * 
 * @author Roberto Radice
 * @version 07.07.14
 */
public class RobertoRadice extends Person
{
    public RobertoRadice()
    {
        super("Roberto Radice", 58, Gender.MALE, "Brown", "Gray"); // pass parameters to base class
    }
    
    public String getSaying()
    {
        return "I am a rock. And a rock never cry"; 
        // return personalized saying
    }
}