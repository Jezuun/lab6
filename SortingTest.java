import java.util.Arrays;

public class SortingTest {

  
    public static void sortAndPrintArray(int[] arr) {
       
        Arrays.sort(arr);
        
      
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

  
    public static void main(String[] args) {
    
        int[] numbers = {5, 3, 8, 1, 2, 7};
        

        sortAndPrintArray(numbers);
    }
}
