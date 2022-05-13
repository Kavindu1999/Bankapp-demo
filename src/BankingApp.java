import java.util.Scanner;

class BankDetails {
    String account_no;
    String name;
    String account_type;
    long balance;
    Scanner sc = new Scanner(System.in);

    public void openAccount() {
        System.out.print("Enter Account No: ");
        account_no = sc.next();
        System.out.print("Enter Account type: ");
        account_type = sc.next();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }

    public void showAccount() {
        System.out.println("Name of account holder: " + name);
        System.out.println("Account no.: " + account_no);
        System.out.println("Account type: " + account_type);
        System.out.println("Balance: " + balance);
    }

}

public class BankingApp {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number of customers do you want to input? ");
        int n = sc.nextInt();
        BankDetails[] C = new BankDetails[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new BankDetails();
            C[i].openAccount();

        }

        int choice;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println("1. Display all account details \n 2.Exit ");
            System.out.println("Enter your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[i].showAccount();
                    }
                    break;

                case 2:
                    System.out.println("👋👋👋");
                    break;
            }
        } while (choice != 2);
    }
}