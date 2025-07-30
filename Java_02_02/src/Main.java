public class Main {
    public static void main (String[] args) {
        System.out.println("===Num===");
//        1-1 정수
        int intNum = 10;
        System.out.println("intNum = "+intNum);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int intNum2 = Integer.MAX_VALUE;
        int intNum3 = Integer.MAX_VALUE+1;
        System.out.println(intNum2);
        System.out.println(intNum3);
        long longNum = (long)Integer.MAX_VALUE +1 ;
        System.out.println(longNum);

//        1-2 실수
        float floatNum = 1.29f;
        double doubleNum = 1.29;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
//      1-3 진수
        int numBase2 = 0b1100;
        int numBase8 = 014;
        int numBase16 = 0xC;
        System.out.println(numBase2);
        System.out.println(numBase8);
        System.out.println(numBase16);

        System.out.println("0b" + Integer.toBinaryString(numBase2));
        System.out.println("0" + Integer.toBinaryString(numBase8));
        System.out.println("0x" + Integer.toBinaryString(numBase16));
//bool
        boolean isPass = true;
        boolean isOk = false;
        System.out.println(isPass);
        System.out.println(isOk);

//        1-5 문자
        char keyFirst ='a';
        char keyLast = 'b';
        System.out.println(keyFirst);
        System.out.println(keyLast);
        System.out.println((int)keyFirst);
        System.out.println((int)keyLast);
    }
}