//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//
        String s1 = "hello World";
        String s2 = "1234";


        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
        String s5 = new String("Hi");
        System.out.println(s3.equals(s5));
        //== 는 값을 비교 함으로 마지막 은 false
        //s3 s4 는 메모리주소가 같지만 s5의 경우신규로 메모리에 잡아준다.
        System.out.println(s3 == s5);


        // indexOf
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!")); //5
        System.out.println(s6.indexOf("!",s6.indexOf("!")+1));
        //replace
        String s7 = s6.replace("Hello", "Bye");
        System.out.println(s7);

        //substring 부분문자열 뽑기
        System.out.println(s7.substring(0,3)); // Bye  // 012 추출
        System.out.println(s7.substring(0,s7.indexOf("!")+1));

        //toUpperCase
        System.out.println(s7.toUpperCase());

        //StringBuffer - 데이터가 막 변경되어도 객체가 새로생성되지 않는다.
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println(sb1);
        sb1.append("56789");
        System.out.println(sb1);

        String a = "01234";
        String b = "56789";
        String bak = a;
        System.out.println(a == bak);
        a += b;
        System.out.println(a);
        System.out.println( a== bak);

        //배열
        int[] myArray1 = {1,2,3,4,5,6};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a', 'b', 'c', 'd'};
        System.out.println(myArray2[2]);


        String[] myArray3 = new String[3];
        myArray3[0] = "hello";
        myArray3[1] = " ";
        myArray3[2] = "zzz!";
        System.out.println(myArray3[0]+myArray3[1]+myArray3[2]);

    }
}