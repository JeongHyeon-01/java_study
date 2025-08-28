import java.util.Scanner;

public class Practice01_2 {
    public static void main(String[] args) {
        //캐시백 계산
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력 주세요.(금액):");
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        // 1. 결제 금액의 10%를 계산
        double cashbackAmount = price * 0.1;
        // 2. 100원 단위로 버림
        int roundedCashback = (int) (cashbackAmount / 100) * 100;
        // 3. 최대 300원으로 제한
        int finalCashback = Math.min(roundedCashback, 300);
        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", price, finalCashback);
    }
}