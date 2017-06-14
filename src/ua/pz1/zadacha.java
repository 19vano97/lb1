package ua.pz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vanillin on 14.06.2017.
 */
public class zadacha {
    public static void main(String[] args) throws IOException {

        System.out.println("input");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("V1");
        int V1 = Integer.parseInt(br.readLine());
        System.out.println("V2");
        int V2 = Integer.parseInt(br.readLine());
        System.out.println("T");
        int T = Integer.parseInt(br.readLine());
        System.out.println("S");
        int S = Integer.parseInt(br.readLine());
        int obshiyPut;
        int dannoeRast;

        obshiyPut = T * (V1 + V2);
        System.out.println("Общий путь= " + obshiyPut);
        dannoeRast = Math.abs(S - obshiyPut);
        System.out.println("Данное растояние: " + dannoeRast);
    }
}
