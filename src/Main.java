// imports
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // to make imports usable in code
        Scanner s = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("0.00"); // money format

        // print statements + gathering input into variables
        System.out.println("""
                -----------------------------------------------------------------
                | Note! Do not use any symbols when inputting data (no $ or %)! |
                | Also, submit whole numbers for tip percentages.               |
                -----------------------------------------------------------------
                Enter your Bill($):""");

        String first = s.nextLine();
        double totalBill = Double.parseDouble(first);
        System.out.println("Tip Percent:");
        String second = s.nextLine();
        int tipPercent = Integer.parseInt(second);
        System.out.println("Number of People:");
        String third = s.nextLine();
        int numPeople = Integer.parseInt(third);

        // calculating from inputs (what the variables represent can be seen in the print statement after in the same order)
        double totalTip = tipPercent / 100.0 * totalBill;
        double totalBillTip = totalTip + totalBill;
        double tipPerson = totalTip/numPeople;
        double totalPerson = totalBillTip/numPeople;

        // printing results with decimal formatting
        System.out.println("""
                -----------------------------------
                | Total Tip Amount: $""" + (formatter.format(totalTip)) + "        |" + """
                
                -----------------------------------
                | Total Bill Cost: $""" + (formatter.format(totalBillTip)) + "        |" + """
                
                -----------------------------------
                | Tip Per Person: $""" + (formatter.format(tipPerson)) + "          |" + """
                
                -----------------------------------
                | Total Bill Per Person: $""" + (formatter.format(totalPerson)) + "   |" + """
                
                -----------------------------------""");
        s.close(); // good practice :)
    }
}