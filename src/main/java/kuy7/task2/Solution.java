package kuy7.task2;

/**
 * You are going to be given a word. Your job is to return the middle character of the word.
 * If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
 * Examples:
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("NoEven"));
        System.out.println(getMiddle("SottSo"));
        System.out.println(getMiddle("egg"));
    }

    public static String getMiddle(String word) {
        String result;

        if (word.length() % 2 == 0) {
            result = word.substring((word.length() / 2) - 1, word.length() / 2 + 1);
        } else {
            result = word.substring(word.length() / 2, (word.length() / 2) + 1);
        }

        return result;
    }
}
