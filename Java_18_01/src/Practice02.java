import java.util.Scanner;

public class Practice02 {

    public static void soultion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳을 입력 해주세요 : ");
        char input = sc.nextLine().charAt(0);
        int output = 0;

        int step = (int)'a' - (int)'A';
        if (input >= 'a' && input <= 'z'){
            output = (int)input - step;
            System.out.println("대문자 변환 : " + (char)output);
        } else if(input >= 'A' && input <= 'Z'){
                output = (int)input + step;
                System.out.println("소문자 변환 : " + (char)output);
        }else{
            System.out.println("입력 값은 알파벳이 아닙니다.");
        }
    }
    public static void reference() {
        int a = (int)'a';
        System.out.println("a = " + a);
        int z = (int)'z';
        System.out.println("z = " + z);
        int A = (int)'A';
        System.out.println("A = " + A);
        int Z = (int)'Z';
        System.out.println("Z = " + Z);
        int etc = (int)'%';
        System.out.println("etc = " + etc);
    }
    public static void main(String[] args) {
        soultion();
//        reference();
    }
}
