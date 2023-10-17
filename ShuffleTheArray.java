import java.util.Arrays;
import java.util.Random;

class ShuffleTheArray {
    public static void main(String[] args) {

          // Create an array of integers to shuffle
        int originalArray[] = {1, 2, 3, 4, 5, 6, 7};
        
          // Create a Random object for generating random indices
        Random randomGenerator = new Random(); 
        
        // Iterate through the array and shuffle its elements
        for (int i = 0; i <= originalArray.length - 1; i++) {
            // Generate a random index to swap with the current index
            int randomIndex = randomGenerator.nextInt(originalArray.length - 1);

            // Swap the elements at randomIndex and currentIndex
            int temporaryValue = originalArray[randomIndex];
            originalArray[randomIndex] = originalArray[i];
            originalArray[i] = temporaryValue;
        }
          // Print the array
        System.out.println("Shuffled array is : " + Arrays.toString(originalArray));
    }
}








