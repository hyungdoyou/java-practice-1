package chap_06;

public class _04_ParameterAndReturn {

    public static int getPower(int number) {
        return number * number;
    }

    public static int getPowerByEsp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 함께 있는 메소드

        int retVal = getPower(2);  // 2 * 2 = 4
        System.out.println(retVal);

        retVal = getPower(3);
        System.out.println(retVal);

        retVal = getPowerByEsp(3,3); // 3 * 3 * 3 = 27
        System.out.println(retVal);

        System.out.println(getPowerByEsp(2, 4)); // 2 * 2 * 2 * 2 = 16
    }
}
