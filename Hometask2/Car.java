
/**
 * Write a description of class Car here.
 *
 * @author Danial Rafiee
 * @version 1.0
 */
public class Car
{
    // defining the isntance variables
    public int id;
    public String make;
    public String model;
    public int yearOfManufacture;
    public String color;
    public double price;
    public String registerationNumber;
    
    /**
     * Constructor for objects of class Car
     */
    public Car(int id,String make, String model, int yearOfManufacture, String color, double price, String registerationNumber)
    {
        //defining the constructors and instance variables
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registerationNumber = registerationNumber;
    }
    // defining the get methods which return that attribute of the object
    public int getId()
    {
        return id;
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }
    public String getColor() {
        return color;
    }
    public String getRegisterationNumber(){
        return registerationNumber;
    }
}
