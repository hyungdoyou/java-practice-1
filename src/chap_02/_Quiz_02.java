package chap_02;

import java.sql.SQLOutput;

public class _Quiz_02 {
    public static void main(String[] args) {
        int Child1 = 115;
        int Child2 = 121;

        String Case1 = (Child1 >= 120) ? ("키가 " + Child1 + "cm 이므로 탑승 가능합니다") : ("키가 " + Child1 + "cm 이므로 탑승 불가능합니다");
        String Case2 = (Child2 >= 120) ? ("키가 " + Child2 + "cm 이므로 탑승 가능합니다") : ("키가 " + Child2 + "cm 이므로 탑승 불가능합니다");

        System.out.println(Case1);
        System.out.println(Case2);


        /* 인강 답안
        int height = 115;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        system.out.println("키가 " + height + "cm 이므로 " + result);
         */
    }
}
