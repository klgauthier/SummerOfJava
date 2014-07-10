/**
 * Write a description of class MattMcCarville here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MattMcCarville extends Person
{
    public MattMcCarville()
    {
        super("Matt McCarville", 32, Gender.MALE, "Dark brown", "Blue");
    }

    public String getSaying()
    {
        return "Good times!";
    }
}