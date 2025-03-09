import java.util.HashMap;
import java.util.HashSet;

public class SupportSystem
{
    private InputReader reader;
    private HashMap<String, String> responsesMap;

    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responsesMap = new HashMap<>();
        fillResponsesMap();  
    }

    /**
     * Fill the responses map with known words and their associated responses.
     */
    private void fillResponsesMap()
    {
        responsesMap.put("printer", "Try restarting your printer or checking the connection.");
        responsesMap.put("internet", "Please check your network connection or restart your router.");
        responsesMap.put("password", "Ensure you're typing the correct password, and check for caps lock.");
        responsesMap.put("screen", "Try adjusting the brightness or check if the monitor is connected properly.");
    }

    /**
     * Generate a response based on the provided input word set.
     * @param words  The set of words received from the user input
     * @return       The response associated with the word, or a default message if no match is found
     */
    public String generateResponse(HashSet<String> words)
    {
        for (String word : words) {
            String response = responsesMap.get(word);
            if (response != null) {
                return response;
            }
        }
        return pickDefaultResponse(); // Return default response if no match is found
    }

    /**
     * Return a default response if no matching word is found.
     * @return  A default response message
     */
    private String pickDefaultResponse()
    {
        return "I'm sorry, I don't understand the issue. Could you please describe it in more detail?";
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while (!finished) {
            String inputLine = reader.getInput(); // Get user input as a string
            // Split the input into words and store them in a HashSet
            HashSet<String> words = new HashSet<>();
            for (String word : inputLine.split("\\s+")) {
                words.add(word.toLowerCase()); // Add each word to the HashSet (in lowercase for consistency)
            }

            if (words.contains("bye")) {
                finished = true;
            } else {
                String response = generateResponse(words); // Pass HashSet to the response generator
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}


// question 40 The Arrays class provides a variety of utility methods for working with arrays, including:
// 1. Arrays.sort() - Sorts the elements of the array in ascending order.
// 2. Arrays.binarySearch() - Performs a binary search on a sorted array to find a specific element.
// 3. Arrays.equals() - Compares two arrays to check if they are equal (same length and same elements).
// 4. Arrays.fill() - Fills an array with a specified value.
// 5. Arrays.copyOf() - Creates a new array by copying elements from an existing array, with a specified length.




