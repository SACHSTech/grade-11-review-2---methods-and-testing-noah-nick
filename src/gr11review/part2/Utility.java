package gr11review.part2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Utility {

    
    public static void main(String[] args) {
       
        //Methods 2

        int test = sumNumbers("abv123av2b");
        System.out.println(test);

        //fileio 1

        
        System.out.println(longestWord("words.txt"));
       


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




    
}
