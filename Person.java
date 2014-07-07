
/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Person
{
    int age;
    Gender gen;
    String hairColor, eyeColor;
    String name;
    
    public Person(String name, int age, Gender gen, String hairColor, String eyeColor)
    {
        this.age = age;
        this.gen = gen;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.name = name;
    }
    
    public abstract String getSaying();
}
