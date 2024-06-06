import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //creating the loan
        Scanner myObj = new Scanner(System.in);
        System.out.println("How much do you own");
        int carLoan= myObj.nextInt();
        System.out.println("What is the length of the loan");
        int loanLength = myObj.nextInt();
        System.out.println("What is the interest rate of the loan");
        int interestRate= myObj.nextInt();
        System.out.println("how much are you paying?");
        int downPayment=myObj.nextInt();
        if(loanLength <= 0 || interestRate <=0){ //Taking the loan
            System.out.println("Error, You must take a valid car loan.");

        } else if(downPayment >= carLoan){ //Paying the loan if conditions are met
            System.out.println("The car can be paid in it's enterity");
        }else{
            //Showing how much is the monthly payment
            int remainingBalance = carLoan -downPayment;
            int months = loanLength *12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance *interestRate) /100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Your monthly payment is: "+monthlyPayment);

        }
    }
}