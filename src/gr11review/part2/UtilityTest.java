package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class UtilityTest{

    // 2d array test cases and solutions
    int [][] splitCase1 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
    };

    int [][] splitSol1 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    int [][] splitCase2 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    int [][] splitSol2 = {
        {1, 2, 3},
        {4, 5, 6}
    };
  
    // simple test
    @Test
    void sumNumbersTest1() {
        assertEquals(1, Utility.sumNumbers("a1"));
    }

    // testing single char to return 0
    @Test
    void sumNumbersTest2() {
        assertEquals(0, Utility.sumNumbers("a"));
    }

    // testing single integer
    @Test
    void sumNumbersTest3() {
        assertEquals(1, Utility.sumNumbers("1"));
    }

    // simple test
    @Test
    void alphaWordTest1() throws IOException{
        assertEquals("accompany", Utility.alphaWord("C:\\Users\\brigh\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }

    // testing for single char
    @Test
    void alphaWordTest2() throws IOException{
        assertEquals("dojo", Utility.alphaWord("C:\\Users\\brigh\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_2.txt"));
    }

    // simple test
    @Test
    void alphaWordTest3() throws IOException{
        assertEquals("artificial", Utility.alphaWord("C:\\Users\\brigh\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_3.txt"));
    }

    // simple test
    @Test
    void alphaWordTest4() throws IOException{
        assertEquals("answer", Utility.alphaWord("C:\\Users\\brigh\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_4.txt"));
    }

    // simple test
    @Test
    void notAloneTest1(){
        int[] inArray = {1, 2, 3};
        int[] outArray = {1, 3, 3};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,2), outArray) );
    }

    // simple test
    @Test
    void notAloneTest2(){
        int[] inArray = {1, 2, 3, 2, 5, 2};
        int[] outArray = {1, 3, 3, 5, 5, 2};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,2), outArray) );
    }

    // simple test (even)
    @Test
    void canBalanceTest1() throws IOException{
        assertEquals(true, Utility.canBalance(new int[] {1, 1, 1, 2, 1}));

    }

    // simple test (odd)
    @Test
    void canBalanceTest2() throws IOException{
        assertEquals(false, Utility.canBalance(new int[] {2, 1, 1, 2, 1}));

    }

    // tests for two integers
    @Test
    void canBalanceTest3() throws IOException{
        assertEquals(true, Utility.canBalance(new int[] {10, 10}));

    }

    // simple test
    @Test
    void splitTest1() {
        int intIndex = splitCase1.length - 1;
        int[][] resultArr = Utility.split(splitCase1, 2, 2);
        for (int i = 0; i < intIndex; i++) {
            assertArrayEquals(splitSol1[i], resultArr[i]);
        }
    }

    // tests for different row and column numbers
    @Test
    void splitTest2() {
        int intIndex = splitCase2.length - 1;
        int[][] resultArr = Utility.split(splitCase2, 1, 2);
        for (int i = 0; i < intIndex; i++) {
            assertArrayEquals(splitSol2[i], resultArr[i]);
        }
    }
}
