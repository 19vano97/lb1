package ua.lb;

/**
 * Created by vanillin on 14.06.2017.
 */
public class PiceWorker {
    public String name = "Генадий Гак";
    public int srednKolDet = 100;
    public int detayls = 115;
    public int zarplata = 3200;

    public PiceWorker (){

        if(detayls < srednKolDet){
            detayls = srednKolDet - detayls;
            zarplata = zarplata - ((zarplata * detayls)/100);
            }else{
            detayls = srednKolDet - detayls;
            zarplata = zarplata - ((zarplata * detayls)/100);
            }

    }

    @Override
    public String toString() {
        return ("Имя сотрудника цеха: " +name +
                "\nКоличество сделанных деталей: " + Math.abs(detayls) +
                "\nИтоговая месячная зарплата: " + zarplata);
    }
}
