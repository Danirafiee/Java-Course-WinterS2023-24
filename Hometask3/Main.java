import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

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
        // define an array of vehicles with different manufactures and engines
        Vehicle[] vehicles = {
        new BEV(new Manufacture(),new ElectricEngine()),
        new ICEV(new Manufacture(),new CombustEngine()),
        new BEV(new Manufacture(),new ElectricEngine()),
        new ICEV(new Manufacture(),new CombustEngine()),
        new HybridV(new Manufacture(),new HybridEngine()),
        new BEV(new Manufacture(),new ElectricEngine()),
        new HybridV(new Manufacture(),new HybridEngine()),
        new ICEV(new Manufacture(),new CombustEngine()),
        new BEV(new Manufacture(),new ElectricEngine()),
        new HybridV(new Manufacture(),new HybridEngine())
    };
        // define the characteristics of the different vehicles to set them to their instances
        Object data[] = new Object[]{100, "BMW", "730", 2022 , "Black" , 50000.0 , "SSA256","Electric Engine",
            101, "BMW", "830", 2021 , "Blue" , 35000.0 , "DJF215","Combust Engine",
            102, "BMW", "730", 2022 , "Black" , 20000.0 , "SKD232","Electric Engine",
            103, "Benz", "Gclass", 2005 , "Red" , 25000.0 , "LPL212","Combust Engine",
            104, "Benz", "Gclass", 2009 , "White" , 15000.0, "XSA256","Hybrid Engine",
            105, "Benz", "Eclass", 2021 , "Black" , 37000.0 , "SSA256","Electric Engine",
            106, "Toyota", "Camary", 2018 , "White" , 23000.0 , "SSA256","Hybrid Engine",
            107, "Toyota", "Landcruiser", 2017 , "Black" , 80000.0 , "SSA256","Combust Engine",
            108, "Toyota", "Camry", 2015, "Red", 17500.0, "ABC123","Electric Engine",
            109, "Honda", "Civic", 2013, "Blue", 10000.0, "XYZ789","Hybrid Engine"
        };
        // a loop to iterate in the array of vehicles and set different attributes to the objects
    int i = 0;
        for (Vehicle car:vehicles){
            car.product.setId((int)(data[i*8]));
            car.product.setMake((String)(data[i*8 + 1]));
            car.product.setModel((String)(data[i*8 + 2]));
            car.product.setYearOfManufacture((int)(data[i*8 + 3]));
            car.product.setColor((String)(data[i*8 + 4]));
            car.product.setPrice((double)(data[i*8 + 5]));
            car.product.setRegisterationNumber((String)(data[i*8 + 6]));
            car.eng.setName((String)(data[i*8 + 7]));
            i++;
        }
       // a loop to iterate in the vehicles array to show the charachteristics of the different objects
        for (Vehicle car:vehicles){
            car.ShowCharacteristics();
        }
    
      
    
    
    }
}

