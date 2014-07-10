
/**
 * Write a description of class DaveHarding here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DaveHarding extends Person
{
    public DaveHarding()
    {
        super("Dave Harding", 49, Gender.MALE, "Brown/Gray(mostly gray)", "Hazel");
    }
    
    public String getSaying()
    {
        return "You can choose from phantom fears and kindness that can kill." + 
                "I will choose a path that's clear, I will choose freewill.";
    }
}
