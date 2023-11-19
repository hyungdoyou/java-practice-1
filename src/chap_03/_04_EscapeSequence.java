package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자(Escape Sequence, Escape Character, Special Character)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        System.out.println("자바가\n너무\n재밌어요"); // "\n" : 줄바꿈 기능

        // 해물파전 9000원
        // 김치전  8000원
        // 부추전  8000원
        System.out.println("해물파전\t\t9000원"); // "\t" : tab 기능
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        System.out.println("C:\\Program Files\\Java"); // "\\" : \ 문자 표시

        // 단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\" 이라고 했어요"); // \" : " 문자 표시
        System.out.println("단비가 \'냐옹\' 이라고 했어요");
        System.out.println("단비가 '냐옹' 이라고 했어요");

        char c = 'A';
        c = '\'';  // \' : 문자열이 아닌 한개의 문자에서 표시할때 사용
        System.out.println(c); // '
    }
}
