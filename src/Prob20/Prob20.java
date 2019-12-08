package Prob20;
import java.util.Scanner; //util package's Scanner class imported

/**
 *  Author: Salman
 *
 *  This program asks user for single digit integers and stores them in a square array. It then decides and
 *  outputs whether the square is a Lo Shu Magic Square or not.
 */
public class Prob20 {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     */
    public static void main(String[] args) {

        int[][] square = new int[3][3]; //square array of integer type created
        Scanner kbd = new Scanner(System.in); //a Scanner object named kbd created

        //gets values for every storage value from user
        for(int i = 0; i < square.length; i++){
            for(int j = 0; j < square[i].length; j++){
                System.out.print("Enter an integer (1-9) for row " + i + " column " + j +": ");
                square[i][j] = kbd.nextInt();
            }
        }

        kbd.close(); //Scanner kbd closed

        //Outputs whether the square is a Lo Shu Magic Square or not
        if (isLoShuMagicSquare(square)) {
            System.out.println("\nIt is a Lo Shu Magic Square.");
        } else {
            System.out.println("\nIt is not a Lo Shu Magic Square.");
        }
    }

    /**
     *Figures out whether the square is a Lo Shu Magic Square or not
     * @param square receives a 2-d square array holding values obtained from user
     * @return a boolean indicating whether the square is a Lo Shu Magic Square or not
     */
    public static boolean isLoShuMagicSquare (int[][] square){
        int sumRow; //to hold sum of each row
        int sumCol; //to hold sum of each column
        int diag1 = 0; //to hold sum of one of the diagonals
        int diag2 = 0; //to hold sum of the other diagonal
        int[] digCount = new int[10]; //to hold no. of times each no. (0-9) occurs

        //gives all indices of digCount a value of 0
        for(int i : digCount){
            i = 0;
        }

        //checks whether any digit is repeated or is out of range
        for(int i = 0; i < square.length; i++){
            for(int j = 0; j < square[i].length; j++){
                switch (square[i][j]){
                    case 0:
                        digCount[0]++;
                        break;
                    case 1:
                        digCount[1]++;
                        break;
                    case 2:
                        digCount[2]++;
                        break;
                    case 3:
                        digCount[3]++;
                        break;
                    case 4:
                        digCount[4]++;
                        break;
                    case 5:
                        digCount[5]++;
                        break;
                    case 6:
                        digCount[6]++;
                        break;
                    case 7:
                        digCount[7]++;
                        break;
                    case 8:
                        digCount[8]++;
                        break;
                    case 9:
                        digCount[9]++;
                        break;
                }
                if(square[i][j] > 9 || square[i][j] < 0)
                    return false;
            }
        }

        for(int i : digCount){
            if(i > 1)
                return false;
        }

        //sums made and compared
        for(int i = 0; i < square.length; i++){
            sumRow = 0;
            sumCol = 0;
            for(int j = 0; j < square[i].length; j++){
                sumRow += square[i][j];
                sumCol += square[j][i];
                if (i == j)
                    diag1 += square[i][j];
                if((i == 0 && j == 2) || (j == 0 && i == 2) || (j == 1 && i == 1))
                    diag2 += square[i][j];
            }
            if (sumRow != sumCol){
                return false;
            }
        }
        if (diag1 != diag2){
            return false;
        }
        return true;
    }

}
