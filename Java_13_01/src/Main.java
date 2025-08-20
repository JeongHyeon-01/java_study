import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void referInputStream() throws IOException {
       //** 콘솔 입출력 방법 **//
//        System.out.println("== System.in ==");
//        System.out.print("입력 :");
//        int a = System.in.read() - '0';
//        System.out.println("a = " + a);
//        System.in.read(new byte[System.in.available()]);

//        System.out.println("== InputStreamReader ==");
//        InputStreamReader reader = new InputStreamReader(System.in);
//        char[] c = new char[3];
//        System.out.print("입력 : " );
//        reader.read(c);
//        System.out.println(c);
        System.out.println("== BufferReader ==");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력 : ");
        String s1 = bf.readLine();
        System.out.println("s1 = " + s1);
    }

    public static void main(String[] args) throws IOException{
        // 1.입력
        //1.1 다른입력 방식 참고
//        referInputStream();

        //1.2 Scanner
        System.out.println("=== Scanner ===");
        Scanner sc = new Scanner(System.in);
//        System.out.print("입력 : ");
//        System.out.println(sc.next());
//        sc.nextLine();

//        System.out.print("입력2 : ");
//        System.out.println(sc.nextInt());
//        sc.nextLine();
//
//        System.out.print("입력3 : ");
//        System.out.println(sc.nextLine());

        //참고) 정수, 문자열 반환
        int num  = Integer.parseInt("123456");
        System.out.println(num);

        String str = Integer.toString(12345);
        System.out.println(str);
        //2.출력
        System.out.println("== 출력 ==");
        System.out.println("Hello");
        System.out.println("World!");


        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println();

        System.out.printf("Hello ");
        System.out.printf("World!");
        System.out.println();

        String s = "JAVA";
        int number = 3;

        System.out.println(s+"는 언어선호도 "+ number +"입니다.");

        System.out.printf("%s는 언어 선호도 %d위 입니다.\n", s, number);
        System.out.printf("%d\n", 10);
        System.out.printf("%o\n", 10);//8진수
        System.out.printf("%x\n", 10);//16진수

        System.out.printf("%f\n", 5.2f);
        System.out.printf("%c\n", 'A');
        System.out.printf("%s\n", "ABCDEF");

        System.out.printf("%-5d\n",123);
        System.out.printf("%5d\n",1234);
        System.out.printf("%5d\n",12345);

        System.out.printf("%.2f\n",1.126412351);

    }
}