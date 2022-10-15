import java.util.Scanner;

public class multiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = 0;
        boolean negative = false;
        if(Integer.signum(num1) != Integer.signum(num2)){
            negative = true;
        }
        if( num1 == 0 || num2 == 0){
            System.out.println("Result is = " + 0);
        }else {
            for(int i = 0; i < Math.abs(num2); i++){
                result += Math.abs(num1);
            }
            if(negative) result = -result;
            System.out.println("Result is = " + result);
        }


    }
}
