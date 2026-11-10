import java.util.Scanner;

class ATM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Balance: Rs." + balance);
        }
        else if (choice == 2) {
            System.out.print("Enter amount: ");
            int amount = sc.nextInt();
            balance = balance + amount;
            System.out.println("New Balance: Rs." + balance);
        }
        else if (choice == 3) {
            System.out.print("Enter amount: ");
            int amount = sc.nextInt();

            if (amount <= balance && amount > 0) {
                balance = balance - amount;
                System.out.println("New Balance: Rs." + balance);
            }
            else {
                System.out.println("Insufficient Balance");
            }
        }
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
