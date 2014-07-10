
/**
 * Write a description of class Reg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reg extends Person
{



    public Reg()
    {
        super("Reg Adams", 42, Gender.MALE, "Pink", "Crossed");
       
    }

    
    public String getSaying()
    {
        return "In the land of the blind, the man with one eye is king.";
    }
}
