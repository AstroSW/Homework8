import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        int one[] = new int[] {1, 2, 3};
        double two[] = {1.57, 7.654, 9.986};
        byte three[] = new byte[7];

        // Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < one.length; i++)
            if (i != one.length - 1) {
                System.out.print(one[i]+", ");
            } else {
                System.out.println(one[i]);
            }
        for (int i = 0; i < two.length; i++)
            if (i != two.length - 1) {
                System.out.print(two[i]+", ");
            } else {
                System.out.println(two[i]);
            }
        for (int i = 0; i < three.length; i++)
            if (i != three.length - 1) {
                System.out.print(three[i]+", ");
            } else {
                System.out.println(three[i]);
            }
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        for (int i = one.length -1; i >= 0; i--)
            if (i != 0) {
                System.out.print(one[i]+", ");
            } else {
                System.out.println(one[i]);
            }
        for (int i = two.length -1; i >= 0; i--)
            if (i != 0) {
                System.out.print(two[i]+", ");
            } else {
                System.out.println(two[i]);
            }
        for (int i = three.length -1; i >= 0; i--)
            if (i != 0) {
                System.out.print(three[i]+", ");
            } else {
                System.out.println(three[i]);
            }
        System.out.println();

        // Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 != 0) {
                one[i] += 1;
            }
        }
        System.out.println(Arrays.toString(one));
    }
}