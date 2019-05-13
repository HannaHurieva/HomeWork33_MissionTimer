package com.alevel.homeWork33;

public class MissionImpossible implements Runnable {
    static int counter = 10;

    @Override
    public void run() {
        while (counter > 0) {
            System.out.println("You have " + counter + " seconds to answer ");
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Thread has been interrupted");
            }
            counter--;
        }
        if (counter == 0) {
            System.out.println("STOP !!!");
            System.out.println("Time is over");
        }
    }
}
