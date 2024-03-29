package chap_09;

import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // 반복자
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("(알 수 없음)");
        list.add("김종국");
        list.add("(알 수 없음)");
        list.add("강호동");
        list.add("(알 수 없음)");
        list.add("박명수");
        list.add("(알 수 없음)");
        list.add("조세호");

        for (String s: list) {
            System.out.println(s);
        }
        System.out.println("-----------------------------");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        System.out.println("-----------------------------");

        it = list.iterator(); // 커서를 처음 위치로 이동시킴
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------------------------");

        // 잘못된 데이터를 삭제
        it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("(알 수 없음)")) {
                it.remove();
            }
        }
        it = list.iterator(); // 커서를 처음 위치로 이동시킴
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("-----------------------------");

        HashSet<String> set = new HashSet<>();
        set.add("유재석");
        set.add("박명수");

        Iterator<String> itset = set.iterator();
        while(itset.hasNext()) {
            System.out.println(itset.next());
        }

        System.out.println("-----------------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("유재석", 10);
        map.put("박명수", 5);

        // map.iterator() // 제공되지 않음

        Iterator<String> iterMapKey = map.keySet().iterator();
        while(iterMapKey.hasNext()) {
            System.out.println(iterMapKey.next());
        }

        System.out.println("-----------------------------");

        Iterator<Integer> itMapValue = map.values().iterator();
        while(itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        System.out.println("-----------------------------");

        Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
        while (itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
