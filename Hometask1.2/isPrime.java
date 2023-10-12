
/**
 * Write a description of class isPrime here.
 *
 * @author Danial Rafiee
 * @version Version 1.0
 */
public class isPrime
{
    public static void main(String[] args)
    {
        // declare the number we want to find the prime numbers till that numbers
        double Numbers = 100;
        // start a loop to check if the number is prime or not 
        test: // test is used for the continue. it defines where it should go when compiles continue
        for(int i = 2 ; i<=Numbers ; i++)
        {

                // in this loop we find the remain of the division of that number over other numbers.
                // the root of the number is used to make it optimal and faster.
                for (int j = 2 ; j <= Math.round(Math.sqrt(i)); j++)
                {
                    if (i%j == 0)
                    {
                        continue test;// continue used instead of break. it goes to the begining of the loop and continue from the outer loop where there is the test:
                    }
                }
            
            System.out.println(i);
            
            
        }
        
    }
}
