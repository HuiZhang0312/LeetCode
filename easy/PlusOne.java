package easy;
/**
 * LeetCode 66 Plus One
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 * */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = 0; i<len; i++){
            if(digits[len-1-i]==9){
                 digits[len-1-i] = 0;
            }else{
                digits[len-1-i] ++;
                return digits;
            }
        }
        //Everything in a valid Java program not explicitly set to something by the programmer,
        //is initialized to a zero value.
        //For references (anything that holds an object) that is null.
        //For int/short/byte/long that is a 0.
        //For float/double that is a 0.0
        //For booleans that is a false.
        //For char that is the null character '\u0000' (whose decimal equivalent is 0).
        int[] newNumber = new int[len+1];
        newNumber[0] = 1;
        return newNumber;
    }
}
