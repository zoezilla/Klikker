package Rühmatöö;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import java.util.concurrent.TimeUnit;


public class Klikker {
    public static void main(String[] args) {
        TimeWatch watch = TimeWatch.start();
        // Stopwatch watch = new Stopwatch();

        ArrayList mängjateList = new ArrayList<Isik>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta mängjate arv: ");
        int mängjateArv = scan.nextInt();


        for (int i = 0; i < mängjateArv; i++) {
            System.out.print("Sisesta oma nimi: ");
            String mängjaNimi = scan.next();
            mängjateList.add(mängjaNimi);
            }


        System.out.println(mängjateList);
        long passedTimeInMs = watch.time();

        long passedTimeInSeconds = watch.time(TimeUnit.SECONDS);
        System.out.println(passedTimeInSeconds);

    }

}
