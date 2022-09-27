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
    @Test
    void xyBalanceTest7(){
        assertEquals(true, Utility.xyBalance("bwxxuuuuuuuy"));
    }
    @Test
    void xyBalanceTest8(){
        assertEquals(false, Utility.xyBalance("xxxx"));
    }
    @Test
    void xyBalanceTest9(){
        assertEquals(false, Utility.xyBalance("abxde"));
    }
}
