import java.util.*;

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bal = 1000;  // initial balance

        int ch;
        do {
            System.out.println("\n1.Deposit 2.Withdraw 3.Balance 4.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Amount: ");
                bal += sc.nextDouble();
            } 
            else if (ch == 2) {
                System.out.print("Amount: ");
                double amt = sc.nextDouble();
                if (amt <= bal) bal -= amt;
                else System.out.println("Insufficient balance");
            } 
            else if (ch == 3) {
                System.out.println("Balance: " + bal);
            }

        } while (ch != 4);

        System.out.println("Done");
    }
}
