package Task4;
import java.util.*;
public class Archery  {
    public static void main(String[] args) {

        int[][] player = new int[3][5];

        // creating three new arrays on each index of player
        for (int i = 0; i < player.length; i++) {
            player[i] = new int[5];
        }

        // assigning Player Numbers through loop in first column of all arrays
        for (int i = 0; i < 3; i++) {
            player[i][0]=i+1;
        }
        //object of class random
        Random rand = new Random();

        int sum=0;
        //this loop traverses across all the indexes of 2-D array except first index of all arrays
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 5; j++) {

                if (j==4){ // if loop is on Last index then place sum on that index
                    player[i][j]=sum;
                }
                else { // this else block places random number on each turn index of array
                    player[i][j] = rand.nextInt(10);
                    sum+=player[i][j]; // calculates sum of each players's turns
                }
            }
        }

        int highest=player[0][4];
        // printing score table using Loop
        System.out.println("  Player Turn1  Turn2 Turn3 Total Score");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%6d", player[i][j]);
            }
            // checking highest total in last columns of all arrays
            if ((player[i][4] > highest)) {
                highest = player[i][4];
            }
            System.out.println();
        }

        // printing which player won
        for (int i = 0; i < 3; i++) {
            if (player[i][4]==highest){
                System.out.printf("player %d Has Won ", i+1);
            }
        }
    }
}
