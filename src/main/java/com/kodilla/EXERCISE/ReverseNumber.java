package com.kodilla.EXERCISE;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(17868));
    }

    public static int reverse(int number){
        String string1 = String.valueOf(number);

        char[] chars = string1.toCharArray();

        String string2 = "";

        for (int i = chars.length-1; i >= 0; i--){
            string2 += chars[i];
        }
        System.out.println(string2);

        return Integer.valueOf(string2);
    }
}
