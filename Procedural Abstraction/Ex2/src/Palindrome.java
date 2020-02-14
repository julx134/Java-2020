/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jules
 */
public class Palindrome {
    
    //EFFECTS: takes a and returns true if it is a palindrome
    //and false if it is not a palindrome
    public static boolean isPalindrome(String a) {
        if (a != null && !(a.equals(""))) {
            String b = "";
            for (int i = a.length()-1; i >= 0; i--) {
                b = b + a.charAt(i);
            }

            if (b.equalsIgnoreCase(a)) {
                return true;
            }
            else {
                return false;
            }
        }else {
            return false;
        }
    }
    
    
    
    public static void main (String[] args) {
        if (args.length ==1) {
            if (args[0].equals("1"))
                System.out.println(isPalindrome(null));
            else if (args[0].equals("2"))
                System.out.println(isPalindrome(""));
            else if (args[0].equals("3"))
                System.out.println(isPalindrome("deed"));
            else if (args[0].equals("4"))
                System.out.println(isPalindrome("abcd"));
        }
    }
}
