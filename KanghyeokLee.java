
/**
 * Write a description of class KanghyeokLee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KanghyeokLee extends Person
{
    public KanghyeokLee()
    {
        super("Kanghyeok Lee", 40, Gender.MALE, "Black", "Brown"); // pass parameters to base class
    }
    
    public String getSaying()
    {
        return "My family, Fresh & Salt water tank, Plactic & Dicasting Model, Basket Ball, Salsa dance, Sun, wine, beer, whiskey, Sake, Soju, Vodka, Rum, Cocktails .... "; 
        // return personalized saying
    }
}
