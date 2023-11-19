package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크(List, Set, Map) : 배열의 크기를 줄이거나 늘리거나 자유롭게 할 수 있음
        // 선착순으로 5명만 신청을 받는다

        ArrayList<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 데이터 조회 (인덱스 기준)
        System.out.println(list.get(0)); // 유재석
        System.out.println(list.get(1)); // 조세호
        System.out.println(list.get(2)); // 김종국
        System.out.println(list.get(3)); // 박명수
        System.out.println(list.get(4)); // 강호동

        System.out.println("-----------------------------");

        // 데이터 삭제 (박명수씨가 이사로)
        list.remove("박명수"); // list.remove(3) 도 가능 -> 강호동이 3 인덱스로 당겨옴

        System.out.println("-----------------------------");

        System.out.println("남은 학생 수 (제외 전) : " + list.size()); // 4
        list.remove(list.size()-1);  // 제일 마지막꺼를 지움
        System.out.println("남은 학생 수 (제외 후) : " + list.size()); // 5

        System.out.println("-----------------------------");

        // 순회
        for (String s: list) {
            System.out.println(s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-----------------------------");

        // 변경(수강권 양도)
        System.out.println("수강권 양도 전 : " + list.get(0));
        list.set(0, "이수근");
        System.out.println("수강권 양도 후 : " + list.get(0));

        System.out.println("-----------------------------");

        // 확인
        System.out.println(list.indexOf("김종국"));

        System.out.println("-----------------------------");

        // 선착순 5명 내에 포함되었는가?
        if(list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        }
        else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("-----------------------------");

        // 전체 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println("학생 수 : " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-----------------------------");

        // 다음 학기에 새로 공부 시작
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");

        // 정렬
        Collections.sort(list);
        for (String s: list) {
            System.out.println(s);
        }
    }
}
