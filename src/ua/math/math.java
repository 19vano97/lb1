package ua.math;

/**
 * Created by vanillin on 13.06.2017.
 */
public class math {
    public static int age;
    final public static int MAX_AGE;
    static{
        MAX_AGE=19;
    }


    public static void main(String[] args) {
        int myInt = 25;
        int MyIntHex = 0x19;
        System.out.println(myInt);
        System.out.println(MyIntHex);


        char MyChar='A';
        char MyChar1=65;
        char MyChar2='\u0041';
        System.out.println(MyChar);
        System.out.println(MyChar1);
        System.out.println(MyChar2);

        double d=0;
        for (int i = 0; i < 100; i++) {
            d=d+0.1;
            System.out.println(d);
        }


        float f=0.5f;
        d=0.5;

        System.out.println(f==d);

        boolean bool=true;

        System.out.println(age);


        final int MIN_AGE = 2;

        System.out.println(MAX_AGE);






    }

}
