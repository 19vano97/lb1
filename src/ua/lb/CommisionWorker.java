package ua.lb;

/**
 * Created by vanillin on 14.06.2017.
 */
public class CommisionWorker {
    public String name = "Анастасия Черт";
    public int prodal = 10;
    public int zarplata = 3200;
    public int procent;
    public CommisionWorker() {
        procent = ((zarplata * prodal)/100);
        zarplata = zarplata + procent;
    }

    @Override
    public String toString() {
        return ("Имя сотрудника по продажам: " +name +
                "\nКоличество проданных материалов: " + prodal +
                "\nИтоговая месячная зарплата: " + zarplata);
    }
}
