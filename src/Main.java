
import com.alevel.homeWork33.Answer;
import com.alevel.homeWork33.MissionImpossible;

import java.util.Timer;

public class Main {
    static Timer t;
    static int time = 10;

    public static void timeToAnswer(Timer t) {
        System.out.println("You have " + time + " seconds to answer ");
        time--;
        if (time == 0) {
            t.cancel();
            System.out.println("STOP !!!");
            System.out.println("You lose ... Mission failed");
        }
    }

    public static void main(String[] args) {

/*        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                timeToAnswer(t);
            }
        };
        t = new Timer();
        t.schedule(timerTask, 1000, 1000);*/

        new Thread(new MissionImpossible()).start();
        new Thread(new Answer()).start();

//        Answer answer = new Answer();
    }
}
