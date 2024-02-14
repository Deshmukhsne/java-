import java.util.Scanner;

public class bank {
    int id;
    String name;
    int balance;

     // Default constructor
    public bank() {
        id = 22;
        name = "Viraj";
        balance = 900;
    }

    // Parameterized constructor
    public bank(int id1, String name1, int balance1) {
        id = id1;
        name = name1;
        balance = balance1;
    }

    // Method to show account details and perform operations
    void show() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your account id: " + id);//Showcase the Account Id
        System.out.println("Name of Name is: " + name);//Showcase the Name 
		System.out.println("------------------------Bank Operation--------------------------------------")
        System.out.println("Enter the option you want to do:\n 1]Check balance \n 2]Credit amount \n 3]Debit amount ");
        int num = sc.nextInt();
//Options To Choose
        switch (num) {
            case 1:
                System.out.println("Want To check balance : = ");
                System.out.println("  Balance is  : =" + balance);
                break;

            case 2:
                System.out.println("Want To Credit Amount : = ");
                System.out.println("  Enter amount you want to credit : = ");
                int newBalance = sc.nextInt();
                balance += newBalance; // Update the balance
                System.out.println("New Balance := " + balance);
                break;

            case 3:
                System.out.println("Minimum balance should be 500  : = ");
                if (balance > 500) {
                    System.out.println("You can withdraw amount as you have the minimum balance");
                } else {
                    System.out.println("You don't satisfy the minimum balance");
                }
                break;

            default:
                System.out.println("Invalid Entry ");
                break;
        }
    }

    public static void main(String args[]) {
        bank bk = new bank();
        bk.show();
    }
}
