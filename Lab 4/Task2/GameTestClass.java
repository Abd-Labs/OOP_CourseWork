import java.util.*;
public class GameTestClass {
    public static void main( String [] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Current Score: "+ GuessTheWord.score);
        char check='y';

        while(check=='y'){
         
        GuessTheWord.LevelOne("How ", "are", "you");

        System.out.println("Score :"+ GuessTheWord.score);
        // asking user if he wants to guess again
        System.out.println("Do You want to guess again?");
        check = in.next().charAt(0);

        }
        // if score is greater than 10 call the Leveltwo method
    if (GuessTheWord.score>=10){
         GuessTheWordLevelTwo.LevelTwo();
    }
    }
}
