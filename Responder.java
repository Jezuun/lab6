/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
import java.util.HashMap;

public class Responder
{
    private HashMap<String, String> responsesMap;

    private String problem;
    private String solution;
    /**
     * Construct a Responder and initialize the response map
     */
    public Responder()
    {
        responsesMap = new HashMap<>();
    }

    /**
     * Fill the responses map with known words and their associated responses.
     */
    private void fillResponsesMap(String problem, String solution)
    {
        responsesMap.put("printer", "Try restarting your printer or checking the connection.");
        responsesMap.put("internet", "Please check your network connection or restart your router.");
        responsesMap.put("password", "Ensure you're typing the correct password, and check for caps lock.");
        responsesMap.put("screen", "Try adjusting the brightness or check if the monitor is connected properly.");
    }

    /**
     * Generate a response based on the provided input word.
     * @param word  The word received from the user input
     * @return      The response associated with the word, or a default message if no match is found
     */
    public String generateResponse(String word)
    {
        if (responsesMap.containsKey(word))
        {
            return responsesMap.get(word);
        }
        else
        {
            return pickDefaultResponse();
        }
    }

    /**
     * Return a default response if no matching word is found.
     * @return  A default response message
     */
    private String pickDefaultResponse()
    {
        return "I'm sorry, I don't understand the issue. Could you please describe it in more detail?";
    }
}

