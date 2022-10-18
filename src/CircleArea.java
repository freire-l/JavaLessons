import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("area = " + (Math.pow(radius,2)*Math.PI));
    }
}
