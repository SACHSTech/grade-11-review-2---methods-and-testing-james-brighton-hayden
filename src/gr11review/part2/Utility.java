package gr11review.part2;


public class Utility {

    public static boolean xyBalance(String str) {

        
        int xFound = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'x') {
                
                xFound += 1;

                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == 'y') {
                        xFound = 0;
                        break;
                    }
                }
            }
        }
        if (xFound == 0) {
            return true;
        } else {
            return false;
        }

    }
}