package ua.math;

/**
 * Created by vanillin on 13.06.2017.
 */
public class lb1 {
   //task1
    public static int myInt = 16546;
    public static long myLong = 654465165;
    public static short myShort = 154;
    public static byte myByte = 117;
    public static double myDouble = 2.7;
    public static float myFloat = 1.9f;
    public static boolean myBoolean = false;

    public static void main(String[] args) {
        int myInt = 984964;
        long myLong = 98465496;
        short myShort = 1984;
        byte myByte = 19;
        double myDouble = 0.25;
        float myFloat =2.6f;
        boolean myBoolean = true;

        System.out.println("Start programm " + '\n');
        System.out.println("Type int : " + myInt);
        System.out.println("Type long : " + myLong);
        System.out.println("Type short : " + myShort);
        System.out.println("Type byte : " + myByte);
        System.out.println("Type double : " + myDouble);
        System.out.println("Type float : " + myFloat);
        System.out.println("Type boolean : " + myBoolean);
        System.out.println();

        System.out.println("Type int i class : " + lb1.myInt);
        System.out.println("Type long in class : " + lb1.myLong);
        System.out.println("Type short in class : " + lb1.myShort);
        System.out.println("Type byte in class : " + lb1.myByte);
        System.out.println("Type double in class : " + lb1.myDouble);
        System.out.println("Type float in class : " + lb1.myFloat);
        System.out.println("Type boolean in class : " + lb1.myBoolean);


        //task2
        float a1=1.f;
        float b1=1f;
        float c1=0x1f;
        float d1=(float)0b1;
        float f1=1.0e1f;
        float g1=01f;

        //task3
        short a2=1+3;
        short b2=(short)(2.9+2);
        short c2=(short)(2.9f+2);
        short d2=(short)((byte)14+(short)75);
        short f2 = (short)(3.75f+1.9);


        //task4
        int catet1=3;
        int catet2=4;
        int gipotenyza=5;
        boolean pifagor = (((catet1*catet1)+(catet2*catet2)))==(gipotenyza*gipotenyza) ? true : false;
        System.out.println("Прямоугольный треугольник? " + pifagor);

        //System.out.println(((catet1*catet1)*(catet2*catet2))==(gipotenyza*gipotenyza));

        //task5
        int s=0;
        for (int i = 1; i <=20 ; i++) {
            s+=i;
        }
        System.out.println("ot 1 do 20 " +s);

        //task6
        s=0;
        for (int i = 1; i <20 ; i++) {
            if(i%2==0){
                s+=i;
            }
        }
        System.out.println("ot 1 do 20 " +s);

        //task7
        s=0;
        for (int i = 1; i <20 ; i++) {
            if(i/1==i && i/i==1 && i%2!=0 && i%3!=0){
                s+=i;
            }
        }
        System.out.println("ot 1 do 20 " +s);


        //task8
        int a=2;
        int b=3;
        int c=5;
        System.out.println((a+b)==c);

        //task9
        s=0;
        int h=0;
        a = 10;
        b = 2;
        for (int i=a; i > b; i--){
            s+=i;
            h++;
        }
        System.out.println("Среднее арифметическое " + (s/h));

        //task10
        System.out.println();
        Credit cred = new Credit(8800,10,8);
        cred.credit();

    }


}
