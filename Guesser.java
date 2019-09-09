import java.io.Console;
import java.util.Scanner;

public class Guesser{
  private int low;
  private int high;

public Guesser(int low, int high){
  this.low = low;
  this.high = high;
}

public void start(){
  rules();
  doGuesses();
}

private void rules(){
  System.out.println("Think of a number between " +
                       low + " and "  + high);
  System.out.println("I'm going to ask a few questions in order " +
                       "to guess the number.");
  System.out.println("Please answer T for true, and F for false.\n");
}

private String getReply(){
   String reply ="";
   Scanner scan = new Scanner(System.in);

    while(!reply.equals("T") && !reply.equals("F")){
          System.out.println("Please answer T or F");
                reply = scan.nextLine();
  }
  return reply;
}

private void doGuesses(){
  int i=0; // number of guesses
  int middle=0;
    while(low<high){
      middle=(low + high)/2;

      System.out.println("Is the number less than or equal to " +
                         middle + "?");
      String reply = getReply();
      if("T".equals(reply)){
        high = middle;
      }else{
        // The number is greater than middle,
        // so we move up low to middle + 1
        low = middle + 1;
      }
      
      i++; // One more guess!
    }
    // When low has met high, we don't enter the loop
    // and we have found the number
    answer(low, i);
  }

  private void answer(int guess, int numberOfGuesses){
    System.out.println("You were thinking about " +
                       guess +
                       " (took me " + numberOfGuesses +
                       " guesses)");
  }

  public String toString(){
    return "low: " + low + "high: " + high ;
  }
}
