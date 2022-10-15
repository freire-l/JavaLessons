import java.util.Scanner;

public class GreaterOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the first number");
        int num1 = scanner.nextInt();

        System.out.println("Please Enter the second number");
        int num2 = scanner.nextInt();

        //int result = num2 = (num2>=num1)?num2:num1;

        System.out.println("The greater number is = " + (num2 = (num2>=num1)?num2:num1));
    }
}
