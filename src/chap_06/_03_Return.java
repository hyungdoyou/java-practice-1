package chap_06;

public class _03_Return {
    // 호텔 전화번호
    // 호텔 주소
    // 호텔 액티비티

    // 호텔 전화번호
    public static String getPhoneNumber() {    // void라고 적으면 반환값이 없는것, 반환값이 있다면 반환값의 형태로 적어줌
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress() {
        String Address = "서울시 강남구 대치동";
        return Address;
    }

    // 호텔 액티비티
    public static String getActivity() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환값
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);

        String contactAddress = getAddress();
        System.out.println("호텔 주소 : " + contactAddress);

        System.out.println("호텔 액티비티 : " + getActivity());
    }
}
