package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest{

    @Test
    // Testing simple case
    void xyBalanceTest1(){
        assertEquals(true, Utility.xyBalance("abxyc"));
    }

    @Test
    // Testing case with no x
    void xyBalanceTest2(){
        assertEquals(true, Utility.xyBalance("acbd"));
    }
    
    @Test
    // Testing y appearing before x
    void xyBalanceTest3(){
        assertEquals(false, Utility.xyBalance("abyxc"));
    }

    @Test
    // Testing false case with only x
    void xyBalanceTest4(){
        assertEquals(false, Utility.xyBalance("xxxx"));
    }
    @Test
    // Testing Simple case with no x
    void xyBalanceTest5(){
        assertEquals(false, Utility.xyBalance("abxde"));
    }


    @Test
    // Testing with Review text 1
    void vowelCountTest1() throws IOException {
        assertEquals("interactive",Utility.vowelCount("C:\\Users\\buyat\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_1.txt"));
    }
    @Test
    // Testing with Review text 2
    void vowelCountTest2() throws IOException {
        assertEquals("poisonous",Utility.vowelCount("C:\\Users\\buyat\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_2.txt"));
    }
    @Test
    // Testing with Review text 3
    void vowelCountTest3() throws IOException {
        assertEquals("visualization",Utility.vowelCount("C:\\Users\\buyat\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_3.txt"));
    }
    @Test
    // Testing with Review text 4
    void vowelCountTest4() throws IOException {
        assertEquals("liberation",Utility.vowelCount("C:\\Users\\buyat\\grade-11-review-2---methods-and-testing-james-brighton-hayden-1\\src\\gr11review\\test2\\Review2_3Test_4.txt"));
    }


    @Test
    //Simple case of true
    void linearIntest1(){
        assertTrue(Utility.linearIn(new int[]{1,3,5,7,9}, new int[]{5,7}));
    }

    @Test
    // Testing case with identical arrays
    void linearIntest2(){
        assertTrue((Utility.linearIn(new int[]{1,3,5,7,9}, new int[]{1,3,5,7,9})));
    }

    @Test
    // Testing simple false case
    void linearIntest3(){
        assertFalse(Utility.linearIn(new int[]{1,3,5,7,9}, new int[]{2,0}));
    }

    @Test
    // Testing one variable
    void linearIntest4(){
        assertTrue(Utility.linearIn(new int[]{1}, new int[]{1}));
    }

    
}
