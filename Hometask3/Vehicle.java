
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// define the superclass vehicle which has the Manufacture and Engine class as an attribute
public class Vehicle
{
    // instance variables - replace the example below with your own
    public Manufacture product = new Manufacture();
    public Engine eng = new Engine();
    /**
     * Constructor for objects of class Vehicle
     */
    // constructor of the object
    public Vehicle(Manufacture product ,Engine eng)
    {
        product = this.product;
        eng = this.eng;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    // define the show characteristic method which puts the different charachteristics in a string and prints them out
    public void ShowCharacteristics()
    {
       String Str = "id: " + product.getId() + ", Brand: " + product.getMake() + ", Model: " + product.getModel() + ", Year: " +
            product.getYearOfManufacture() + ", Color: " + product.getColor() + ", Price: " + product.getPrice() +
            ", Registeration Number: " + product.getRegisterationNumber()+ ", Engine Type: " + eng.getName() +"\n";
       System.out.println(Str);
    }
}
