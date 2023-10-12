
/**
 * Write a description of class CubicMile here.
 *
 * @author Danial Rafiee
 * @version (Version 1.0)
 */
public class CubicMile
{
    
    public static void main (String[]args)
    {
        // first we declare the variables
        double Earth_Diameter = 7600; // define the Diameter of earth
        double Sun_Diameter = 865000; // define the diameter of Sun
        double Sun_Volume = 0;
        double Earth_Volume = 0;
        double Ratio = 0;
        // calculate the volume of earth and sun using the formula and the Math class.
        Earth_Volume = 4*Math.PI*(Math.pow(Earth_Diameter/2,3))/3; 
        Sun_Volume = 4*Math.PI*(Math.pow(Sun_Diameter/2,3))/3;
        
        Ratio = Sun_Volume / Earth_Volume;
        // print out the values as results.
        System.out.println("The Volume of the Earth is " + Earth_Volume + " cubic miles, the volume of the sun is " + Sun_Volume + " and the ratio of the volume of the sun to the volume of the earth is " + Ratio);
        
        
    }
}
