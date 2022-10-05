package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

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
}
