// Level 1 - leetcode 125 - Valid Palindrome - Easy

class Solution {
    public boolean isPalindrome(String s) {
        return checkString(s);
    }
    // static boolean checkString(String s){. // 15ms
       
    //     String str = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
    //      int left = 0;
    //     int right = str.length()-1;
    //     while(left <= right){

    //         if(str.charAt(left) != str.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    //}

    // optimized solution - 1ms 
    static boolean checkString(String s){
        int left = 0;
        int right = s.length()-1;

        while(left<=right){
            Character leftValue = checkChar(s.charAt(left));
            Character rightValue = checkChar(s.charAt(right));

            if(leftValue != null && rightValue != null){
                if(leftValue != rightValue){
                    return false;
                }
                left++;
                right--;
            }else{ // here any one character is null bcz of spaces or spcl chars
                if(leftValue == null){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return true;
    }

    static Character checkChar(char c){
        if(c>=97 && c<= 122 || c>=48 && c<=57){ // samll letters & NUMBERS
            return c;
        }else if(c>=65 && c<= 90){ // if capital letters means change it into samll letter and return it.
            return (char) (c+32);
        }
        return null;//if any spaces or special chars
    }
}
