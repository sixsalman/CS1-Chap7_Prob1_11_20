package Prob1;

/**
 *  Author: Salman
 *
 *  This class calculates total rainfall, monthly average; figures out month or months with most and least
 *  amount of rainfalls and passes the information to Prob1 class.
 */
public class Rainfall {

    private double[] rain = new double[12]; //double array field with 12 storage locations created
    private double totRain; //variable created to store total

    /**
     * This Constructor copies the values from the parameter array to hte class's array type field
     * which although is not required in this case as the values in the array are not being modified but has
     * been done adhering to good programming techniques.
     * @param rain accepts an array of double type containing inputs obtained from user
     */
    public Rainfall (double[] rain){
        totRain = 0;
        for (int i = 0; i < rain.length; i++) {
            this.rain[i] = rain[i];
            totRain += rain[i];
        }
    }

    /**
     * Gets total amount of rain in the year
     * @return total amount of rain in the year
     */
    public double getTotRain (){
        return totRain;
    }

    /**
     * Gets monthly average for the year
     * @return monthly average for the year
     */
    public double getMonthlyAvg (){
        return (totRain/12);
    }

    /**
     * Gets month of months with most rainfall for the year
     * @return a displayable string containing month or months with most rainfall for the year
     */
    public String getMostRainMonthToString (){
        double max = rain[0];
        String month = "January";
        boolean multi = false;
        for (int i = 1; i < rain.length; i++) {
            if (rain[i] == max){
                multi = true;
                switch ((i+1)){
                    case 2:
                        month += ", February";
                        break;
                    case 3:
                        month += ", March";
                        break;
                    case 4:
                        month += ", April";
                        break;
                    case 5:
                        month += ", May";
                        break;
                    case 6:
                        month += ", June";
                        break;
                    case 7:
                        month += ", July";
                        break;
                    case 8:
                        month += ", August";
                        break;
                    case 9:
                        month += ", September";
                        break;
                    case 10:
                        month += ", October";
                        break;
                    case 11:
                        month += ", November";
                        break;
                    case 12:
                        month += ", December";
                        break;
                }
            } else if (rain[i] > max){
                multi = false;
                max = rain[i];
                switch ((i+1)){
                    case 2:
                        month = "February";
                        break;
                    case 3:
                        month = "March";
                        break;
                    case 4:
                        month = "April";
                        break;
                    case 5:
                        month = "May";
                        break;
                    case 6:
                        month = "June";
                        break;
                    case 7:
                        month = "July";
                        break;
                    case 8:
                        month = "August";
                        break;
                    case 9:
                        month = "September";
                        break;
                    case 10:
                        month = "October";
                        break;
                    case 11:
                        month = "November";
                        break;
                    case 12:
                        month = "December";
                        break;
                }
            }
        }
        if (multi) {
            StringBuilder str = new StringBuilder(month);
            str.replace(str.lastIndexOf(","), (str.lastIndexOf(",") + 1), " and");
            return ("Months with most rainfall: " + str.toString());
        } else {
            return ("Month with most rainfall: " + month);
        }
    }

    /**
     * Gets month of months with least rainfall for the year
     * @return a displayable string containing month or months with least rainfall for the year
     */
    public String getLeastRainMonthToString (){
        double min = rain[0];
        String month = "January";
        boolean multi = false;
        for (int i = 1; i < rain.length; i++) {
            if (rain[i] == min){
                multi = true;
                switch ((i+1)){
                    case 2:
                        month += ", February";
                        break;
                    case 3:
                        month += ", March";
                        break;
                    case 4:
                        month += ", April";
                        break;
                    case 5:
                        month += ", May";
                        break;
                    case 6:
                        month += ", June";
                        break;
                    case 7:
                        month += ", July";
                        break;
                    case 8:
                        month += ", August";
                        break;
                    case 9:
                        month += ", September";
                        break;
                    case 10:
                        month += ", October";
                        break;
                    case 11:
                        month += ", November";
                        break;
                    case 12:
                        month += ", December";
                        break;
                }
            } else if (rain[i] < min){
                multi = false;
                min = rain[i];
                switch ((i+1)){
                    case 2:
                        month = "February";
                        break;
                    case 3:
                        month = "March";
                        break;
                    case 4:
                        month = "April";
                        break;
                    case 5:
                        month = "May";
                        break;
                    case 6:
                        month = "June";
                        break;
                    case 7:
                        month = "July";
                        break;
                    case 8:
                        month = "August";
                        break;
                    case 9:
                        month = "September";
                        break;
                    case 10:
                        month = "October";
                        break;
                    case 11:
                        month = "November";
                        break;
                    case 12:
                        month = "December";
                        break;
                }
            }
        }
        if (multi) {
            StringBuilder str = new StringBuilder(month);
            str.replace(str.lastIndexOf(","), (str.lastIndexOf(",") + 1), " and");
            return ("Months with least rainfall: " + str.toString());
        } else {
            return ("Month with least rainfall: " + month);
        }
    }

}
