package Task2;
import java.util.Random;
public class rand {
    static int a,b;

   static Random random = new Random();

    public static void displayQuestion(){
        a= random.nextInt(10);
        b= random.nextInt(10);
        System.out.printf("How much is %d times %d \n", a,b);
    }
}
