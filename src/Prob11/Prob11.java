package Prob11;

import java.util.ArrayList;

/**
 *  Author: Salman
 *
 *  This program has numbers of double format stored in a string which it displays along with their total,
 *  average, lowest value and highest value
 */
public class Prob11 {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     */
    public static void main(String[] args) {

        //hardcoded array as instructed in problem 11
        ArrayList<Double> nums = new ArrayList<>();
        nums.add(1.5);
        nums.add(2.8);
        nums.add(5.6);
        nums.add(-29.2);
        nums.add(18.8);
        nums.add(57.3);

        //data in the hardcoded array is displayed
        System.out.println("Test data in Array is: ");
        for(int i = 0; i < nums.size(); i++)
            System.out.println(nums.get(i));

        //results obtained from methods are displayed
        System.out.printf("\nTotal is: %.2f\n", getTotal(nums));
        System.out.printf("Average is: %.2f\n", getAverage(nums));
        System.out.printf("Highest value is: %.2f\n", getHighest(nums));
        System.out.printf("Lowest value is: %.2f\n", getLowest(nums));
    }

    /**
     * Gets total of values in the array passed
     * @param nums the hardcoded array of double numbers is received
     * @return total of values stored in nums
     */
    public static double getTotal (ArrayList<Double> nums){
        double tot = 0.0;
        for(double num: nums)
            tot += num;
        return tot;
    }

    /**
     * Gets average of values in the array passed
     * @param nums the hardcoded array of double numbers is received
     * @return average of the values stored in nums
     */
    public static double getAverage (ArrayList<Double> nums){
        double tot = 0.0;
        for(double num: nums)
            tot += num;
        return (tot/(nums.size()));
    }

    /**
     * Gets highest of the values in array passed
     * @param nums the hardcoded array of double numbers is received
     * @return highest of the values stored in nums
     */
    public static double getHighest (ArrayList<Double> nums){
        double max = nums.get(0);
        for (int i = 1; i < nums.size(); i++){
            if (nums.get(i) > max)
                max = nums.get(i);
        }
        return max;
    }

    /**
     * Gets lowest of the values in array passed
     * @param nums the hardcoded array of double numbers is received
     * @return lowest of the values stored in nums
     */
    public static double getLowest (ArrayList<Double> nums){
        double min = nums.get(0);
        for (int i = 1; i < nums.size(); i++){
            if (nums.get(i) < min)
                min = nums.get(i);
        }
        return min;
    }

}
