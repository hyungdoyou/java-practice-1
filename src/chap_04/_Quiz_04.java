package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 조건문을 활용한 주차 요금 정산 프로그램 작성
        // 주차요금은 시간 당 4000원 (일일 최대 요금 : 30000원)
        // 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        int hour = 10; // 주차 시간
        int bill = 4000 * hour; // 시간 당 주차 요금

        boolean smallcar = false; // 경차여부
        boolean coldcar = true;  // 장애인 차량 여부

        // 30000원 초과 시 일일 최대 요금으로 수정
        if(bill > 30000) {
            bill = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if(smallcar || coldcar) {
            bill /= 2; // 50% 할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + bill + "원 입니다.");
    }
}