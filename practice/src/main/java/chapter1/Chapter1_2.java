package chapter1;

import java.util.Scanner;

public class Chapter1_2 {
    Scanner str = new Scanner(System.in);

    public void sumWhile() {

        System.out.println("n : ");
        int n = str.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("result : " + sum);
        System.out.println("i : " + i);
    }

    public void sumFor() {
        System.out.println("n : ");
        int n = str.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("result : " + sum);
    }

    public void sumGauss() {
        System.out.println("n : ");
        int n = str.nextInt();

        int sum = 0;
        int init = 1;
        int additional = (n % 2) == 1? (n + 1) / 2 : 0;

        sum = (init + n) * (n/2) + additional;
        System.out.println("result : " + sum);
    }

    public void sumAll(int a, int b) {
        int result = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                result += i;
            }
            System.out.println("result : " + result);
            return;
        }
        if (a > b) {
            for (int i = b; i <= a; i++) {
                result += i;
            }
            System.out.println("result : " + result);
            return;
        }
        if (a == b) {
            result = a;
            System.out.println("result : " + result);
            return;
        }
    }

    public void countDigit(int a) {
        int n = 0;
        while (a > 0) {
            a /= 10;
            n++;
        }
        System.out.println("result : " + n);
    }
}
