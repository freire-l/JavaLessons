import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {
        String numeroStr = JOptionPane.showInputDialog(null, "Enter an Integer number");

        int numeroDecimal = 0;

        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            // NumberFormatExpection is th type
            JOptionPane.showMessageDialog(null,"You must input an integer number");
            main(args);
            System.exit(0);
        }


        
        String numeroHex = Integer.toHexString(numeroDecimal);
        System.out.println("numeroHex = " + numeroHex);

        String outMessage = "Hex es " + numeroHex;
        outMessage += "\nEsto tambien";

        JOptionPane.showMessageDialog(null, outMessage);
    }
}
