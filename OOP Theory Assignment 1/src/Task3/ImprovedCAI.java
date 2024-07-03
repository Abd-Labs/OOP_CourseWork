package Task3;
import java.util.*;
public class ImprovedCAI {
    static String r1,r2;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char check='y';

        while (check=='y'){
            rand.displayQuestion();
            int answer = in.nextInt();

            while (answer!= (rand.a*rand.b)){
                rand.response();
                System.out.println(r2);
                answer = in.nextInt();
            }
            rand.response();
            System.out.println(r1);

            System.out.println("Another Question (y or n)?? ");
            check=in.next().charAt(0);
        }

    }


}
