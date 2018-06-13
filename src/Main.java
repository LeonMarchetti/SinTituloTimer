import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Main {

    private static final int RETRASO = 0;   // En milisegundos
    private static final int TIEMPO = 5000; // En milisegundos

    public static void main(String[] args) {
        Random random = new Random();

        /* Inicializo el timer:
         *     Para que el timer sea un demoño y permita que
         *     la aplicación se termine cuando finalize el
         *     Main se usa el argumento `true`
         */
        Timer timer = new Timer(true);

        /* Arranco el timer, pasando un `TimerTask` que se
         * ejecute cada `TIEMPO` milisegundos a partir de
         * `RETRASO` milisegundos.
         */
        System.out.println("Presionar `Enter` para cortar");
        timer.schedule(new MiTimerTask(random.nextInt(100)), RETRASO, TIEMPO);

        /* Cortar cuando se ingrese texto: */
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.nextLine();
        }
    }

}
