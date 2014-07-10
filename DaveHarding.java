
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
        return "The measure of a life is a measure of love and respect," + 
                  "so hard to earn, so easily burned.";
    }
}
