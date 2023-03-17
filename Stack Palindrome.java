import java.util.Stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String palin = scn.nextLine();

        Stack<Character> stack = new Stack<Character>();


        for(int i = 0; i < palin.length(); i++) {
            stack.push(palin.charAt(i));
        }
        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString += stack.pop();
            }



        if (reverseString.equals(palin)) {
            System.out.println("Is Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
