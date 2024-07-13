import java.text.NumberFormat;

public class Mortgage {
    // Static Constants
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    
    // Private Variables
    private int principal; 
    private float annualInterest;
    private byte years; 
    private float monthlyInterest;
    private float numberOfPayments;

    public Mortgage(int principal, float annualInterest , byte years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years; 
        monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        numberOfPayments = years * MONTHS_IN_YEAR;
    }

    public void printMortgage() {
        double mortgage = calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double balance = calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public double calculateMortgage() {
        double mortgage = principal
            * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }
    
}