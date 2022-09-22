import java.util.Scanner;
import java.text.DecimalFormat;


public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");
        System.out.println("Welcome to the tip calculator!");

        System.out.print("How many people in your group?"); //# of guests
        int numberOfGuests = scan.nextInt();
        scan.nextLine();

        System.out.print("What's the tip percentage? (0-100): "); //tip percentage
        int tip = scan.nextInt();
        scan.nextLine();


        double itemCost = 0.0; //initialize to 0: variable will represent final cost of all items
        System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
        double item = scan.nextDouble();

        while (item != -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            item = scan.nextDouble();
            scan.nextLine();
            itemCost = itemCost + item;
        }

        System.out.println("------------------------------");

        double totalTip = itemCost * (tip / 100);
        String formattedTip = formatter.format(totalTip);
        double perPersonCostBeforeTip = itemCost / numberOfGuests;
        String formattedCostBeforeTip = formatter.format(perPersonCostBeforeTip);
        double perPersonTipCost = tip / numberOfGuests;
        String formattedPerPersonTipCost = formatter.format(perPersonTipCost);

        System.out.println("Total Bill Before Tip: " + itemCost);
        System.out.println("Tip Percentage: " + tip);
        System.out.println("Total Tip: " + formattedTip);
        System.out.println("Total Bill with Tip: " + (itemCost + totalTip));
        System.out.println("Per Person Cost Before Tip: " + formattedCostBeforeTip);
        System.out.println("Tip Per Person: " + formattedPerPersonTipCost);
        System.out.println("Total Cost Per Person: " + (perPersonCostBeforeTip + perPersonTipCost));
    }
}