package kuy7.task3;

/**
 * Given two numbers and an arithmetic operator (the name of it, as a string), return the result of the two numbers having that operator used on them.
 * <p>
 * a and b will both be positive integers, and a will always be the first number in the operation, and b always the second.
 * <p>
 * The four operators are "add", "subtract", "divide", "multiply".
 * <p>
 * A few examples:
 * <p>
 * arithmetic(5, 2, "add") should return 7
 * <p>
 * arithmetic(5, 2, "subtract") should return 3
 * <p>
 * arithmetic(5, 2, "multiply") should return 10
 * <p>
 * arithmetic(5, 2, "divide") should return 2.5
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(arithmetic(10, 2, "add"));
        System.out.println(arithmetic(10, 2, "subtract"));
        System.out.println(arithmetic(10, 2, "multiply"));
        System.out.println(arithmetic(10, 2, "divide"));
    }

    public static int arithmetic(int a, int b, String operator) {

        switch (operator) {
            case ("add"):
                return a + b;
            case ("subtract"):
                return a - b;
            case ("multiply"):
                return a * b;
            case ("divide"):
                return a / b;
            default:
                throw new ArithmeticException("Unknown Math operator");
        }
    }
}
