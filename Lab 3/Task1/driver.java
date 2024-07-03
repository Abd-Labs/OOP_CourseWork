public class driver {
    public static void main(String [] args){

        
        savingsAccount saver1 = new savingsAccount(2000.0);
        savingsAccount saver2 = new savingsAccount(3000.0);
        saver1.setIntrestRate(3);

        System.out.println("Account 1");
        saver1.calculateMonthlyIntrest();
        System.out.println("Account 2");
        saver2.calculateMonthlyIntrest();

        saver1.modifyIntrestRate(4);

        System.out.println();
        System.out.println("Next Month's Intrest ");

        System.out.println("Account 1");
        saver1.calculateMonthlyIntrest();

        System.out.println();
        System.out.println("Account 2");
        saver2.calculateMonthlyIntrest();

    }
}
