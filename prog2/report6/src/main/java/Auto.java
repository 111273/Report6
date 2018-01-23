import java.util.Timer;
import java.util.TimerTask;

public class Auto {

    public static String auto() {
        final Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            @Override

            public void run() {
                System.out.println("いろはす");
            }
        }, 0, 5000);

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        return "いろはす";
    }
}
