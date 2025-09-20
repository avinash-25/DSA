//! This is inplace algorithm

class stringPalindrome{
    public static boolean isPalindrome(String str){

        str = str.toUpperCase();
        int start = 0;
        int end = str.length()-1;

        while(start < end){
            if(str.charAt(start) != str.charAt(end))
            return false;
            
            start++;
            end--;
        }
        return true;
    }

    public static void main(String []a){
        String str = "ma234";
        if(isPalindrome(str))
        System.out.println("String is palindrome");
        else
        System.out.println("Strin is not palindrome");
    }
}





/**
 *     public static boolean isPalindrome(String str){
        String rev = "";
        int i = 0;

        while(i < str.length()){
            rev = str.charAt(i) + rev;
            i++;
        }
      return str.equalsIgnoreCase(rev);
    }
 */