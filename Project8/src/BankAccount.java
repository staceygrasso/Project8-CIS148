import java.util.Scanner;

public class BankAccount {

   private int accountNo;
   private double balance;
   private String lastName;
   private String firstName;

   public BankAccount(String lname, String fname, int acctNo) {
      lastName = lname;
      firstName = fname;
      accountNo = acctNo;
      balance = 0.0;
   }

   public void deposit(int acctNo, double amount) {   // This method is to check that account number is valid, and amount if positive before performing deposit
      balance = balance + amount;
   }

   public void withdraw(int acctNo, double amount) {  //This method should check that account number is valid, and balance in account before performing withdrawl
      balance = balance - amount;
   }

   public double getBalance() {
       return balance;
   }

   public String getLastName() {
       return lastName;
  }

   public String getFirstName() {
       return firstName;
  }

   public int getAcctNo() {
       return accountNo;
  }



   public static void main (String [] args) {
   	   String last, first;   //name and account number for new object
   	   int acct;

   	   Scanner in = new Scanner(System.in);    //create Scanner for input
  	   BankAccount one;

   	   // create bank account object
   	   System.out.println("Enter last name");
   	   last = in.nextLine();

   	   System.out.println("Enter first name");
   	   first = in.nextLine();

   	   System.out.println("Enter account number");
   	   acct = in.nextInt();

   	   one = new BankAccount(last, first, acct);

     /*  Add code which:
      *
      *
      *      CREATES 1 more object
      *
      *      PRINTS OUT THE INFORMATION IN both objects
      *
      *      ALLOWS THE USER TO enter an account number, and an ammount to deposit
      *
      *
      *      ALLOWS THE USER TO enter an account number, and an amount to withdraw
      *
      *      PRINTS OUT THE INFORMATION IN both objects
      */


   }
}