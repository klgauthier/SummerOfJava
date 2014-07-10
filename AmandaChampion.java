/**
 * Class AmandaChampion
 * 
 * @author Amanda Champion
 * @version July 10, 2014
 */
public class AmandaChampion extends Person
{
    //Constructor
    public AmandaChampion()
    {
        super("Amanda Champion", 21, Gender.FEMALE, "brown", "blue");
    }
    // abstract method that will return your own unique saying
    public String getSaying()   
    {
        return "Hello";
    }
}
