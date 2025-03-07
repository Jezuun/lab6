import java.util.HashMap;

public class MapTester {

   
    private HashMap<String, String> phoneBook;

 
    public MapTester() {
        phoneBook = new HashMap<>();
    }

  
    public void enterNumber(String name, String number) {
        phoneBook.put(name, number);
    }

   
    public String lookupNumber(String name) {
        return phoneBook.get(name);
    }

    
    
}
