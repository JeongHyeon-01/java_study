import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class NotTenException extends RuntimeException {

};

public class Main {
    public static  boolean checkTen(int ten) {
        if (ten != 10) {
            return false;
        }
        return true;
    }

    public static boolean checkTenWithException(int ten) {
        try {
            if (ten != 10) {
                throw new NotTenException();
            }
        } catch (NotTenException e) {
            System.out.println("e = " + e);
            return false;
        }
        return true;
    };
    public static boolean checkTenWithThrows(int ten) throws NotTenException {
        if (ten != 10) {
            throw new NotTenException();
        }
        return true;
    }
    public static void main(String[] args) {
        /*예외
        * 정상적이지 않은 Case
        * try-catch 문으로 예외처리가능
        * finally 예외발생여부와 관계없이 실행
        * throw : 예외를 강제로 발생
        * throws 예외를 전가시킨다. -> 함수내부 에러발생시 외부(함수를호출한쪽)에서 처리가능
        *  */

        //0으로 나누기
        System.out.println("== 0으로 나누기");
//        int a = 5/0;
        try {
            int a = 5/0;
        }catch (ArithmeticException e) {
            System.out.println("0 division exception");
        }finally {
            System.out.println("finally... ");
        }

        //배열인덱스 초과
        System.out.println("=== 배열인덱스 초과===");
        int[] b = new int[4];
//        b[4] = 1;
        try {
            b[4] = 1;
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        //없는 파일 열기
        System.out.println("===없는파일열기===");
        try {
            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        //throw, throws
        System.out.println("=== checkTen ===");
        boolean checkResult = Main.checkTen(10);
        System.out.println("CheckResult = "+ checkResult);

        System.out.println("=== checkTenWithException ===");
        checkResult = Main.checkTenWithException(10);
        System.out.println("CheckResult = "+ checkResult);

        System.out.println("=== checkTenWithThrows ===");
        try {
            checkResult = Main.checkTenWithThrows(4);
        } catch (NotTenException e) {
            System.out.println("e = "+ e);
            checkResult = false;
        }
        System.out.println("CheckResult = "+ checkResult);

    }
}