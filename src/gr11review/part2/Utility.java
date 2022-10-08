package gr11review.part2;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.ioFileNotFoundException;
 
//3, 1, 3, 6, 9
public class Utility {
public static boolean xyzMiddle(String str){
    // Setting Variables
    String xyz = "xyz";
    int word = str.length();
     int middle = word / 2;
 
     // Invalid input if word < 3
  if (word < 3)
 
    return false;
    // Does 
  if (word % 2 != 0){
 
    if (xyz.equals(str.substring(middle-1,middle+2))) {
      return true;
 
    } else {
        return false;
 
      }
 
  } else if (xyz.equals(str.substring(middle-1,middle+2)) || xyz.equals(str.substring(middle-2,middle+1))) {
          return true;
 
  } else
      return false;
 
}  
public static String longestWord(String filenametxt) throws IOException{
    String longestWord = "";
    String current;
    BufferedReader br = new BufferedReader(new FileReader(filenametxt));
    ArrayList <String> word = new ArrayList <String> ();
    String wordf = br.readLine();

    while (word != null) {
      current = wordf;
      if (current.length() > longestWord.length()) {
          longestWord = current;

      }
      br.close();

  }
  return longestWord;


}
public static int[] zeroFront(int[] nums){
    int count = 0;
     for (int i = 0; i < nums.length; i++) {
     if (nums[i] == 0) {
      nums[i] = nums[count];
      nums[count] = 0;
      count++;
    }
  }
  return nums;
 
 
}
public static int[] seriesUp(int n){
    int[] result = new int[n * (n + 1) / 2];
    int i = 0;
    for (int j = 1; j <= n; ++j)
    for (int k = 1; k <= j; ++k)
    result[i++] = k;
  return result;
}
public static int[][] invert(int[][] arr){
    for (int i = 0, n = arr.length; i < n; i++) {
        // select the elements only above the main diagonal
        for (int j = i + 1, m = arr[i].length; j < m; j++) {
            int tmp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = tmp;
        }
    }
    return arr;
   
}
}
 