import java.util.InputMismatchException;
import java.util.Scanner;

public class InvoiceDetail {
    public static void main(String[] args) {
        System.out.println("Enter the invoice name or description");
        String invoiceName = "";
        double product1 = 0.0;
        double product2 = 0.0;

        Scanner scanner = new Scanner(System.in);
        invoiceName = scanner.nextLine();

/*        try{
            scanner.nextLine();
        }catch (InputMismatchException e){
            System.out.println("Must Enter a String");
        }*/

        System.out.println("Enter price of product 1:");
        try{
            product1 = scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Must Enter a Double");
            main(args);
            System.exit(0);
        }



        System.out.println("Enter price of product 2:");
        try{
            product2 = scanner.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Must Enter a Double");
            main(args);
            System.exit(0);
        }

        double taxes = (product1+product2)*0.19;

        System.out.println("The invoice " + invoiceName + "has a total of " + (product1+product2) + " and, after taxes the grand total is " + (product1+product2+taxes) );

    }
}
