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
}