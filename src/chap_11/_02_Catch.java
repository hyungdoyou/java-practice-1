package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
            // System.out.println(3 / 0);   // ex 1)

            //int[] arr = new int[3];       // ex 2)
            //arr[5] = 100;
//
//            Object obj = "test";           // ex 3)
//            System.out.println((int) obj);

            String s = null;                 // ex 4)
            System.out.println(s.toLowerCase());

        } catch (ArithmeticException e) {                    // ex 1) 여기에서 처리되고 밖으로 빠져나옴
            System.out.println("뭔가 잘못 계산을 하셨네요.");
        } catch (ArrayIndexOutOfBoundsException e) {         // ex 2)
            System.out.println("인덱스를 잘못 설정했어요.");

//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {  // 2가지 에러를 하나의 문장으로 처리하고 싶을 때
//            System.out.println("뭔가 실수하셨네요.");
//        }

        } catch (ClassCastException e) {                     // ex 3)
            System.out.println("잘못된 형 변환입니다.");
        }

        catch (Exception e) {
            System.out.println("그 외의 모든 에러는 여기서 처리가 돼요.");
            e.printStackTrace(); // 어떤 문제가 발생했는지 알려줌
        }

        System.out.println("프로그램 정상 종료");
    }
}
