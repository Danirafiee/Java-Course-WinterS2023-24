
/**
 * Write a description of class Sorter here.
 *
 * @author Danial Rafiee
 * @version 1.0
 */
public class Sorter
{
public static void main(String[] args)
{
    // declate the text
    String text = "To be or not to be, that is the question;"
    +" Whether `tis nobler in the mind to suffer"
    +" the slings and arrows of outrageous fortune,"
    +" or to take arms against a sea of troubles,"
    +" and by opposing end them?";
    // split the words using the spaces and putting them in an array
    // the definition of word which is used here is any words after a space is word.
    String words[] = text.split(" ");
    // iterate over the array of the words
    for (int i = 0; i<words.length-1;i++)
    {
        // compare to words here if the second one was less than the first one we switch their places
        if (words[i].toLowerCase().compareTo(words[i+1].toLowerCase()) > 0)
    {
        // switching the words
        String temp = words[i];
        words[i] = words[i+1];
        words[i+1] = temp;
        // if we are here which means we have switched to words and need to go to begining of the loop and check from the first sp we put the counter -1.
        i= -1;
    }
    }
    // the loop is used to print out the final array which is sorted.
    for (String word: words)
    {
        System.out.println(word);
    }
    
    
}
}
