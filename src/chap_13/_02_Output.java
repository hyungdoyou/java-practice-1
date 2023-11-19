package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        // System.out.format();
        // System.out.printf();

        System.out.println("------ 정수 ------");
        // System.out.printf("포맷", 값1, 값2, 값3);
        System.out.printf("%d%n", 1);   // 1  %n : 줄바꿈
        System.out.printf("%d %d %d%n", 1, 2, 3);  // 1 2 3
        System.out.printf("%d%n", 1234); // 1234
        System.out.printf("%6d%n", 1234);  // 6자리의 공간을 확보하고 나서 1234 출력(빈 공간은 비워둠) /  __1234
        System.out.printf("%06d%n", 1234); // 001234 / 6자리 공간을 확보하고 나서 1234 출력(빈 공간은 0으로 채움)
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // _+1234
        System.out.printf("%,15d%n", 1000000000); // __1,000,000,000  / 3자리마다 ',' 로 끊음
        System.out.printf("%-6d%n", 1234); // 1234__  / 왼쪽 정렬

        System.out.println("------ 실수 ------");
        System.out.printf("%f%n", Math.PI); // 3.141593  / 8자리로 표현
        System.out.printf("%.2f%n", Math.PI); // 3.14 / 소수점 2째자리까지 반올림해서 표현
        System.out.printf("%6.2f%n", Math.PI); // __3.14 / 6자리 확보 후 소수점 2째자리까지 표현
        System.out.printf("%-6.2f%n", Math.PI); // 3.14__
        System.out.printf("%06.2f%n", Math.PI); // 003.14
        System.out.printf("%+6.2f%n", Math.PI); // _+3.14

        System.out.println("------ 문자열 ------");
        System.out.printf("%s%n", "Java"); // Java
        System.out.printf("%6s%n", "Java"); // __Java
        System.out.printf("%-6s%n", "Java"); // Java__
        System.out.printf("%6.2s%n", "Java"); // 6자리 공간 확보, 전체 문자열 중 앞 2글자만 출력 -> ____Ja
        System.out.printf("%-6.2s%n", "Java"); // Ja____

        System.out.println("------ 응용1 ------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호 " + 90 + " " + 80 + " " + 85.0); // 강백호 90 80 85.0
        System.out.println("서태웅 " + 100 + " " + 100 + " " + 100.0); // 서태웅 100 100 100.0
        System.out.println("채치수 " + 95 + " " + 100 + " " + 97.5); // 채치수 95 100 97.5

        System.out.println("------ 응용2 ------");
        System.out.println("이름      영어   수학   평균");  // 공백이 각각 6, 3, 3 칸으로 구분
        System.out.printf("%-6s %4d %4d %6.1f%n", "강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "채치수", 95, 100, 97.5);
    }
}
