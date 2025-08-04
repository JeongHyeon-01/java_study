public class Main {
    public static void main(String[] args) {
         //2진법
        //비트연산자
        //비트논리연산자
        //And 연산자
        int num1 = 5;
        int num2 = 3;
        int result = 0;
        result = num1 & num2;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

        //or연산자
        result = num1 | num2;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));

        //XOR연산자
        result = num1 ^ num2;
        System.out.println(result);
        System.out.println(Integer.toBinaryString(num1));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));


        //반전연산자
        num1 = 5;
        result = ~num1;
        System.out.println(result);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));
        System.out.printf("%s\n", Integer.toBinaryString(result));

        //비트 이동 연산자
        int numA = 3;
        result = numA <<1;
        System.out.println(numA);
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));


        //비트 이동연산자
    }
}