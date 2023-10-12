import java.io.FileWriter;
import java.io.IOException;

/**
 * Write a description of class Main here.
 *
 * @author Danial Rafiee
 * @version 1.0
 */
public class Main
{
    // instance variables - replace the example below with your own
    public static void main(String[]args){
        // define an array of cars with different models and information
        Car[] Cars = {
        new Car(100, "BMW", "730", 2022 , "Black" , 50000 , "SSA256"),
        new Car(101, "BMW", "830", 2021 , "Blue" , 35000 , "DJF215"),
        new Car(102, "BMW", "730", 2022 , "Black" , 20000 , "SKD232"),
        new Car(103, "Benz", "Gclass", 2005 , "Red" , 25000 , "LPL212"),
        new Car(104, "Benz", "Gclass", 2009 , "White" , 15000 , "XSA256"),
        new Car(105, "Benz", "Eclass", 2021 , "Black" , 37000 , "SSA256"),
        new Car(106, "Toyota", "Camary", 2018 , "White" , 23000 , "SSA256"),
        new Car(107, "Toyota", "Landcruiser", 2017 , "Black" , 80000 , "SSA256"),
        new Car(108, "Toyota", "Camry", 2015, "Red", 17500, "ABC123"),
        new Car(109, "Honda", "Civic", 2013, "Blue", 10000, "XYZ789")
    };
    // this is the variable for the first sorter which is the brands
    String Brandsorter = "Benz";
    // these are the variables for the second sorter which are age and model of the car
    String Modelsorter = "730";
    int agesorter = 10;
    // these are the variables for the thirs sorter which are price and year of manufacture
    int yearsorter = 2021;
    double pricesorter = 25000;
    // we use filewriter class to creat text files
    try{
        // defining the instances for the 3 sorting files with their names
        FileWriter Brandwriter = new FileWriter("brands.txt");
        FileWriter Modelwriter = new FileWriter("Modelsandyear.txt");
        FileWriter Pricewriter = new FileWriter("Prices.txt");
        // iterate over the cars array
    for (Car element: Cars){
        // check if the car has the asked brand
        if (element.make.equals(Brandsorter))
        {
            //create s string of the information of the car
            String Str = "id: " + element.id + ", Brand: " + element.make + ", Model: " + element.model + ", Year: " +
            element.yearOfManufacture + ", Color: " + element.color + ", Price: " + element.price + ", Registeration Number: " + element.registerationNumber+"\n";
            // writng that string the file
            Brandwriter.write(Str);
        }
        // check if the car has the asked model and its age is more than asked age
        if (element.model.equals("Gclass") && 2023 - element.yearOfManufacture > agesorter)
        {
            //create s string of the information of the car
            String Str = "id: " + element.id + ", Brand: " + element.make + ", Model: " + element.model + ", Year: " +
            element.yearOfManufacture + ", Color: " + element.color + ", Price: " + element.price + ", Registeration Number: " + element.registerationNumber+"\n";
            // writng that string the file
            Modelwriter.write(Str);
        }
        // check if the car has the asked year of manufacture and has a price more than asked price
        if (element.yearOfManufacture == yearsorter && element.price >= pricesorter)
        {
            //create s string of the information of the car
            String Str = "id: " + element.id + ", Brand: " + element.make + ", Model: " + element.model + ", Year: " +
            element.yearOfManufacture + ", Color: " + element.color + ", Price: " + element.price + ", Registeration Number: " + element.registerationNumber+"\n";
            // writng that string the file
            Pricewriter.write(Str);
        }
    }
    Brandwriter.close();
    Modelwriter.close();
    Pricewriter.close();
    }
    catch (IOException error){
        System.out.println("Error");
        error.printStackTrace();
    }
    }
    }

