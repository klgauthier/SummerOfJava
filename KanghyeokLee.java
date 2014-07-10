
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
        super("KangHyeok Lee", 40, Gender.MALE, "Black", "Brown"); // pass parameters to base class
    }
    
    public String getSaying()
    {
        return "My wife, My kids, Frech & Salt water fish tank. Plactic model, Salsa dance, Dicasting Model, Basketball, Golf...."; 
        // return personalized saying
    }
}
