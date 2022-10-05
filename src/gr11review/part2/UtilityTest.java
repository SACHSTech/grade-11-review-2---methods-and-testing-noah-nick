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


    private String absPath = "/Users/nickk/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-noah-nick-1/src/gr11review/part2";
    /**
     * xyzMiddle Test #1
     * 4 letters on left, 3 on right, expecting true
     */
    @Test
    public void xyzMiddleTest1() {
        assertEquals(true, Utility.xyzMiddle("AAAAxyzBBB"));
    }

    /**
     * xyzMiddle Test #2
     * 1 letter on left, 3 on right, expecting false
     */
    @Test
    public void xyzMiddleTest2() {
        assertEquals(false, Utility.xyzMiddle("AxyzBBB"));
    }

    /**
     * xyzMiddle Test #3
     * 1 letter on left, 2 on right, expecting true
     */
    @Test
    public void xyzMiddleTest3() {
        assertEquals(true, Utility.xyzMiddle("AxyzBB"));
    }

    /**
     * vowelCount test #1
     * Standard list of words, expects "consectetur"
     */
    @Test
    public void vowelCountTest1() throws IOException {
        assertEquals("consectetur", Utility.vowelCount(absPath+"words.txt"));
    }

    /**
     * vowelCount test #2
     * Empty list of words, expects ""
     */
    @Test
    public void vowelCountTest2() throws IOException {
        assertEquals("", Utility.vowelCount(absPath+"nowords.txt"));
    }

    /**
     * vowelCount test #3
     * list of words with double, expects first word
     */
    @Test
    public void vowelCountTest3() throws IOException {
        assertEquals("adipiscing", Utility.vowelCount(absPath+"doublewords.txt"));
    }

    /**
     * notAlone test #1
     */
    @Test
    public void notAloneTest1() {
        int[] arrayActual = { 1, 2, 3 };
        int[] arrayExpected = { 1, 3, 3 };
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 2));
    }

    /**
     * notAlone test #2
     */
    @Test
    public void notAloneTest2() {
        int[] arrayActual = { 1, 2, 3, 2, 5, 2 };
        int[] arrayExpected = { 1, 3, 3, 5, 5, 2 };
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 2));
    }

    /**
     * notAlone test #3
     */
    @Test
    public void notAloneTest3() {
        int[] arrayActual = { 3, 4 };
        int[] arrayExpected = { 3, 4 };
        assertArrayEquals(arrayExpected, Utility.notAlone(arrayActual, 3));
    }

    /**
     * seriesUp test #1
     */
    @Test
    public void seriesUpTest1() {
        int[] arrayExpected = { 1, 1, 2, 1, 2, 3 };
        assertArrayEquals(arrayExpected, Utility.seriesUp(3));
    }

    /**
     * seriesUp test #2
     */
    @Test
    public void seriesUpTest2() {
        int[] arrayExpected = {};
        assertArrayEquals(arrayExpected, Utility.seriesUp(0));
    }

    /**
     * seriesUp test #3
     */
    @Test
    public void seriesUpTest3() {

        int[] arrayExpected = { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5};
        assertArrayEquals(arrayExpected, Utility.seriesUp(5));
    }

    /**
     * invert test #1
     */
    public void invertTest1() {

        int[][] arrayActual = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };

        int[][] arrayExpected = {
                { 1, 4, 7 },
                { 2, 5, 8 },
                { 3, 6, 9 },
        };

        assertArrayEquals(arrayExpected, Utility.invert((arrayActual)));
    }

    /**
     * Invert test 2
     */
    @Test
    public void invertTest2() {

        int[][] arrayActual = {
                { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 },
        };

        int[][] arrayExpected = {
                { 1, 2, 3 },
                { 1, 2, 3 },
                { 1, 2, 3 },
        };

        int[][] resultArr = Utility.invert(arrayActual);
        for (int i = 0; i < arrayActual.length; i++) {
            assertArrayEquals(arrayExpected[i], resultArr[i]);
        }
    }

    /**
     * Invert test 3
     */
    @Test
    public void invertTest3() {

        int[][] arrayActual = {
                { 7, 8, 9 },
                { 19, 29, 48 },
                { 13, 3, 2 },
        };

        int[][] arrayExpected = {
                { 7, 19, 13 },
                { 8, 29, 3 },
                { 9, 48, 2 },
        };

        int[][] resultArr = Utility.invert(arrayActual);
        for (int i = 0; i < arrayActual.length; i++) {
            assertArrayEquals(arrayExpected[i], resultArr[i]);
        }
    }
  
    //this uses aboslute path reliant on the user's computer's file strucutre 
    private String absolutePath = "/Users/Noah/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-noah-nick/src/gr11review/part2/";
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
        assertEquals("consectetur", Utility.longestWord(absolutePath+"words.txt"));
        
    }

    /**
     * Tests handling of empty txt file
     * @throws IOException
     */
    @Test
    public void longestWordTest2() throws IOException {
        assertEquals("", Utility.longestWord(absolutePath+"wordsempty.txt"));
    }


    /**
     * Tests handling of file with two words of equal length, should output first word
     * @throws IOException
     */
    @Test
    public void longestWordTest3() throws IOException {
        assertEquals("woeijr", Utility.longestWord(absolutePath+"wordsdouble.txt"));
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
