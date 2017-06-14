package ua.pz3;

/**
 * Created by vanillin on 14.06.2017.
 */
public class pz3 {
    public static void main(String[] args) {
        String text1 = "Kalynaa";
        String text2 = "cipherr";
        int i = 1;
        //task1
        StringBuffer text3 = new StringBuffer("Kalynaa");
        StringBuffer text4 = new StringBuffer("cipherr");
        text3.deleteCharAt(0);
        text4.deleteCharAt(0);
        System.out.println("task 1: " + text3 + " " + text4);

        //task2
        String text5 = text1.substring(2, text1.length()-2);
        System.out.println("task 2: " + text5);

        //task3
        String text6 = text1.substring(text1.length()-2) + text1.substring(0, text1.length()-2);
        System.out.println("task 3: " + text6);

        //task4
        String text7 = "";
        for (int j = 0; j < text1.length(); j++) {
            text7 = text7 + text1.charAt(j) + text1.charAt(j);
        }
        System.out.println("task 4: " + text7);
            }
}