import java.util.TimerTask;

public class MiTimerTask extends TimerTask {

    private int miNumero = 0;

    public MiTimerTask(int numero) {
        this.miNumero = numero;
    }

    /**
     * Se sobreescribe el método `run`, que se ejecute de
     * acuerdo al tiempo especificado en `Timer.schedule()`.
     */
    @Override
    public void run() {
        System.out.println("Mi Número: " + this.miNumero++);
    }

}
