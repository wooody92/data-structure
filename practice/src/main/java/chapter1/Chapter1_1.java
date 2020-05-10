package chapter1;

import java.util.Scanner;

public class Chapter1_1 {
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

    public int getMinValue(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }

    public int getMedianValue(int a, int b, int c) {
        if (a >= b) {
            if (b >= c) {
                return b;
            }
            else if (a <= c) {
                return a;
            }
            else {
                return c;
            }
        }
        else if (a > c) {
            return a;
        }
        else if (b > c) {
            return c;
        }
        else {
            return b;
        }
    }
}
