package chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BruteForce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("text : ");
        String text = sc.next();
        System.out.printf("pattern : ");
        String pattern = sc.next();

        /**
         * text에 일치하는 pattern이 있다면 시작 index를 반환한다.
         * 없다면 -1을 반환한다.
         */
        System.out.println("result index : " + text.indexOf(pattern));
        System.out.println("my result index : " + bruteForce(text, pattern));
    }

    static int bruteForce(String text, String pattern) {
        int textSize = text.length();
        int patternSize = pattern.length();
        List<Character> result = new ArrayList<>();
        int resultIndex = -1;
        int count = 0;

        // 검색 가능한 범위 만큼만 조회
        for (int i = 0; i < textSize - patternSize + 1; i++) {
            for (int j = 0; j < patternSize; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    result.clear();
                    count++;
                    System.out.println("X");
                    break;
                }
                result.add(pattern.charAt(j));
                count++;
                System.out.println("O");
                System.out.println("result : " + result.toString());
            }
            if (result.size() == patternSize) {
                resultIndex = i;
                System.out.println("total count : " + count + ", " + "result : " + result.toString());
                break;
            }
        }
        return resultIndex;
    }


}
