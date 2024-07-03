import java.util.*;

public class GuessTheWord {
   static  Scanner in = new Scanner(System.in);

   static int score=0;
   // three words as input in constructor
    public static void LevelOne(String word1, String word2, String word3){
      String input;

      //taking input for guess of user
        System.out.println("Enter your Guess ");
        input=in.next();

        //comparing input and words in constructor and updating score accordingly
        if (input.equals(word1)) {
            score+=-1;
        }
        if (input.equals(word2)) {
            score+=5;
        }
        if (input.equals(word3)) {
            score+=1;
        }
    }
}
