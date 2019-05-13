package com.alevel.homeWork33;

import java.util.Scanner;

public class Answer implements Runnable {
    static boolean isTrue = false;
/*    public Thread thread;

    public Answer() {
        thread = new Thread(this);
        System.out.println("New thread Answer started");
        thread.start(); // Запуск потока
    }*/

    // Входная точка потока.
    @Override
    public void run() {
        System.out.println("What is the ordinal number of the planet earth from the sun?");
        attemptNotTorture();
    }

    public static void attemptNotTorture() {
        while (!isTrue) {
            isTrue = Answer.responseCheck();
        }
        if (isTrue) {
            System.out.println("You won! Mission complete");
            System.out.println("STOP !!!");
            System.exit(1);
        }
    }

    public static boolean responseCheck() {
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        return missionPossible(answer);
    }

    public static boolean missionPossible(int answer) {
        if (answer == 3) isTrue = true;
        return isTrue;
    }

}
