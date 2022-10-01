package gr11review.part2;

import java.io.*;

public class Utility {

    public static boolean xyBalance(String str) {

        int xFound = 0;
        int i = 0;

        // While loop to save repitition between x and y
        while (i < str.length()) {

            if (str.charAt(i) == 'x') {

                xFound += 1;

                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == 'y') {
                        xFound = 0;
                        i = j + 1;
                        break;
                    }
                }

                // Found x, but did not find y
                if (xFound > 0) {
                    break;
                }
            }
            i++;
        }
        if (xFound == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int vowelInLine(String line) {
        // Function to count vowels in a word every loop

        String vowels = "aeiou";
        int vowelCount = 0;
        for (int i = 0; i < line.length(); i++) {

            if (vowels.indexOf(line.charAt(i)) >= 0) {
                vowelCount++;

            }
        }
        return vowelCount;
    }

    public static String vowelCount(String filenametxt) throws IOException {
        String mostVowelWord = "";
        int maxVowel = 0;
        BufferedReader input = new BufferedReader(new FileReader(filenametxt));
        String line = input.readLine();

        /*
         * While there is a character in line, loop will call vowelInLine for each
         * String
         * Variables maxVowel and mostVowelWord keep track of the word with most vowels
         */
        while (line != null) {

            System.out.println(line);
            int lineVowelCount = vowelInLine(line);
            if (lineVowelCount > maxVowel) {

                maxVowel = lineVowelCount;
                mostVowelWord = line;
            }
            line = input.readLine();
        }
        input.close();
        return mostVowelWord;
    }

    public static int[] withoutTen(int[] nums) {

        /*
         * Checks for numbers = 10 throughout array
         * If the if statement is met, the int will be turned to 0, and moved to last
         * characters of array
         */

        // intial value of the element of output array is 0
        int[] outNums = new int[nums.length];
        int outArrIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                outNums[outArrIndex] = nums[i];
                outArrIndex++;

            }
        }

        return outNums;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        boolean foundAll = false;
        int innerIndex = 0;

        /**
         * Loop goes through each integer in outer until the first value in inner is
         * found
         */

        for (int i = 0; i < outer.length; i++) {

            if (outer[i] == inner[innerIndex]) {
                /**
                 * When the first value of inner is found, innerIndex increases, and the loop
                 * searches for the next value of inner
                 */
                innerIndex++;

                if (innerIndex >= inner.length) {
                    foundAll = true;
                    break;
                }
            }
        }

        return foundAll;
    }

    public static int[][] invert(int[][] arr) {
        int rowCount = arr.length;
        int colCount = arr[0].length;
        int reverseArr[][] = new int[rowCount][colCount];

        // Double for Loop going through every row and column
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {

                /**
                 * reverseArr's last position in the 2D array is changed to the value of i and
                 * j, which start from the first value given respecitvely, and move across and
                 * down the array
                 */
                reverseArr[rowCount - i - 1][colCount - j - 1] = arr[i][j];
            }
        }

        return reverseArr;
    }
}