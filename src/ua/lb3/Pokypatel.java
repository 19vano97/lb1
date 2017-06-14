package ua.lb3;

/**
 * Created by vanillin on 14.06.2017.
 */
public class Pokypatel {



    public static void main(String[] args) {
        String name;
        String zaChemPoshelVmagaz;
        int skolkoDenegImeet;
        int pepsi;
        float skidka;
        float skolkoPotrarit;
        float skolkoOstanetsya;

        name = "Oleg Petrushkin";
        zaChemPoshelVmagaz = "Pepsi 2L";
        skolkoDenegImeet = 100;
        pepsi = 20;
        skidka = 3.5f;
        skolkoPotrarit = pepsi - skidka;
        skolkoOstanetsya = skolkoDenegImeet - skolkoPotrarit;

        System.out.println("Имя покупателя: " + name +
                "\nЧто он хочет купить? " + zaChemPoshelVmagaz +
                "\nСколько собой у него денег? " + skolkoDenegImeet + " грн " +
                "\nСтоимось пепси? " + pepsi + " грн " +
                "\nНасколько грн у него скидка? " + skidka + " грн" +
                "\nСколько потратит? " + skolkoPotrarit + "грн" +
                "\nСколько останется? " + skolkoOstanetsya + "грн");
    }


}
