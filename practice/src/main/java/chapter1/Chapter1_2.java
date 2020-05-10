package chapter1;

import java.util.Scanner;

public class Chapter1_2 {
    public void sumWhile() {
        Scanner str = new Scanner(System.in);

        System.out.println("n : ");
        int n = str.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("result : " + sum);
    }
}
