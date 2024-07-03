import org.w3c.dom.views.DocumentView;

public class savingsAccount {
    static float intrestRate;

    private double savingsBalance;

    public savingsAccount(double balance){
        savingsBalance=balance;
    }

    public void setIntrestRate(int rate){
        intrestRate=rate;
    }

    public void calculateMonthlyIntrest(){
        Double intrest = (savingsBalance*(intrestRate/100))/12;
        System.out.println("Your Monthly intrest is "+ intrest);
        savingsBalance+=intrest;
        System.out.println("Your New balance is "+ savingsBalance);
    }

    public static void modifyIntrestRate(float rate){
        intrestRate=rate;
    }
}
