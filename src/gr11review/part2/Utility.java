package gr11review.part2;

public class Utility {

    public static void main (String[] args){
        System.out.print(xyzMiddle("aaxyzbb"));
    }

    public static boolean xyzMiddle(String str){
        if (str.contains("xyz")){
            int intLeftSide = str.indexOf("xyz") + 1;
            int intRightSide = str.length() - (intLeftSide +1);
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
    
}
