
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// this class is the same as car class which was defined in second hometask and has the attributes and methods so i wont explain this file
public class Manufacture
{
    // instance variables - replace the example below with your own
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
    
    public Manufacture()
    {
        this.id = id;
        this.make = make;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registerationNumber = registerationNumber;
    }

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
    public void setId(int newId)
    {
        id = newId;
    }
    public void setMake(String newMake) {
        make = newMake;
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    public void setYearOfManufacture(int newYear) {
        yearOfManufacture = newYear;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }
    public void setColor(String newColor) {
        color = newColor;
    }
    public void setRegisterationNumber(String newRegisterationNumber){
        registerationNumber = newRegisterationNumber;
    }
}
