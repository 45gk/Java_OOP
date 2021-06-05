package com.company;
import java.util.Scanner;
import java.lang.String;

public class Palindrome {

public static boolean isPalindrome(String reverse_word, String normal_word){
    boolean result;
    if (normal_word.equals(reverse_word)) {
        result = true;
    }
    else {
        result = false;
    }
    return result;
    }

    public static String reverseString(String word) {
        char[] array = word.toCharArray();
        String reverse_word = "";
        for (int n = array.length - 1; n >= 0; n--) {
            reverse_word = reverse_word + array[n];
        }
        return reverse_word;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String text = scn.nextLine();
        String[] sp = text.split(" ");
        String reverse_string = "";
        for (int i=0; i < sp.length; i++){
            reverse_string += reverseString(sp[i]) + " ";
        }
        String[] revSp = reverse_string.split(" ");
        for (int j=0; j < sp.length; j++){
            System.out.print(isPalindrome(sp[j], revSp[j]) + " ");
        }
    }

        //System.out.println(reverseString(args));
        //char[] array =str.toCharArray();
        //        String backward = "";
        //        for (int i = array.length-1;i>=0;i--){
        //            backward = backward+array[i];
        //        }
        //        return backward;
        //return str_p.equals(reverseString(str_p));
}

