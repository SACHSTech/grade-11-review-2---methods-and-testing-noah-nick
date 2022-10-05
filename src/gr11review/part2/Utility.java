package gr11review.part2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {

    public static void main (String[] args){
        System.out.println(xyzMiddle("aaxyzbb"));
        System.out.println(vowelCount("words.txt"));

        int[] notAloneTest = {1,2,3,2,5,2};
        System.out.println(Arrays.toString(notAlone(notAloneTest, 2)));

        System.out.println(Arrays.toString(seriesUp(4)));

        int[][] invertTest = {
            { 1, 1, 1 },
            { 2, 2, 2 },
            { 3, 3, 3 }};
        
        System.out.println(Arrays.deepToString(invert(invertTest)));
    }

    /**
     * Checks if string "xyz" appears in the middle of a string
     * 
     * @param str gets string inputted by user
     * @return true if "xyz" is in the middle of string
     */
    public static boolean xyzMiddle(String str){
        // Checks if "xyz" is in string
        if (str.contains("xyz")){
            // Determines what is the left and right side of the string
            int intLeftSide = str.indexOf("xyz") + 1;
            int intRightSide = str.length() - (intLeftSide +1);

            // Finds and Calculates difference of both sides, returns true if difference is within 1
            int intDifference = intLeftSide - intRightSide;
            if (intDifference == -1 || intDifference == 0 || intDifference == 1){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Counts amount of vowels in a word in a txt document
     * 
     * @param filenametxt
     * @return the word with the most vowels
     */
    public static String vowelCount(String filenametxt){
        try{
            // Initializes vowel counters
            int intVowelCounter = 0;
            int intCurrentCounter = 0;
            String strMostVowels = "";
            
            // Goes through each line of txt file, then goes through each letter of each word
            Scanner myScanner = new Scanner(new File(filenametxt));
            while(myScanner.hasNext()) {
                String strCurrent = myScanner.nextLine();       

                for (int counter = 0; counter < strCurrent.length(); counter++){
                    // Check if current character is a vowel
                    if (strCurrent.charAt(counter) == 'a' || strCurrent.charAt(counter) == 'e' || strCurrent.charAt(counter) == 'i' || strCurrent.charAt(counter) == 'o' || strCurrent.charAt(counter) == 'u'){
                        intCurrentCounter++;
                    } 
                }
                // If current amount of vowels is greater than the highest amount, set variable to current string
                if (intCurrentCounter > intVowelCounter){
                    intVowelCounter = intCurrentCounter;
                    strMostVowels = strCurrent;
                    intCurrentCounter = 0;
                } else {
                    intCurrentCounter = 0;
                }
            }
            return strMostVowels;

        // Makes sure the file exists
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return "Error: File Not Found";
        }
    }

    /**
     * Sets every instance of a value to the number that is higher to the left and right of it
     * 
     * @param nums Array that will be parsed through
     * @param value The value that needs to be checked for in the 
     * @return nums array with updated numbers
     */
    public static int[] notAlone(int[] nums, int value){
        // Parses through array, checking for the value
        for (int counter = 1; counter < nums.length-1; counter++){
            if (nums[counter] == value){
                // Checks which value is higher on each side of the value
                if (nums[counter-1] > nums[counter+1]){
                    nums[counter] = nums[counter-1];
                    counter++;
                } else {
                    if (nums[counter+1] > nums[counter-1]){
                        nums[counter] = nums[counter+1];
                        counter++;
                    }
                }
            } else {
                counter++;
            }
        }
        return nums;
    }

    /**
     * Creates an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n}
     * 
     * @param n the last number of the pattern
     * @return the complete pattern
     */
    public static int[] seriesUp(int n){
        // Creates new array 
        int[] Array = new int[n*(n+1)/2];
        // Initializes counter to 0
        int intCurrent = 0;
        // Loops through numbers until its n
        for(int i = 1; i <= n; i++) {
            // Loops through number whiles its less than i
            for(int j = 0; j < i; j++) {
                Array[intCurrent + j] = j + 1;
            }
            intCurrent += i;
        }
                                    
        return Array;
    }
    

    /**
     * Turns array's columns into rows and vice versa
     * 
     * @param arr 
     * @return updated array
     */
    public static int[][] invert(int[][] arr) {

        // Initializes column and row counters
        int colCounter = arr[0].length;
        int rowCounter = arr.length;

        // Creates array to store inverted values
        int[][] Result = new int[colCounter][rowCounter];

        // Flips the positions of the column and row
        for (int i = 0; i < rowCounter; ++i) {
            for (int j = 0; j < colCounter; ++j) {
                Result[j][i] = arr[i][j];
            }
        }
        return Result;
    }   

    public static void main(String[] args) {
       
   


        
        System.out.println(Arrays.toString(zeroFront(new int[]{2, 3, 0, 5, 0})));
      
    }



    /**
     * Given one input string, extract all the numbers and add them up
     * 
     * @param str Input string provided by user that will be used to add numbesr from 
     * @return Extracts all whole numbers from a given string and returns the sum 
     */
    public static int sumNumbers(String str) {

        // declaring variables
       String stringNumber = "0";
       int intSum = 0;

       // for each character in the string
       for(int x = 0; x < str.length(); x++) {
        
            // if the character is a digit, append it to the stringNumber variable

            if(Character.isDigit(str.charAt(x))){
                stringNumber += str.charAt(x);
            } else {
                // once consecutive integers are no longer detected, add to the sum and reset the string variable

                intSum += Integer.parseInt(stringNumber);
                stringNumber = "0";
            }
       }
        
       return intSum + Integer.parseInt(stringNumber);
    }



    /**
     * Given a txt of lines of words, return the longest word on any given line in the file
     * 
     * @param filenametxt name of the file given by user to search through
     * @return Returns the word as a string
     */
    public static String longestWord(String filenametxt) {

        // declaring variables
        int intLetterCount = 0;
        String strTemp = "";
        String strLongestString = "";
        BufferedReader reader;

        // try catch sttement for the bufferedreader
        try{

            reader = new BufferedReader(new FileReader(filenametxt));
            
            // gets the next line in the file
            strTemp = reader.readLine();
            while(strTemp != null) {

                // compare letter counts
                if(strTemp.length() > intLetterCount) {
                    
                    // set longest string if letter count is greater
                    strLongestString = strTemp;
                    intLetterCount += strLongestString.length();
                }
                strTemp = reader.readLine();
            } 
        } catch (IOException e) {

            // catch and print any IOException
            System.out.println(e);
        }
        return strLongestString;
    }


    /**
     * Given an array of integers, move all the 0s to the front with the rest of the values following
     * 
     * @param nums Array of integers 
     * @return Array with zeroes at front followed by original nonzero values
     */
    public static int[] zeroFront(int[] nums) {

        // creating a new array, declaring variables
        int[] arrayIntegers = new int[nums.length];
        int intCounter = 0;

        // for loop to check array for 0s and move them to the front, counting how many zeroes have been placed
        for(int x = 0; x < nums.length; x++) {
            if(nums[x] == 0) {
                arrayIntegers[intCounter] = 0;
                intCounter++;
            }
        }

        // setting the rest of the values to be the proceeding numbers
        for(int y = 0; y < nums.length; y++) {
            if(nums[y] != 0) {
                arrayIntegers[intCounter++] = nums[y];
            }

        }

        return arrayIntegers; 

    }


    /**
     * Given two arrays, determine whether all the characters in the second array appear in the first
     * 
     * @param outer Array of values that is to be checked against the second
     * @param inner Numbers that must appear in the first array
     * @return Returns boolean true if all the characters appear, false if they do not. 
     */
    public static boolean linearIn(int[] outer, int[] inner){
         int intInner = 0;


        // nested for loops to iterate through each loop
        for(int charInner = 0; charInner < inner.length; charInner++) {
            for(int charOuter = 0; charOuter < outer.length; charOuter++) {
                
                // checks if the proper values appear
                if(inner[charInner] == outer[charOuter]) {
                    intInner++;
                }else {
                    continue;
                }
            }
        }

        if (intInner == inner.length) {
            return true;
        }else {
            return false; 
        }


    }


    /**
     * Given a 2d array of integers, reverse all values and return a new 2d array
     * 
     * @param arr 2d array of integers
     * @return Returns the original array in reverse order; first number is last and last number is first 
     */
    public static int[][] reverse(int[][] arr) {

        // declare variables, create new array
        int[][] arrOutput = new int[arr.length][arr[0].length];
    

        // nested for loop to reverse the arrays, placing values in the correct spots
        for(int x = 0; x < arr.length; x++) {
            for(int y = 0; y < arr[0].length; y++) {
                arrOutput[arr.length-1-x][arr[0].length-1-y] = arr[x][y];
            }
        }

        return arrOutput;

    }   
}
