import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //자료형 - 리스트
        System.out.println("==리스트==");
        ArrayList l1 = new ArrayList();

        //1-1 add 추가
        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world");
        System.out.println("l1 = "+ l1);

        l1.add(0,1);
        System.out.println("l1 = "+ l1);
//      1-2 get 데이터 가져오기
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));

//      1-3 size 개수출력
        System.out.println(l1.size());

//      1-4 remove 삭제
        System.out.println(l1.remove(0));
        System.out.println("l1 = "+ l1);

        // l1의 2 라는 값을 지우고 싶을때
        System.out.println(l1.remove(Integer.valueOf(2)));
        System.out.println("l1 = "+ l1);

        // l1의 world 라는 값을 지우고 싶을때
        System.out.println(l1.remove(String.valueOf("world")));
        System.out.println("l1 = "+ l1);

//      clear 리스트 비우기
        l1.clear();
        System.out.println("l1 = "+ l1);

//      sort 정렬하기
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);
        System.out.println("l2 = " + l2);

        //오름차순
        l2.sort(Comparator.naturalOrder());
        System.out.println("l2 = " + l2);

        //내림차순
        l2.sort(Comparator.reverseOrder());
        System.out.println("l2 = " + l2);

        //      contains 값이 있는지 체크

        System.out.println(l2.contains(1));
        System.out.println(l2.contains(3));

        //Map
        System.out.println("==MAP==");
        HashMap map= new HashMap();

        // put 데이터 추가
        map.put("kiwi", 9000);
        map.put("banana", 10000);
        map.put("mango", 7000);

        System.out.println("map = " + map);

        //get
        System.out.println(map.get("madarin")); // null
        System.out.println(map.get("kiwi"));


        //size
        System.out.println(map.size());

        //remove
        System.out.println(map.remove("kiwi"));
        System.out.println(map.remove("mandarin"));
        System.out.println("map = " + map);


        //containsKey
        System.out.println(map.containsKey("mango"));
        System.out.println(map.containsKey("kiwi"));

        //Generics
        System.out.println("==Generics==");
        // generics설정 전
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("hello");
        System.out.println("l3 = " + l3);

        HashMap map1 = new HashMap();
        map1.put(123,"id");
        map1.put("apple", 123);
        System.out.println("map1 = " + map1);

        // generics설정 후
        ArrayList<String> l4 = new ArrayList<String>();
//        l4.add(1); // 오류라고 나옴
        l4.add("hello");
        System.out.println("l4 = " + l4);

        HashMap<String, Integer> map2 = new HashMap<>();
//        map2.put(123, "id"); // 오류라고 나옴
        map2.put("id", 123);
        System.out.println("map2 = " + map2);



    }
}