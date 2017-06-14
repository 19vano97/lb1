package ua.lb3;

/**
 * Created by vanillin on 14.06.2017.
 */
public class group {

    public static void main(String[] args) {
        students Students = new students();
        Students.mark.add(3);
        Students.mark.add(5);
        Students.mark.add(2);
        Students.mark.add(4);
        Students.mark.add(3);
        Students.mark.add(5);
        System.out.println(Students.mark);

        int averMark = 3;
        int goodMark = 4;
        int n = 6;

        //task 1
        for (int i = 0; i < n; i++) {
            if(Students.mark.get(i) > averMark){
                System.out.println("Оценка высше среднего: " + Students.mark.get(i) + " Номер ученика: " + (i+1));
            }
        }
        System.out.println();

        //task 2
        for (int i = 0; i < n; i++) {
            if(Students.mark.get(i) > goodMark){
                System.out.println("Оценка высше определенной: " + Students.mark.get(i) + " Номер ученика: " + (i+1));
            }
        }
        System.out.println();

        //task 3
        for (int i = 0; i < n; i++) {
                if(Students.mark.get(i) < averMark){
                    System.out.println("Оценка ниже среднего: " + Students.mark.get(i) + " Номер ученика: " + (i+1));
                }
        }

        //task 4
        for (int i = 0; i < n; i++) {
            if(Students.mark.get(i) < goodMark){
                System.out.println("Оценка ниже определенной: " + Students.mark.get(i) + " Номер ученика: " + (i+1));
            }
        }
    }
}
