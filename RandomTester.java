
/**
 * RandomTester class to demonstrate random number generation and responses.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.ArrayList;
public class RandomTester {
    
    // Instance variables
    private Random randomGenerator;  
    private ArrayList<String> responses;  
    
  
    public RandomTester() {
        randomGenerator = new Random();  
        responses = new ArrayList<>();  
        
        // Add possible responses to the list
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("who knows");
        responses.add("ask someone else");
        responses.add("stupid");
    }
    
 
    public void printOneRandom() {
        int randomNumber = randomGenerator.nextInt(); 
        System.out.println("One random number: " + randomNumber);  
    }

 
    public void printMultiRandom(int howMany) {
        int index = 0;
        while (index < howMany) {
            System.out.println("New random number [" + (index + 1) + "]: " + randomGenerator.nextInt(1000));  
            index++;
        }
    }
      public String getResponse(){
      int index = randomGenerator.nextInt(3);
      
      if (index ==0){ return "yes";
        }
      else if (index == 1) {
          return "no";
        }
          else{ 
          return "maybe";
      }
    }
     public String getBetterResponse() {
        int index = randomGenerator.nextInt(6);  
        
        
        return responses.get(index);
    }
     public int generateRandomNumberInRange(int max) {
       
        if (max < 1) {
        System.out.println("Max must be greater than or equal to 1.");
        return -99999;
        }
        else {
       
        return randomGenerator.nextInt(max) + 1;
    }
}

  


}
