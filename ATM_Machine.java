import java.util.Scanner;

public class ATM_Machine{

    public static void main(String args[]){
        int balance=0;

        Scanner sc= new Scanner(System.in);


        while(true){

            System.out.println("ATM MACHINE");
            System.out.println("Enter 1 for Withdraw");
            System.out.println("Enter 2 for Deposit");
            System.out.println("Enter 3 for Check Balance");
            System.out.println("Enter 4 for Exit");

            System.out.println("Choose the operation-");

            int operation= sc.nextInt();

            switch(operation){
                case 1: 
                   System.out.println("Enter money to be withdrawn :-");

                   int withdraw=sc.nextInt();
                   if(withdraw <= balance){
                        balance = balance-withdraw;
                        System.out.println("Collect your cash");
                   }
                   else{
                       System.out.println("Insufficient balance");
                   }
                   System.out.println("");
                   break;

                case 2:
                    System.out.println("Enter money to be deposited :-");

                    int deposit= sc.nextInt();

                    balance=balance + deposit;
                    System.out.println("your money has been deposited successfully");

                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Your Balance is :- "+ balance);

                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }

    }
}