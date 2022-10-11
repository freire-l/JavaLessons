import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {

        // Clase de Java para comunicarse con la terminal. System In, la entrada de la consola
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Integer Number");
        //String numeroStr = scanner.nextLine();
        //String numeroStr = JOptionPane.showInputDialog(null, "Enter an Integer number");

        int numeroDecimal = 0;

        try{
            numeroDecimal = scanner.nextInt();
            //numeroDecimal = Integer.parseInt(numeroStr);
        }catch(InputMismatchException e){
            // NumberFormatExpection is th type
            System.out.println("You must input an integer number");
            //JOptionPane.showMessageDialog(null,"You must input an integer number");
            main(args);
            System.exit(0);
        }


        
        String numeroHex = Integer.toHexString(numeroDecimal);
        //System.out.println("numeroHex = " + numeroHex);

        String outMessage = "Hex es " + numeroHex;
        outMessage += "\nEsto tambien";

        //JOptionPane.showMessageDialog(null, outMessage);
        System.out.println(outMessage);
    }
}
