package chap_12.clean;

// 사장님 1 3 5 7 9 번방 청소
// 직원 2 4 6 8 10 번방 청소
public class CleanThread extends Thread {
    public void run() { // 직원이 청소를 하는 작업 정의
        System.out.println("-- 직원 청소 시작 (Thread)--");
        for (int i = 2; i <= 10; i+=2) {
            System.out.println("(직원) " + i + "번방 청소 중");
        }
        System.out.println("-- 직원 청소 끝 (Thread)--");
    }
}
