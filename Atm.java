import java.util.*;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 4 digit pin:-");
        int digit = sc.nextInt();
        int num = 0;
        int balance = 10000;
        while(num != 4) {
            System.out.println("Welcome!");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");
            System.out.println("Enter your choice (1/2/3/4):");
            num = sc.nextInt();
            switch(num) {
                case 1:
                    System.out.println("Your current balance is "+balance);
                    break;
                case 2:
                    System.out.println("Enter your withdraw amount: ");
                    int w = sc.nextInt();
                    if(balance < w){
                        System.out.println("Insufficient balance");
                    }
                    else if(balance > w && w % 100 != 0) {
                        System.out.println("Please enter valid amount");
                    }
                    else{
                        balance -=w;
                        System.out.println("Withdraw Successfull");
                    }
                    break;
                case 3:
                    System.out.println("Enter your deposit amount: ");
                    int d = sc.nextInt();
                    balance +=d;
                    System.out.println("Deposit Successfull");
                    break;
                case 4:
                    System.out.println("Thank you");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
