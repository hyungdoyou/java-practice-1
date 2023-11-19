package chap_13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 사용자 입력
        Scanner sc = new Scanner(System.in);  // 입력받는 명령문
//        System.out.println("이름을 입력하세요");
//        String name = sc.next(); // 사용자로부터 입력받음
//        System.out.println("혈액형을 입력하세요.");
//        String bloodType = sc.next();
//        System.out.println("키를 입력하세요.");
//    //    int height = Integer.parseInt(sc.next());   // sc.next는 문자열로 받기때문에 정수형으로 변환해줘야함
//        int height = sc.nextInt();     // 위에 문장이 귀찮을 때 사용
//        System.out.println("몸무게를 입력하세요.");
//        double weight = sc.nextDouble();
//
//        System.out.println("입력하신 정보는 다음과 같습니다.");
//        System.out.println("이름 : " + name);
//        System.out.println("혈액형 : " + bloodType);
//        System.out.println("키 : " + height);
//        System.out.println("몸무게 : " + weight);

        System.out.println("무슨 프로그래밍 언어를 배웠나요?");
        // String lang = sc.next(); // 한 단어(자바 파이썬) 만 입력받음
        String lang = sc.nextLine(); // 한 줄을 전부 입력받음
        System.out.println("언어 : " + lang);

        // sc.nextLine(); // 불필요한 문장을 삭제 처리

        System.out.println("배우고 나니 기분이 어땠나요?");
        String feeling = sc.nextLine();
        System.out.println("기분 : " + feeling);

    }
}
