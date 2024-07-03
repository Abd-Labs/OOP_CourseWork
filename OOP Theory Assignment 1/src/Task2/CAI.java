package Task2;
import java.util.*;
public class CAI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char check='y';
        while (check=='y'){
            rand.displayQuestion();
            int answer = in.nextInt();

            while (answer!= (rand.a*rand.b)){
                System.out.println("No.Please Try Again ");
                answer = in.nextInt();

            }
            System.out.println("Very Good!");

            System.out.println("Another Question?(y or n)?? ");
            check=in.next().charAt(0);
        }

    }

}
