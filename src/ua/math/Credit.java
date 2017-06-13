package ua.math;

/**
 * Created by vanillin on 13.06.2017.
 */
public class Credit {
    private int sumaCredita;
    private double procent;
    private int srok;

    public void credit(){
        for(int i = 0; i < srok; i++){
            double sumaMonth = sumaCredita/srok;
            double procentMoth = (sumaMonth*procent)/100;
            System.out.println("Summa plot per month: " + sumaMonth + " Summa % per month : " + procentMoth);
        }
        System.out.println("% za srok :" + (sumaCredita*procent)/100);
    }

    public Credit(int sumaCredita, double procent, int srok) {
        this.sumaCredita = sumaCredita;
        this.procent = procent;
        this.srok = srok;
    }
}



