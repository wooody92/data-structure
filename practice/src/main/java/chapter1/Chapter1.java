package chapter1;

import java.util.Scanner;

public class Chapter1 {
    public void getMaxValue() {
        Scanner str = new Scanner(System.in);

        System.out.println("a : ");
        int a = str.nextInt();
        System.out.println("b : ");
        int b = str.nextInt();
        System.out.println("C : ");
        int c = str.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Max value :" + max);
    }
}
