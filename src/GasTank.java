import java.util.Scanner;

public class GasTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter current tank capacity");
        double capacity = scanner.nextDouble();

        if(capacity > 70 || capacity < 1){
            System.out.println("Error");
        } else if (  capacity>=1 && capacity < 20) {
            System.out.println("Insuficient");
        } else if (capacity>=20 && capacity < 35) {
            System.out.println("Sufficient");
        } else if (capacity>=35 && capacity < 40) {
            System.out.println("Tank half full");
        } else if (capacity>=40 && capacity < 60) {
            System.out.println("3/4 of tank");
        } else if (capacity>=60 && capacity < 70) {
            System.out.println("Almost full");
        }else System.out.println("Full tank");
    }
}
