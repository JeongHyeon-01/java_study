// Java 프로그래밍 - 변수와 자료형_1

public class Main {
    public static void main(String[] args) {
//      변수 = 데이터를 저장하는 메모리 공간에 붙여준 이름
//      1. 변수 사용하기
        System.out.println("== 변수 사용하기 ==");
        int age = 10;
        System.out.println(age);
        String contry = "korea";
        System.out.println(contry);


//      2. 변수 이름 규칙
        System.out.println("== 변수 이름 규칙 ==");
//      2-1. 문자, 숫자, _(underscore), $ 사용 가능
        int apple= 2000;
        System.out.println("apple = " + apple);
        int apple3 = 2000;
        System.out.println("apple3 = " + apple3);
        int _apple = 4000;
        System.out.println("_apple = " + _apple);
        int $apple = 3000;
        System.out.println("$apple = " + $apple);
//      2-2. 숫자로 시작 X
//        int 3apple = 2000;
//      2-3. 대소문자 구분
        int apple5 = 5000;
        int Apple5 = 5000;
//      2-4. 공백 사용 X
        int one_apple = 1000;
        int onApple = 1000;

//      2-5. 예약어 사용 X
//      예약어 예시: true, false, if, switch, for, continue, break, ...
//        int true = 1;
        
//      참고) 한글 사용 가능
        int 사과 = 1;
        System.out.println("사과 = " + 사과);
        
//      3. 표기법
//      3-1. 카멜 표기법 (camelCase)
//      변수, 함수
        boolean isApple = true;
        int myAge = 14;
        int oneApplePrice = 1000;
        
//      3-2. 파스칼 표기법 (PascalCase)
//      클래스
        int MyAge = 14;
        int OneApplePrice = 1000;
        
//      참고) 스네이크 표기법 (snake_case)
//      사용 X
        int my_age = 10;
        int one_apple_price = 1000;


    }
}

