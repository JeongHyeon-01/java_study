import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        //1~10 숫자중 짝수들의합
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int num :arr){
            if(num % 2 ==0) {
                sum +=num;
            }
        }
        System.out.println(sum);

        //stream으로 구현
        int answer = IntStream.range(1,11).filter(n->n % 2 == 0).sum();
        System.out.println("answer = "+ answer);
    }
}
