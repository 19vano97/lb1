package ua.lb;

/**
 * Created by vanillin on 14.06.2017.
 */
public class HourlyWorker {


    public int srednKolChasov = 8;
    public int oneHour = 1;
    public int kolChasov = 9;
    public int zarplPerHour = 60;
    public int zarplata;
    public int procent;


    public HourlyWorker(){

        if(kolChasov <= srednKolChasov){
            zarplata = kolChasov * zarplPerHour;
        }else{
            procent = ((zarplPerHour * srednKolChasov)/100);
            zarplata = (zarplPerHour * srednKolChasov) + procent;

        }
    }

    @Override
    public String toString() {
        return "HourlyWorker{" +
                "Зарплата= " + zarplata + " грн" +
                '}';
    }
}
