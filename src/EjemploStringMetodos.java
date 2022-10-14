public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombreArchivo = "los_datos.txt";

        String extension = nombreArchivo.substring(nombreArchivo.indexOf('.'));
        System.out.println("extension = " + extension);
    }
}
