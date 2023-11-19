package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램
        // 신발 사이즈는 250부터 295까지 5단위로 증가
        // 신발 사이즈 수는 총 10가지

//        String[] shoessize = {"250", "255", "260", "265", "270", "275", "280", "285", "290", "295"};
//        for (int i = 0; i < 10 ; i++) {
//            System.out.println("사이즈 " + shoessize[i] + " (재고 있음)");
//        }
        int [] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
                sizeArray[i] = 250 + (5 * i);
        }
        for (int size : sizeArray) {
                System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
