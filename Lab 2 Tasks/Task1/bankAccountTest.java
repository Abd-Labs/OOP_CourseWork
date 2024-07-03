import java.util.*;
public class bankAccountTest
{
   public static void main (String[] args) 
{
   Scanner in= new Scanner(System.in);

   bankAccount acc=new bankAccount();

   //taking input from the user
   System.out.println("Enter Your Account Number");
   acc.accountNumber=in.nextInt();
   System.out.println("Enter Your Account title");
   acc.accountTitle=in.nextLine();
   System.out.println("Enter your Account Balance");
   acc.balance=in.nextFloat();

   // calling method of bankAccount class
   acc.displayInfo();;
}
}