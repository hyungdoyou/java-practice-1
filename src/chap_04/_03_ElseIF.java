package chap_04;

public class _03_ElseIF {
    public static void main(String[] args) {
        // 조건문 ElseIf
        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 또는 아이스 아메리노 +1
        boolean hanrabong = true;
        boolean mango = true;

        if(hanrabong == true) {
            System.out.println("한라봉 에이드 + 1");
        } else if (mango == true) {
            System.out.println("망고 주스 + 1");
        }
        else {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #1");

        // else if 는 여러번 사용 가능
        hanrabong = false;
        mango = false;
        boolean orange = true;

        if(hanrabong == true) {
            System.out.println("한라봉 에이드 + 1");
        } else if (mango == true) {
            System.out.println("망고 주스 + 1");
        } else if (orange == true) {
            System.out.println("오렌지 주스 + 1");
        } else {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #2");

        // else는 없어도 가능
        hanrabong = false;
        mango = false;
        orange = false;

        if(hanrabong == true) {
            System.out.println("한라봉 에이드 + 1");
        } else if (mango == true) {
            System.out.println("망고 주스 + 1");
        } else if (orange == true) {
            System.out.println("오렌지 주스 + 1");
        }
        System.out.println("커피 주문 완료 #3");
    }

}
