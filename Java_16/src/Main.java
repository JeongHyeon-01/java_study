interface ComputeTool{
    public abstract int compute(int x, int y);

//    public abstract int compute2(int x, int y);

}

public class Main {
    public static void main(String[] args) {
//       람다표현식
//        메소드대신 하나의 식으로 표현하는것
//        익명함수(anonymous function)
//        장점
//        - 코드가 간결해짐
//        - 가독성 & 생산성이 높아짐
//        단점
//        -재사용이 불가능
//        디버깅이 어려움, 재귀함수로는 맞지 않는다.
        ComputeTool cTool1 = new ComputeTool() {
            @Override
            public int compute(int x, int y){
                return x+y;
            }

        };
        System.out.println(cTool1.compute(1,2));

        //람다식 - 인터페이스가 2개 이상이면 사용이 제한된다.
        ComputeTool cTool2 = (x,y) -> {return x + y;};
        System.out.println(cTool2.compute(1,3));
    }
}