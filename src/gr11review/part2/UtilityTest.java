package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest {

    // 2D Array test cases
    int[][] invertCase1 = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 },
    };
    int[][] invertSol1 = {
            { 9, 8, 7 },
            { 6, 5, 4 },
            { 3, 2, 1 },
    };
    int[][] invertCase2 = {
            { 9, 71, 2 },
            { 8, 57, 60 },
            { 72, 8, 97 },
    };
    int[][] invertSol2 = {
            { 97, 8, 72 },
            { 60, 57, 8 },
            { 2, 71, 9 },
    };
    int[][] invertCase3 = {
            { 0, 0, 2 },
            { 8, 8, 9 },
            { 12, 12, 1 },
    };
    int[][] invertSol3 = {
            { 1, 12, 12 },
            { 9, 8, 8 },
            { 2, 0, 0 },
    };

    // 1D Array cases
    int[] noTen1 = new int[] { 1, 3, 10, 10 };
    int[] answerTen1 = new int[] { 1, 3, 0, 0 };
    int[] noTen2 = new int[] { 1, 3, 1, 9 };
    int[] answerTen2 = new int[] { 1, 3, 1, 9 };
    int[] noTen3 = new int[] { 1, 3, 1, 9 };
    int[] answerTen3 = new int[] { 1, 3, 1, 9 };

    @Test
    // Testing simple case
    void xyBalanceTest1() {
        assertEquals(true, Utility.xyBalance("abxyc"));
    }

    @Test
    // Testing case with no x
    void xyBalanceTest2() {
        assertEquals(true, Utility.xyBalance("acbd"));
    }

    @Test
    // Testing y appearing before x
    void xyBalanceTest3() {
        assertEquals(false, Utility.xyBalance("abyxc"));
    }

    @Test
    // Testing false case with only x
    void xyBalanceTest4() {
        assertEquals(false, Utility.xyBalance("xxxx"));
    }

    @Test
    // Testing Simple case with no x
    void xyBalanceTest5() {
        assertEquals(false, Utility.xyBalance("abxde"));
    }

    @Test
    // Testing with Review text 1
    void vowelCountTest1() throws IOException {
        assertEquals("interactive", Utility.vowelCount(
                "C:\\Users\\buyat\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }

    @Test
    // Testing with Review text 2
    void vowelCountTest2() throws IOException {
        assertEquals("poisonous", Utility.vowelCount(
                "C:\\Users\\buyat\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_2.txt"));
    }

    @Test
    // Testing with Review text 3
    void vowelCountTest3() throws IOException {
        assertEquals("visualization", Utility.vowelCount(
                "C:\\Users\\buyat\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_3.txt"));
    }

    @Test
    // Testing with Review text 4
    void vowelCountTest4() throws IOException {
        assertEquals("liberation", Utility.vowelCount(
                "C:\\Users\\buyat\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_4.txt"));
    }

    @Test
    // Testing simple case
    void withoutTenTest1() {
        assertArrayEquals(answerTen1, Utility.withoutTen(noTen1));
    }

    @Test
    // Testing array with no 10's
    void withoutTenTest2() {
        assertArrayEquals(answerTen2, Utility.withoutTen(noTen2));
    }

    @Test
    // Testing case with pre-existing 0's that were not changed by loop
    void withoutTenTest3() {
        assertArrayEquals(answerTen3, Utility.withoutTen(noTen3));
    }

    @Test
    // Simple case of true
    void linearIntest1() {
        assertTrue(Utility.linearIn(new int[] { 1, 3, 5, 7, 9 }, new int[] { 5, 7 }));
    }

    @Test
    // Testing case with identical arrays
    void linearIntest2() {
        assertTrue((Utility.linearIn(new int[] { 1, 3, 5, 7, 9 }, new int[] { 1, 3, 5, 7, 9 })));
    }

    @Test
    // Testing simple false case
    void linearIntest3() {
        assertFalse(Utility.linearIn(new int[] { 1, 3, 5, 7, 9 }, new int[] { 2, 0 }));
    }

    @Test
    // Testing one variable
    void linearIntest4() {
        assertTrue(Utility.linearIn(new int[] { 1 }, new int[] { 1 }));
    }

    @Test
    // Testing simple case
    void invertTest1() {
        int rowCount = invertCase1.length;
        int[][] resultArr = Utility.invert(invertCase1);
        for (int i = 0; i < rowCount; i++) {
            assertArrayEquals(invertSol1[i], resultArr[i]);
        }
    }

    @Test
    // Testing double digits
    void invertTest2() {
        int rowCount = invertCase2.length;
        int[][] resultArr = Utility.invert(invertCase2);
        for (int i = 0; i < rowCount; i++) {
            assertArrayEquals(invertSol2[i], resultArr[i]);
        }
    }

    @Test
    // Testing duplicate digits in the same row
    void invertTest3() {
        int rowCount = invertCase3.length;
        int[][] resultArr = Utility.invert(invertCase3);
        for (int i = 0; i < rowCount; i++) {
            assertArrayEquals(invertSol3[i], resultArr[i]);
        }
    }

}
