import java.util.LinkedList;
import java.util.Queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Queue<Character> q = new LinkedList<>();

        System.out.println("Enter a string:");
        String palin = scn.nextLine();

        for(int i = palin.length() - 1; i >= 0; i--) {
            q.add(palin.charAt(i));
        }

        String reverseString = "";

        while (!q.isEmpty()) {
            reverseString += q.remove();
        }

        if (reverseString.equals(palin)) {
            System.out.println("Is Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
