package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        return number * number;
    }
    public static int getPower(String strnumber) { // "4"
        int number = Integer.parseInt(strnumber);  // 문자열을 숫자로 변환
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드르를 여러번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 개수가 다르거나

        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3,3)); // 3 * 3 * 3 = 27
    }
}
