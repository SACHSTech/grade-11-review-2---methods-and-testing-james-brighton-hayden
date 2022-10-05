package gr11review.part2;

import java.io.*;
import java.util.ArrayList;

public class Utility { 

    /**
     * Given a string, determine the sum of the numbers appearing in the string
     * 
     * @param str String given to determine the sum
     * @return intSum (sum of numbers) back to user
     * @author B. Zhang
     */
    public static int sumNumbers(String str){
        String strNum = "";
        int intSum = 0;

        // For loop to loop throughout the string
        for(int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))) {
                // Checks for numbers
                if(i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))) {
                    strNum += str.charAt(i);
                }

                else{
                    strNum += str.charAt(i);
                    intSum += Integer.parseInt(strNum);
                    strNum = "";
                }
            }
        }

        return intSum;
    }
    
    /**
     * Given a file, return the word that is alphabetically first
     * 
     * @param filenametxt String of file path name to determine word alpabetically first
     * @return first word (alphabetical) in the array list at index 0
     * @author B. Zhang
     */
    public static String alphaWord(String filenametxt) throws IOException {
        BufferedReader Br = new BufferedReader(new FileReader(filenametxt));
        ArrayList <String> strList = new ArrayList <String> ();
        String strLine = Br.readLine();
        int intNumLines = 0;
        String strTemp;

        // While loop to add all strings to an array list
        while(strLine != null){
            strList.add(strLine);
            strLine = Br.readLine();
            intNumLines ++;
        }
        Br.close();

        // Bubble sorting alphabetically
        for (int i = 0; i < intNumLines; i++) {
            for (int j = i + 1; j < intNumLines; j++) {
               
                // Comparing string with other strings
                if (strList.get(i).compareTo(strList.get(j)) > 0) {
                    // Swaps
                    strTemp = strList.get(i);
                    strList.set(i, strList.get(j));
                    strList.set(j, strTemp);
                }
            }
        }
        return strList.get(0);
    }

    /**
     * Given an array and a value, return the array with larger numbers next to the values
     * 
     * @param nums Integer array given to determine number sequence
     * @param val Integer given to select a specific element   
     * @return nums (array of numbers) back to user
     * @author B. Zhang
     */
    public static int[] notAlone(int[] nums, int val){
        // For loop to loop through index numbers
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == val){
                if(nums[i - 1] != nums[i] && nums[i + 1] != nums[i]){
                    // Checks and compares adjacent numbers
                    if(nums[i + 1] > nums[i - 1]){
                        nums[i] = nums[i + 1];
                    }
                    else if(nums[i + 1] < nums[i - 1]){
                        nums[i] = nums[i - 1];
                    }
                }
            }
        }
        return nums;
    }

    /**
     * Given an array, determine if the array is balanced (even)
     * 
     * @param nums Integer array given to determine balance
     * @return true back to user if sum is even
     * @return false back to user if sum is odd
     * @author B. Zhang
     */
    public static boolean canBalance(int[] nums){
        int intSum = 0;
        // For loop to add all numbers in the array 
        for(int i = 0; i < nums.length; i++){
            intSum += nums[i];
        }
        
        // Checks if the sum is odd or even
        if(intSum % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Given a 2d array, row, and column, return an array with all of the numbers up to the values given.
     * 
     * @param arr 2d array given to 
     * @param row Number of rows given for arrays
     * @param col Number of columns given for arrays
     * @return the 2d array intNum 
     * @author B. Zhang
     */
    public static int[][] split(int[][] arr, int row, int col){
        int[][] intNum = new int[row + 1][col + 1];
        // Nested for loop to assign the element from intNum with arr
        for(int i = 0; i < row + 1; i++){
            for(int j = 0; j < col + 1; j++){
                intNum[i][j] = arr[i][j];
            }
        }
        return intNum;
    }
}
