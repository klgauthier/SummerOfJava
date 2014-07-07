
/**
 * This is an abstract class representing a person.
 * You must extend this class and come up with your own Person!
 * 
 * @author Kevin Gauthier
 * @version 07.07.14
 */

public abstract class Person
{
    // person attributes
    int age;
    Gender gen;
    String hairColor, eyeColor;
    String name;
    
    // constructor for the person class
    public Person(String name, int age, Gender gen, String hairColor, String eyeColor)
    {
        this.age = age;
        this.gen = gen;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.name = name;
    }
    
    // abstract method that will return your own unique saying
    public abstract String getSaying();
}
