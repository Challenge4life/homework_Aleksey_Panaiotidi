package Homework;

public class Pali {
    public static boolean isPalindrome(String string) {
        int left = 0;
        int right = string.length() - 1;
        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("ava"));
        System.out.println(isPalindrome("ave"));
        System.out.println(isPalindrome("java"));
        System.out.println(isPalindrome("javaj"));
    }
}
