import java.util.LinkedList;
import java.util.Queue;

// I assumed that this was the program I was supposed to modify
// https://github.com/ljsnell/Week-8/blob/f9c09ab4e38f320bb8a5a91437749cc5a9a85874/ExampleQueueImplementation.java
public class Main {

  public static void main(String[] args) {
    Queue<String> line = new LinkedList<>();
    // I changed the abbreviations to be more readable
    char letter = 'A';
    int time = 0;
    int randomNumber;
    int lineRandomNumber; // I added this second random number for choosing which line to act upon

    String person = "" + letter + letter + letter;
    line.add(person);

    Queue<String> secondLine = new LinkedList<>(); // Here is the second line

    while (time < 40) {
      lineRandomNumber = (int) (Math.random() * 2); // Added line
      randomNumber = (int) (Math.random() * 6);

      // I changed the the randomization logic to be a 50/50 chance
      if (randomNumber < 3) {
        letter++;
        person = "" + letter + letter + letter;

        // Now the program chooses which line to act upon based on lineRandomNumber
        (lineRandomNumber == 0 ? line : secondLine).add(person);
      } else {
        // Same story here
        (lineRandomNumber == 0 ? line : secondLine).poll();
      }
      // Print both lines instead
      System.out.println(
        "Time " + time + " : Line 1: " + line + ", Line 2: " + secondLine
      );
      time++;
    }
  }
}
