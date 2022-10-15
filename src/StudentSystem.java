import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];
        double highTotal = 0.0;
        double lowTotal = 0.0;
        double total = 0.0;
        double input = 0.0;

        // Iterate trough array, asking the user for input

        for (int i = 0; i < 20; i++){
            input = scanner.nextDouble();
            if(input == 0){
                System.out.println("Program Error");
                System.exit(1);
            } else if (input < 1 || input > 7) {
                i--;
                System.out.println("Number must be between 1 and 7");
                continue;
            }else{
                    total += input;
                    if(input > 5) highTotal += input;
                    if(input < 4) lowTotal += input;
                }
        }

        System.out.println("Total Average = " + (total/20));
        System.out.println("High Average = " + (highTotal/20));
        System.out.println("Low Average = " + (lowTotal/20));
    }
}
