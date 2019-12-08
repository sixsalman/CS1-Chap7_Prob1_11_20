package Prob1;
import java.util.Scanner; //util package's Scanner class imported

/**
 *  Author: Salman
 *
 *  This program asks user for amount rainfall for each month and outputs the year's total,
 *  monthly average and months with least and most amount(s).
 */
public class Prob1 {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     */
    public static void main(String[] args) {

        double[] rain = new double[12]; //double array with 12 storage locations created

        Scanner kbd = new Scanner(System.in); //Scanner object named kbd created

        double monthRainfall; //variable declared to hold every entry temporarily for validation

        //user is asked rainfall amount for every month
        for (int i = 0; i < rain.length; i++){
            boolean isValid = false; //boolean declared to be used for validation
            //validates user's entries
            while (!isValid){
                System.out.print("Enter amount of rainfall for ");
                switch ((i + 1)) {
                    case 1:
                        System.out.print("January: ");
                        break;
                    case 2:
                        System.out.print("February: ");
                        break;
                    case 3:
                        System.out.print("March: ");
                        break;
                    case 4:
                        System.out.print("April: ");
                        break;
                    case 5:
                        System.out.print("May: ");
                        break;
                    case 6:
                        System.out.print("June: ");
                        break;
                    case 7:
                        System.out.print("July: ");
                        break;
                    case 8:
                        System.out.print("August: ");
                        break;
                    case 9:
                        System.out.print("September: ");
                        break;
                    case 10:
                        System.out.print("October: ");
                        break;
                    case 11:
                        System.out.print("November: ");
                        break;
                    case 12:
                        System.out.print("December: ");
                        break;
                }
                monthRainfall = kbd.nextDouble();
                if (monthRainfall < 0) {
                    System.out.println("Negative responses are not accepted.");
                } else {
                    rain[i] = monthRainfall;
                    isValid = true;
                }
            }
        }

        kbd.close(); //Scanner kbd closed

        Rainfall rainStat = new Rainfall(rain); //A instance of Rainfall called rainStat is created

        //outputs are displayed
        System.out.printf("\nTotal rainfall this year: %.2f\n", rainStat.getTotRain());
        System.out.printf("Average monthly rainfall: %.2f\n", rainStat.getMonthlyAvg());
        System.out.println(rainStat.getMostRainMonthToString());
        System.out.println(rainStat.getLeastRainMonthToString());

    }

}
