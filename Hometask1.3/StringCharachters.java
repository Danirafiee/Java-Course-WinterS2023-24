
/**
 * Write a description of class StringCharachters here.
 *
 * @author Danial Rafiee
 * @version 1.0
 */
public class StringCharachters
{
    // instance variables - replace the example below with your own

    public static void main(String[] args)
{
    // define the text
    String text = "To be or not to be, that is the question;"
    +"Whether `tis nobler in the mind to suffer"
    +" the slings and arrows of outrageous fortune,"
    +" or to take arms against a sea of troubles,"
    +" and by opposing end them?";
    int spaces = 0,
    vowels = 0,
    letters = 0;
    //YOUR CODE HERE
    // define the vowels as a string
    String Vowels = "aeiou";
    // define all of letters as another string
    String Letters = "abcdefghijklmnopqrstuvwxyz";
    // define a loop to iterate over the text letter by letter
    for (int i = 0;i< text.length(); i++)
    {
        char temp = text.charAt(i); // put each letter in a character variable
        // change the charachter to lowercase to make it right and complete search
        String temp2 = String.valueOf(temp).toLowerCase();
        // condition to find spaces and increment its counter
        if (temp2.equals(" "))
        {
            spaces ++;
        }
        // condition to find vowels and increment its counter
        if (Vowels.contains(temp2))
        {
            vowels ++;
        }
        // condition to find letters and increment its counter
        if (Letters.contains(temp2))
        {
            letters++;
        }
    }
    // printing out the results.
    System.out.println("The text contained vowels: " + vowels + "\n"+ "consonants " + (letters - vowels) + "\n"+" spaces: " + spaces);
}
}

