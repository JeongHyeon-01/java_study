public class Main {
    public static void main(String[] args) {
        // 대입 연산, 부호연산
        int num = 100;
        num = +10;
        num = 10;
        num =-1;

        //산술연산, 증감 연산
        System.out.println("==산술연산자, 증감 연산자 ==");
        int numX = 10;
        int numY = 3;
        int result = 0;
        result = numX + numY;
        result = numX - numY;
        result = numX * numY;
        result = numX / numY;
        result = numX % numY;
        System.out.println("result : " + result);

        int numZ = 1;
        System.out.println(numZ++); // num을 Print후에 1을 더한다.
        System.out.println(numZ);
        numZ = 1;
        System.out.println(++numZ);

        numZ=1;
        System.out.println(numZ--); // num을 Print후에 1을 더한다.
        System.out.println(numZ);
        numZ = 1;
        System.out.println(--numZ);
        //관계연산자
        int num1 = 10;
        int num2 = 9;

        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        //논리연산
        System.out.println((10>9)&&(1==0));
        System.out.println((10>9) || (1==0));

        //복합대입연산자
        int num3 = 10;
        int num4 = 5;
        num3 += num4;
        System.out.println(num3);

        num3 -= num4;


        //삼항연산
        int a  = 100;
        String aResult = (a==100) ? "yes": "no";
        System.out.println(aResult);




    }
}