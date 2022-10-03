package gr11review.part2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Utility {

    
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
