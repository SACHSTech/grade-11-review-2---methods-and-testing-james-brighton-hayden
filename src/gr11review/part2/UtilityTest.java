package gr11review.part2;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import gr11review.part2.Utility;
 
 
public class UtilityTest{
 
    // 2D Array test cases
    int[][] invert1 = {
            { 1, 1, 1 },
            { 2, 2, 2 },
            { 3, 3, 3 },
    };
    int[][] invertRes1 = {
            { 1, 2, 3 },
            { 1, 2, 3 },
            { 1, 2, 3 },
    };
    int[][] invert2 = {
            { 10, 11, 12 },
            { 20, 21, 22 },
            { 30, 31, 32 },
    };
    int[][] invertRes2 = {
            { 10, 20, 30 },
            { 11, 21, 31 },
            { 12, 22, 32 },
    };
    int[][] invert3 = {
            { 0, 0, 2 },
            { 9, 8, 8 },
            { 3, 5, 5 },
    };
    int[][] invertRes3 = {
            { 0, 9, 3 },
            { 0, 8, 5 },
            { 2, 8, 5 },
    };
        //1D Array Cases
        int[] zeros1 = new int[] { 1, 0, 1, 0 };
        int[] answerzeros1 = new int[] { 0, 0, 1, 1 };
        int[] zeros2 = new int[] { 1, 0, 1, 1 };
        int[] answerzeros2 = new int[] { 0, 1, 1, 1 };
        int[] zeros3 = new int[] { 1, 1, 1, 1 };
        int[] answerzeros3 = new int[] { 1, 1, 1, 1 };
 
        //1D Array Cases Two Loops
        int[] series1 = new int[] { 1, 1, 2, 1, 2, 3 };
        int[] series2 = new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4 };
        int[] series3 = new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5 };
        int[] series4 = new int[] {1};
 
    @Test
    // Testing just xyz
    void xyzTest1(){
    assertEquals(true, Utility.xyzMiddle("xyz"));
    }
    // Testing with characters before and after
    @Test
    void xyzMiddleTest1(){
        assertEquals(true, Utility.xyzMiddle("AAxyzBB"));
    }
    // Testing when in front and back doesn't equal or -1
    @Test
    void xyzMiddleTest2(){
        assertEquals(false, Utility.xyzMiddle("AxyzBBB"));
    }
    // Testing when yz comes before x
    @Test
    void xyzMiddleTest3(){
        assertEquals(false, Utility.xyzMiddle("AyzxBB"));
    }
    // Testing when there are only x's
    void xyzMiddleTest4(){
        assertEquals(false, Utility.xyzMiddle("xxxxxx"));
    }
    // Testing when there are no xyz
    void xyzMiddleTest5(){
        assertEquals(false, Utility.xyzMiddle("abcdefgh"));
    }
    // Testing with Review Text 1
    @Test
    void longestWordTest1() throws IOException{
        assertEquals("conservation", Utility.longestWord("C:\\Users\\Hayden\\OneDrive\\Desktop\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-james-brighton-hayden\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }
    // Testing with Review Text 2
    @Test
    void longestWordTest2() throws IOException{
        assertEquals("x", Utility.longestWord("C:\\Users\\Hayden\\OneDrive\\Desktop\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-james-brighton-hayden\src\\gr11review\\test2\\Review2_3Test_2.txt"));
    }
    // Testing with Review Text 3
    @Test
    void longestWordTest3() throws IOException{
        assertEquals("preservation", Utility.longestWord("\\Users\\Hayden\\OneDrive\\Desktop\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-james-brighton-hayden\src\\gr11review\\test2\\Review2_3Test_3.txt"));
    }
    // Testing with Review Text 4
    @Test
    void longestWordTest4() throws IOException{
        assertEquals("conservation", Utility.longestWord("\\Users\\Hayden\\OneDrive\\Desktop\\github-classroom\\SACHSTech\\grade-11-review-2---methods-and-testing-james-brighton-hayden\src\\gr11review\\test2\\Review2_3Test_4.txt"));
    }
    // Testing Simple Cases
    @Test
    void zeroFrontTest1(){
        assertArrayEquals(answerzeros1, Utility.zeroFront(zeros1));
    }
    // Testing with only one 0
    @Test
    void zeroFrontTest2(){
        assertArrayEquals(answerzeros2, Utility.zeroFront(zeros2));
    }
    // Testing with only 1
    @Test
    void zeroFrontTest3(){
        assertArrayEquals(answerzeros3, Utility.zeroFront(zeros3));
    }
    // Testing input of 3
    @Test
    void seriesUpTest1() throws IOException{
        assertEquals(series1, 3);
    }
    // Testing input of 4
    @Test
    void seriesUpTest2() throws IOException{
        assertEquals(series2, 4);
    }
    // Testing input of 5
    @Test
    void seriesUpTest3() throws IOException{
        assertEquals(series3, 5);
    }
    // Testing input of 1
    @Test
    void seriesUpTest4() throws IOException{
        assertEquals(series4, 1);
    }
    @Test
    // Testing Simple Case
    void invertTest1() {
        int rowCount = invert1.length;
        int[][] resultArr = Utility.invert(invert1);
        for (int i = 0; i < rowCount; i++) {
            assertArrayEquals(invertRes1[i], resultArr[i]);
        }
    }
 
    @Test
    // Testing Double Digits
    void invertTest2() {
        int rowCount = invert2.length;
        int[][] resultArr = Utility.invert(invert2);
        for (int i = 0; i < rowCount; i++) {
            assertArrayEquals(invertRes2[i], resultArr[i]);
        }
    }
 
    @Test
    // Testing Duplicate Digits In The Same Row
    void invertTest3() {
        int rowCount = invert3.length;
        int[][] resultArr = Utility.invert(invert3);
        for (int i = 0; i < rowCount; i++) {
            assertArrayEquals(invertRes3[i], resultArr[i]);
        }
    }
}