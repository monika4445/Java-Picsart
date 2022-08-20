package Homeworks;

public class Problems {
    public static void main(String[] args) {
        String s = "abasaba";
        Problems t = new Problems();
        System.out.println(t.isPalindrome(s));

    }

    public boolean isPalindrome(String s) {
        //true if s is palindrome otherwise false
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
