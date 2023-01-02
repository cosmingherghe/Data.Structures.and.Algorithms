import java.text.DecimalFormat;

public class Swissknife {
  
  public static void computeLoan(double anualInterestRate, int numberOfYears, double loan) {
    double monthlyInterestRate = anualInterestRate / 1200;
    double monthlyPayment = loan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    double totalPayment = monthlyPayment * numberOfYears * 12;

    System.out.println("Monthly payment is: " + (int)(monthlyPayment * 100) / 100.0);
    System.out.println("Total payment is: " + new DecimalFormat("#,###.##").format((totalPayment * 100) / 100.0));
    System.out.println("Total interest payed: " + new DecimalFormat("#,###.##").format(((totalPayment - loan) * 100) / 100.0));
  }
}
