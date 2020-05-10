import chapter1.Chapter1;

public class Main {
    public static void main(String[] args) {
        Chapter1 chapter1 = new Chapter1();
        int medianValue = chapter1.getMedianValue(5,3,1);
        System.out.println(medianValue);
    }
}
