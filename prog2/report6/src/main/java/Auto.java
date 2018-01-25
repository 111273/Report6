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
        }, 5000, 10);      //５秒に１回出力する

        try {
            Thread.sleep(5000);       //５０秒間動き続ける
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        return "いろはす";
    }
}
