
/**
 * Write a description of class HPovey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HannahPovey extends Person
{

    public HannahPovey()
    {
        super("Hannah Povey", 22, Gender.FEMALE, "Blonde", "Green"); // pass parameters to base class
    }
    
    public String getSaying()
    {
        return "I am a java wizard."; 
        // return personalized saying
    }
}

