package ua.lb;

/**
 * Created by vanillin on 14.06.2017.
 */
public class Boss {
    public static void main(String[] args) {
        int i = 7;
        HourlyWorker hourlyWorker = new HourlyWorker();
        PiceWorker piceWorker = new PiceWorker();
        CommisionWorker commisionWorker = new CommisionWorker();
        int zarplataHW = hourlyWorker.zarplata * 7;
        int zarplataPW = piceWorker.zarplata / 4;
        int zarplataCW = commisionWorker.zarplata / 4;

        System.out.println("Недельный оклад:"+
                            "\nПочасового служашего: " + zarplataHW +
                            "\nПо изготовлениям деталей: " + zarplataPW +
                            "\nПо продажам: " + zarplataCW);

    }
}
