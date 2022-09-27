package gr11review.part2;

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
}