import java.util.Scanner;

public class UtilityBillEstimator {
    public static void main (String[] args){

        // The Variable Declaration
        String username ;
        int accountNumber ;
        double electricityUsage ;
        double waterUsage ;

        // The Scanner Object Creation
        Scanner input = new Scanner (System.in);
        // The User Input
        System.out.print ("Enter your name: ");
        username = input.nextLine ();
        System.out.print("Enter your account number :");
        accountNumber = input.nextInt ();
        System.out.print ("Enter your electricity usage in kWh: ");
        electricityUsage = input.nextDouble ();
        System.out.print ("Enter your water usage in gallons: ");
        waterUsage = input.nextDouble ();

        // The Bill Calculation
        double electricityRate = 0.14; // per kWh
        double waterRate = 0.005; // per gallon
        double electricityBill = electricityUsage * electricityRate;
        double waterBill= waterUsage*waterRate;
        double totalBill = electricityBill + waterBill;

        // Display Bill Summary
        System.out.println ("\n-----------------------------------");
        System.out.println ("\nUtility Bill Summary for " + username);
        System.out.println ("Account Number :" + accountNumber);
        System.out.printf("Electricity Usage %.2f\n" , electricityUsage);
        System.out.printf ("Electricity Rate : $%.2f per kWh\n", electricityRate);
        System.out.printf( "Electricity Bill: $%.2f\n", electricityBill);
        System.out.printf("Water Usage %.2f\n" , waterUsage);
        System.out.printf ("Water Rate : $%.2f per gallon\n", waterRate);
        System.out.printf( "Water Bill: $%.2f\n", waterBill);
        System.out.printf( "Total Bill : $%.2f\n", totalBill);
        System.out.println ("\n-----------------------------------");

        // Close the Scanner
        input.close ();
        
        



    }
}