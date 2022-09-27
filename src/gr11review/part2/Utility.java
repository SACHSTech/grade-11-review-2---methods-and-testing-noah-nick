package gr11review.part2;

public class Utility {

    
    public static void main(String[] args) {
       
        //Methods 2

        int test = sumNumbers("abv123av2b");
        System.out.println(test);

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


    
}
