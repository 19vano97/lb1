package ua.lb;

/**
 * Created by vanillin on 14.06.2017.
 */
public class Emloyee {
    public static void main(String[] args) {
        HourlyWorker hourlyWorker = new HourlyWorker();
        PiceWorker piceWorker = new PiceWorker();
        CommisionWorker commisionWorker = new CommisionWorker();

        System.out.println(hourlyWorker);
        System.out.println();
        System.out.println(piceWorker);
        System.out.println();
        System.out.println(commisionWorker);

    }
}
