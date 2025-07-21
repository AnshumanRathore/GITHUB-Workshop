import java.util.*;
public class Ascii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter letter to find ASCII :");
        char letter=sc.next().charAt(0);
        // char letter = 'Z'; // Replace 'A' with any letter you want
        int asciiValue = (int) letter; // Casting char to int
        System.out.println("The ASCII value of '" + letter + "' is: " + asciiValue);
        sc.close();
    }
}