package Task3;
import java.util.Random;
public class rand {
    static int a,b,c;

   static Random random = new Random();

    public static void displayQuestion(){
        a= random.nextInt(10);
        b= random.nextInt(10);
        System.out.printf("How much is %d times %d \n", a,b);
    }
    public static void response(){
        c= random.nextInt(4)+1;

        switch(rand.c){
            case 1:
                ImprovedCAI.r1="Very Good";
                ImprovedCAI.r2="wrong, Try Once more";
                break;
            case 2:
                ImprovedCAI.r1="keep Up the Good work";
                ImprovedCAI.r2="Don't give up";
                break;
            case 3:
                ImprovedCAI.r1="Excellent";
                ImprovedCAI.r2="No,Please Try again";
                break;
            case 4:
                ImprovedCAI.r1="Nice Work";
                ImprovedCAI.r2="No, Keep Trying";
                break;

        }
    }
}
