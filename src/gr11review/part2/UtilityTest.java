package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest{
  


    @Test
    public void sumNumbersTest1() {
        assertEquals(23, Utility.sumNumbers("qq20ewa3"));
    }

    @Test 
    public void sumNumbersTest2() {
        assertEquals(0, Utility.sumNumbers("werouhweruihwr"));
    }

    




}
