package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        // 상품 A와 상품 B로 이루어진 세트 상품을 효율적으로 포장하는 프로그램 작성

        // 상품 A와 상품 B는 각각 5개씩 준비
        // 상품 A와 상품 B는 두 사람이 독립적으로 준비
        // 상품 A와 상품 B가 모두 준비된 이후 세트 상품 포장 실시
        // 포장이 필요한 세트 상품은 총 5개

        Runnable runnableA = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");
            }
            ;
            System.out.println("-- A 상품 준비 완료 --");
        };

        Runnable runnableB = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");
            }
            ;
            System.out.println("-- B 상품 준비 완료 --");
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

        // A, B상품이 준비 끝날때까지 기다리게 하는 부분
        // while(threadA.isAlive() || threadB.isAlive()) {
        //
        // }

        try {
            threadA.join(); // A 상품과 B 상품 준비가 끝날때까지 기다리게 하는 부분
            threadB.join(); // A 상품과 B 상품 준비가 끝날때까지 기다리게 하는 부분
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable runnableSet = () -> {
            System.out.println("== 세트 상품 포장 시작==");
            for (int i = 1; i <= 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");
            };
            System.out.println("== 세트 상품 포장 완료 ==");
        };

        Thread threadSet = new Thread(runnableSet);
        threadSet.start();
    }
}