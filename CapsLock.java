import java.util.*;
public class CapsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase: " + uppercase);
        scanner.close();
    }

    
}