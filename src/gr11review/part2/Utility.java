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


    
}
