package ua.math;

/**
 * Created by vanillin on 13.06.2017.
 */
public class math1 {
    public static final int MIN = 2;
    public static String name;
    public static void main(String[] args) {
        System.out.println((1>2)&&(3<5));
        System.out.println(method(false) && method1(true));

        if(name!=null && name.length()> MIN){

            System.out.println("name:" + name);

        }

        System.out.println("true ^ false: " + (true ^ false));
        System.out.println("false ^ false: " + (false ^ false));
        System.out.println("true ^ true: " + (true ^ true));

        int x = 6846;
        int y = 8464;

        System.out.println(x | y);
        System.out.println("x ->" + Integer.toBinaryString(x));
        System.out.println("y ->" + Integer.toBinaryString(y));
        System.out.println("x&y>" + Integer.toBinaryString(x | y));








    }

    private static boolean method1(boolean b) {
        System.out.println("method2("+b+")");
        return b;
    }

    private static boolean method(boolean b) {
        System.out.println("method("+b+")");
        return b;
    }



}
