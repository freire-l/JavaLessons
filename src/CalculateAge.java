import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class CalculateAge {

        /*

        // Attempt did not work

        //Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla
        // a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
        System.out.println("Enter your date of birth in the following format yyyy-mm-dd\n");
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar calendar = Calendar.getInstance();
        Calendar currCalendar = Calendar.getInstance();

        Date currDate = new Date();
        currCalendar.setTime(currDate);

        System.out.println("date = " + currDate);

        Date date = new Date();

        try {
            calendar.setTime(sdf.parse(scanner.nextLine()));
            date = sdf.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid Format");
            throw new RuntimeException(e);
        }



        if(date.after(currDate)){
            System.out.println("Error: invalid Date");
            System.exit(1);
        }else {
            date.getYear()
        }

        */

        public static void main(String[] args) throws ParseException {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
            String fechaStr = scanner.next();

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaNacimiento = df.parse(fechaStr);
            Date actual = new Date();

            // creamos un patron de fecha numérico con el año mes y día
            df = new SimpleDateFormat("yyyyMMdd");

            // luego convertimos ambas fechas la actual y la fecha de nacimiento
            // en enteros que contiene el año mes y día
            int desde = Integer.parseInt(df.format(fechaNacimiento));
            int hasta = Integer.parseInt(df.format(actual));

            // luego restamos ambas fechas y dividimos en 10000 para quitar decimales y
            // dejar la fecha en decenas o centenas
            int edad = (hasta - desde) / 10000;
            System.out.println("La edad es: " + edad);
        }

}
