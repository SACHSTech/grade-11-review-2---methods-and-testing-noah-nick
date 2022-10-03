package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;

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


    /**
     * Tests standard case with moving zeros to the front
     */
    @Test
    public void zeroFrontTest1() {
       int[] nums = {2, 3, 0, 5, 0};
        assertTrue(Arrays.equals(new int[]{0, 0, 2, 3, 5}, Utility.zeroFront(nums)));
    }

    /**
     * Tests special case where array contains no zeroes, should return original array untouched
     */
    @Test
    public void zeroFrontTest2() {
        assertTrue(Arrays.equals(new int[]{2, 3, 4,5 }, Utility.zeroFront(new int[] {2, 3, 4, 5})));
    }

    /**
     * Validates that an array with the zeros already at the front is returned untouched 
     */
    @Test
    public void zeroFrontTest3() {
        assertTrue(Arrays.equals(new int[]{0, 0, 2, 3}, Utility.zeroFront(new int[]{0, 0, 2, 3})));

    }

    /**
     * Simple test validating that code can tell when all inner numbers appear in outer
     * 
     */
    @Test
    public void linearInTest1() {
        assertEquals(true, Utility.linearIn(new int[]{2, 3, 4, 5}, new int[]{3, 4}));
    }

    /**
     * Testing that a false response is recieved when no inner numbers appear in outer
     */
    @Test
    public void linearInTest2() {
        assertEquals(false, Utility.linearIn(new int[]{2, 3, 4, 5}, new int[]{6, 7}));
    }

    /**
     * Tests that a false response is recieved when only one inner number appears in outer 
     */

    @Test
    public void linearInTest3() {
        assertEquals(false, Utility.linearIn(new int[]{2, 3, 4, 5}, new int[]{3, 6}));
    }

    /**
     * Ensuring program works with large amount of outer values that still are all satisfied by inner
     * 
     */
    @Test
    public void linearInTest4() {
        assertEquals(true, Utility.linearIn(new int[]{2, 3, 4, 5, 6, 7, 8, 9}, new int[]{3, 4, 5, 6}));
    }


    /**
     * Tests that a standard array can be properly reversed 
     */
    @Test
    public void reverseTest1() {
        assertTrue(Arrays.deepEquals(new int[][]{{6, 5 ,4}, {3, 2, 1}}, Utility.reverse(new int[][]{{1, 2, 3}, {4, 5, 6}})));
    }

    /**
     * Tests that reversing functionality still works with large 2d arrays consiting of 3 rows.
     */
    @Test
    public void reverseTest2(){
        assertTrue(Arrays.deepEquals(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, Utility.reverse(new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}})));
    }

    

    
}
