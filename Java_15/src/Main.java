import java.util.*;

public class Main {
    public static void main(String[] args) {
        /* 컬렉션 프레임워크
        * 여러 데이터를 편리하게 관리할수있게 만들어 놓은것
        * 자로구조 및 알고리즘을 구조화
        * 대표 인터페이스
        * List Set Map
        * List 인터페이스
        * - 순서가 있는데이터의 집합
        * - 데이터 중복허용
        * - ArrayList LinkedList Vector
        * Set 인터페이스
        * - 순서가 없는 데이터의 집합
        * - 데이터의 중복을 허용하지 않는다
        * - HashSet TreeSet
        * Map 인터페이스
        * - 키와 값의 쌍으로 이루어진 데이터 집합
        * - 순서를 유지하지 않는다
        * - HashMap TreeMap
        *  */
        //1.List
        // 1-1 ArrayList
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1 );
        list1.remove(Integer.valueOf(2));
        System.out.println("list1 = " + list1 );
        list1.add(0,12);
        System.out.println("list1 = " + list1 );
        System.out.println("list1.size()"+list1.size());
        System.out.println("list1.contains(1)"+list1.contains(1));
        System.out.println("list1.indexOf(12)"+list1.indexOf(12));
        //Linkedlist
        System.out.println("===LinkedList===");
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list2 = "+ list2);
        list2.addFirst(10);
        list2.addLast(100);
        System.out.println("list2 = "+ list2);
        list2.remove(Integer.valueOf(2));
        System.out.println("list2 = "+ list2);
        list2.removeFirst();
        System.out.println("list2 = "+ list2);
        list2.removeLast();
        System.out.println("list2 = "+ list2);
        System.out.println(list2.size());

        //Set
        //HashSet
        System.out.println("==HashSet==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1);
        System.out.println("set1 = " + set1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(2);
        System.out.println(set1.size());
        System.out.println(set1.contains(2));

        //TreeSet
        System.out.println("=== TreeSet ===");
        TreeSet set2 = new TreeSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("set2 = " + set2);
        set2.remove(2);
        System.out.println("set2 = " + set2);
        set2.clear();
        System.out.println("set2 = " + set2);
        set2.add(10);
        set2.add(20);
        set2.add(30);
        set2.add(20);
        System.out.println("set2 = " + set2);
        System.out.println(set2.first());
        System.out.println(set2.last());
        System.out.println(set2.lower(20));
        System.out.println(set2.higher(10));

        //3.Map
        //3-1 HashMap
        System.out.println("===HashMap===");

        HashMap map1 = new HashMap();
        map1.put(1, "kiwi");
        map1.put(2, "apple");
        map1.put(3, "lemon");
        System.out.println("map1 = "+ map1);
        map1.remove(2);
        System.out.println("map1 = "+ map1);

        System.out.println("map1.get(1) = "+ map1.get(1));

        //TreeMap
        System.out.println("===TreeMap===");
        TreeMap map2 = new TreeMap<>();
        map2.put(1, "kiwi");
        map2.put(2, "lemon");
        map2.put(3, "apple");
        System.out.println("map2 = "+ map2);
        map2.remove(2);
        System.out.println("map2 = "+ map2);
        System.out.println(map2.firstEntry());
        System.out.println(map2.firstKey());
        map2.put(2, "watermelon");
        System.out.println("map2 = "+ map2);
        System.out.println(map2.lastEntry());
        System.out.println(map2.lastKey());

        System.out.println(map2.higherEntry(2));
        System.out.println(map2.lowerEntry(2));




    }
}