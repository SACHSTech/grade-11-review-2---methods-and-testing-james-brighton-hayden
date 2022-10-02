package gr11review.part2;

import java.io.*;

public class Utility {

    /**
     * Given a string, determine if each x instance is "balanced" by a y
     * 
     * @param str String given to determine if "xy balanced"
     * @return true if the string meets the balanced criteria, or false if string is
     *         not "xy blanaced"
     * @author J. Bian
     */
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

    /**
     * Given a text file with multiple lines, determine the string with the largest
     * number of vowels
     * 
     * @param line text file location or path
     * @return the string in text file with most vowels
     * @author J. Bian
     */
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

    /**
     * Given an array, return a version of array with all occurences of 10 converted
     * into 0, and moved to the end of array
     * 
     * @param nums provided array
     * @return altered version of array with replaced values
     * @author J. Bian
     */
    public static int[] withoutTen(int[] nums) {

        /*
         * Checks for numbers = 10 throughout array
         * If the if statement is met, the int will be turned to 0, and moved to last
         * characters of array
         * Intial value of the element of output array is 0
         */
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

    /**
     * Given two arrays, check if all values of outer[] occur in inner[]
     * 
     * @param outer specified array
     * @param inner specified array
     * @return true if all values are found within inner, false if not all values
     *         occur
     * @author J. Bian
     */
    public static boolean linearIn(int[] outer, int[] inner) {
        boolean foundAll = false;
        int innerIndex = 0;

        // Loop seearches through each value until an int matches inner[innderIndex]
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

    
    /**
     * Given a 2D array, reverse the order of the positions in the array
     * 
     * @param arr specificed 2D array to be given
     * @return array in inverted order
     * @author J. Bian
     */
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