import java.util.*;
//class representing a Bank Account
class BankAccount{
     private double balance;

     //constructor to initialize account balance
     public BankAccount(double initialBalance){
        this.balance=initialBalance;
     }

     //method to deposit money
     public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
        else{
            System.out.println("Invalid deposit amount.");
        }
     }

     //method to withdraw money
     public boolean withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            return true;
        }
        else if(amount > balance){
            System.out.println("Insufficient balance.");
            return false;
        }
        else{
            System.out.println("Invalid withdrawal amount.");
                return false;
        }
     }

     //method to check balance
     public double checkBalance(){
        return balance;
     }
}

//class representing an ATM machine
class ATM{
    private BankAccount account;

    //constructor to initialize ATM with a bank account
    public ATM(BankAccount account){
        this.account=account;
    }

    //method to withdraw from the account
    public void withdraw(double amount){
        if(account.withdraw(amount)){
            System.out.println("Transaction successful.");
        }
        else{
            System.out.println("Transaction failed.");
        }
    }

    //method to deposit into account
    public void deposit(double amount){
       account.deposit(amount);
            System.out.println("Deposit successful.");
        }

        //method to display the balance
        public void checkBalance(){
            System.out.println("Current balance:" + account.checkBalance());
        }

        //Displaying the user interface for ATM options
        public void displayMenu(){
            System.out.println("\nWelcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
        }

        //functions to handle user actions based on input
        public void processUserInput(int option,double amount){
            switch(option){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(amount);
                    break;
                case 3:
                    withdraw(amount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
    
//main class to test the ATM functionality
public class AtmInterface {
    public static void main(String args[]){
        //creating a bank account with an initial balance
        BankAccount account = new BankAccount(500.00);

        //creating an ATM instance linked to the bankAccount
        ATM atm = new ATM(account);

        //Example usage
        atm.displayMenu();
      
        System.out.println("Please Select one of the above option and amount if you want transaction");
        Scanner sc=new Scanner(System.in);
        int opt=sc.nextInt();
        float amount=sc.nextFloat();
        atm.processUserInput(opt,amount);
      
    }
}
