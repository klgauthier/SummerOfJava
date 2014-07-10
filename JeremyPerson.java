public class JeremyPerson extends Person

{
    public JeremyPerson()
    {
        super("Jeremy Murphy", 25, Gender.MALE, "Brown", "Blue"); // pass parameters to base class
    }
    
    public String getSaying()
    {
        return "The best ever death metal band out of Denton will in time both outpace and outlive you"; 
        // return personalized saying
    }
}
