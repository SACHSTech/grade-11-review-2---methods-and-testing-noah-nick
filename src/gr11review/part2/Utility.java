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
       
   

        //fileio 1

        
        System.out.println(longestWord("/Users/noah/github-classroom/SACHSTech/grade-11-review-2---methods-and-testing-noah-nick/src/gr11review/part2/wordsdouble.txt"));
       
      
    }



    /**
     * 
     * @param str Input string provided by user that will be used to add numbesr from 
     * @return Extracts all whole numbers from a given string and returns the sum 
     */
    public static int sumNumbers(String str) {

        //declaring variables
       String stringNumber = "0";
       int sum = 0;

       //for each character in the string
       for(int x = 0; x < str.length(); x++) {
        
            //if the character is a digit, append it to the stringNumber variable

            if(Character.isDigit(str.charAt(x))){
                stringNumber += str.charAt(x);
            } else {
                //once consecutive integers are no longer detected, add to the sum and reset the string variable

                sum += Integer.parseInt(stringNumber);
                stringNumber = "0";
            }
       }
        
       return sum + Integer.parseInt(stringNumber);
    }



    /**
     * 
     * @param filenametxt name of the file given by user to search through
     * @return Returns the complete string value of the longest word on any given line in the provided txt file
     */
    public static String longestWord(String filenametxt) {
        int lettercount = 0;
        String tempstring = "";
        String strLongestString = "";
        BufferedReader reader;

        try{
            reader = new BufferedReader(new FileReader(filenametxt));
            tempstring = reader.readLine();
            while(tempstring != null) {
                if(tempstring.length() > lettercount) {
                    strLongestString = tempstring;
                    lettercount += strLongestString.length();
                }
                tempstring = reader.readLine();
            }            
        } catch (IOException e) {
            System.out.println(e);
        }
        return strLongestString;
    }


    public static int[] zeroFront(int[] nums) {

        int[] arrayIntegers = new int[nums.length];
        int counter = 0;
        for(int x = 0; x < nums.length; x++) {
            if(nums[x] == 0) {
                arrayIntegers[counter] = 0;
                counter++;
            }
        }

        for(int y = 0; y < nums.length; y++) {

            if(nums[y] != 0) {
                arrayIntegers[counter++] = nums[y];
            }

        }

        return arrayIntegers; 

    }

    public static boolean linearIn(int[] outer, int[] inner){
         int numofInner = 0;

        for(int charInner = 0; charInner < inner.length; charInner++) {
            for(int charOuter = 0; charOuter < outer.length; charOuter++) {
                if(inner[charInner] == outer[charOuter]) {
                    numofInner++;
                }else {
                    continue;
                }
            }
        }

        if (numofInner == inner.length) {
            return true;
        }else {
            return false; 
        }


    }


    //arrays 7

    public static int[][] reverse(int[][] arr) {

        int[][] outputArray = new int[arr.length][arr[0].length];
        int rowCounter = arr.length; //2
        int columnCounter = arr[0].length; //3

      
        for(int x = 0; x < arr.length; x++) {
            for(int y = 0; y < arr[0].length; y++) {
                outputArray[arr.length-1-x][arr[0].length-1-y] = arr[x][y];
            }
        }

        return outputArray;

    }


    
}
