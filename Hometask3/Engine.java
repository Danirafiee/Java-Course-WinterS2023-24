
/**
 * Write a description of class Engine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// define the super class engine 
public class Engine
{
    // instance variables - replace the example below with your own
    public String name;

    /**
     * Constructor for objects of class Engine
     */
    public Engine()
    {
        // initialise instance variables

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    // defining the methods for the engine to set name for the engine and get the name of the engine
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
