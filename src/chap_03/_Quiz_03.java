package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String num1 = "901231-1234567";
        String num2 = "030708-4567890";

        System.out.println(num1.substring(0,8)); // 901231-1
        System.out.println(num2.substring(0,8)); // 030708-4

        System.out.println(num1.substring(0, num1.indexOf("-") + 2)); // index 위치 +2 도 가능
    }
}
