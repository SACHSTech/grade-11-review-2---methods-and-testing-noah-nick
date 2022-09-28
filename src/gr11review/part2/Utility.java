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
       
        //Methods 2

        int test = sumNumbers("abv123av2b");
        System.out.println(test);

        //fileio 1

        
        System.out.println(longestWord("words.txt"));
       
        //array 3
        int myarray[] = {2,0,2,2, 0};

        System.out.println(Arrays.toString(zeroFront(myarray)));
        
        //array 4
        int arrayOuter[] = {1, 2, 4, 5};
        int arrayInner[] = {2, 4, 5};
        boolean arrayTest = linearIn(arrayOuter, arrayInner);
        System.out.println(arrayTest);


        //arrays 7
        int array[][]={{1,2,3}, {4,5,6}};
        System.out.println(array.length);

        System.out.println(Arrays.deepToString(reverse(array)));
    }

    public static int sumNumbers(String str) {
       String stringNumber = "0";

       int sum = 0;

       for(int x = 0; x < str.length(); x++) {
        
            if(Character.isDigit(str.charAt(x))){
                stringNumber += str.charAt(x);
            } else {
                sum += Integer.parseInt(stringNumber);

                stringNumber = "0";
            }
       }
        
       return sum + Integer.parseInt(stringNumber);
    }


    public static String longestWord(String filenametxt) {
        int lettercount = 0;
        String tempstring = "";
        String strLongestString = "";
        try{

            Scanner myScanner = new Scanner(new File(filenametxt));
            while(myScanner.hasNext()) {
                tempstring = myScanner.nextLine();
                if(tempstring.length() > lettercount) {
                    strLongestString = tempstring;
                    lettercount += strLongestString.length();
                }
            }

        } catch (FileNotFoundException e) {
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
