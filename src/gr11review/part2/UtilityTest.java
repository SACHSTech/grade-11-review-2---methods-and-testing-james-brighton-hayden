package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//import gr11review.part2.Utility;

public class UtilityTest{
    
    @Test
    void xyBalanceTest1(){
        assertEquals(true, Utility.xyBalance("abxyc"));
    }

    @Test
    void xyBalanceTest2(){
        assertEquals(true, Utility.xyBalance("xxy"));
    }

    @Test
    void xyBalanceTest3(){
        assertEquals(true, Utility.xyBalance("acbd"));
    }

    @Test
    void xyBalanceTest4(){
        assertEquals(true, Utility.xyBalance("a"));
    }
    
    @Test
    void xyBalanceTest5(){
        assertEquals(false, Utility.xyBalance("abyxc"));
    }

    @Test
    void xyBalanceTest6(){
        assertEquals(true, Utility.xyBalance("abyc"));
    }
}
