import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("<<<<[메뉴선택]>>>>\n" +
                    "1. 회원 관리\n" +
                    "2. 과목 관리\n" +
                    "3. 수강 관리\n" +
                    "4. 결제 관리\n" +
                    "5. 종료\n" +
                    "번호를 입력해주세요 : ");

            int convert_sc = sc.nextInt();

            switch (convert_sc) {
                case 1:
                    System.out.println("회원 관리 항목을 선택하셨습니다.");
                    break;
                case 2:
                    System.out.println("과목 관리 항목을 선택하셨습니다.");
                    break;
                case 3:
                    System.out.println("수강 관리 항목을 선택하셨습니다.");
                    break;
                case 4:
                    System.out.println("결제 관리 항목을 선택하셨습니다.");
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("입력값이 정확하지 않습니다. 1부터 5까지의 숫자를 입력해주세요.");
                    break;
            }
            System.out.println();
        }
    }
}