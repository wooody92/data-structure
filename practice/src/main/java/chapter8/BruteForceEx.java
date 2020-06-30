package chapter8;

import java.util.Scanner;

public class BruteForceEx {

    static int bfMatch(String txt, String pat) {
        // text 커서
        int pt = 0;
        // pattern 커서
        int pp = 0;

        while (pt != txt.length() && pp != pat.length()) {
            if (txt.charAt(pt) == pat.charAt(pp)) {
                pt++;
                pp++;
            } else {
                pt = pt - pp + 1;
                pp = 0;
            }
        }
        if (pp == pat.length()) {
            return pt - pp;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("text : ");
        String s1 = sc.next();

        System.out.println("pattern : ");
        String s2 = sc.next();

        int idx = bfMatch(s1, s2);

        if (idx == -1) {
            System.out.println("no pattern on text");
        }
        int length = 0;
        for (int i = 0; i < idx; i++) {
            length += s1.substring(i, i + 1).getBytes().length;
        }
        length += s2.length();

        System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
        System.out.println("text : " + s1);
        System.out.printf(String.format("pattern : %%%ds\n", length), s2);
    }
}
