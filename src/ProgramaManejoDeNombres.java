import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreUno = scanner.nextLine();
        String nombreDos = scanner.nextLine();
        String nombreTres = scanner.nextLine();

        nombreUno = Character.toUpperCase(nombreUno.charAt(1)) + "." + nombreUno.substring(nombreUno.length()-2,nombreUno.length());
        nombreDos = Character.toUpperCase(nombreDos.charAt(1)) + "." + nombreDos.substring(nombreDos.length()-2,nombreDos.length());
        nombreTres = Character.toUpperCase(nombreTres.charAt(1)) + "." + nombreTres.substring(nombreTres.length()-2,nombreTres.length());

        System.out.println("nombre = " + nombreUno + "_" + nombreDos + "_" + nombreTres);

    }
}
