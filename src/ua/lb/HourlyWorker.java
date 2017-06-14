package ua.lb;

/**
 * Created by vanillin on 14.06.2017.
 */
public class HourlyWorker {

    public String name = "Олег Подорожник";
    public int srednKolChasov = 8;
    public int oneHour = 1;
    public int kolChasov = 9;
    public int zarplPerHour = 10;
    public int zarplata;
    public int procent;
    public int zarplataPerM;


    public HourlyWorker(){

        if(kolChasov <= srednKolChasov){
            zarplata = kolChasov * zarplPerHour;
        }else{
            procent = ((zarplPerHour * srednKolChasov)/100);
            zarplata = (zarplPerHour * srednKolChasov) + procent;

        }
        zarplataPerM = zarplata * 20;
    }

    @Override
    public String toString() {
        return ("Имя сотрудника по часовой оплаты: " +name +
        "\nКоличество отработанных часов: " + kolChasov +
                "\nИтоговая месячная зарплата: " + zarplataPerM);
    }
}
