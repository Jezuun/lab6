import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned, but duplicate inputs are ignored.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.2 (2025.03.09)
 */
public class InputReader
{
    private Scanner reader;
    private HashSet<String> previousInputs;

    /**
     * Create a new InputReader that reads text from the text terminal.
     * Initializes a HashSet to track unique inputs.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
        previousInputs = new HashSet<>();
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String. Duplicate inputs are ignored.
     *
     * @return  A String typed by the user, or null if the input is a duplicate.
     */
    public String getInput()
    {
        System.out.print("> ");        
        String inputLine = reader.nextLine();

        if (previousInputs.contains(inputLine)) {
            System.out.println("Duplicate input ignored.");
            return null; 
        } else {
            previousInputs.add(inputLine); 
            return inputLine;
        }
    }
}

