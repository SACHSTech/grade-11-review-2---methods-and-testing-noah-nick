package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.net.URL;

import org.junit.jupiter.api.Test;

import gr11review.part2.Utility;

public class UtilityTest{
  
    private String absPath = "/Users/noah/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-noah-nick/src/gr11review/part2/";
    /**
     * Tests for standard string with numbers, also tests consecutive digets
     * 
     */
    @Test
    public void sumNumbersTest1() {
        assertEquals(23, Utility.sumNumbers("qq20ewa3"));
    }

    /**
     * 
     * Tests case with no numbers, expecting sum of 0
     */
    @Test 
    public void sumNumbersTest2() {
        assertEquals(0, Utility.sumNumbers("werouhweruihwr"));
    }


    /**
     * 
     * Tests handling string of only numbers
     */
    @Test
    public void sumNumbersTest3() {
        assertEquals(44, Utility.sumNumbers("44"));

    }


    /**
     * Tests standard file with words and one longest word. 
     * @throws IOException
     */
    @Test
    public void longestWordTest1() throws IOException {
        assertEquals("consectetur", Utility.longestWord(absPath+"words.txt"));
        
    }

    /**
     * Tests handling of empty txt file
     * @throws IOException
     */
    @Test
    public void longestWordTest2() throws IOException {
        assertEquals("", Utility.longestWord(absPath+"wordsempty.txt"));
    }


    /**
     * Tests handling of file with two words of equal length, should output first word
     * @throws IOException
     */
    @Test
    public void longestWordTest3() throws IOException {
        assertEquals("woeijr", Utility.longestWord(absPath+"wordsdouble.txt"));
    }


 


}
