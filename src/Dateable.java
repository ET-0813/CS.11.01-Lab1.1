import java.util.Scanner;

public class Dateable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        int minimumAge = (age/2)+7;
        System.out.println(age + " year olds should only date someone who is at least " + minimumAge + " years old.");
    }
}