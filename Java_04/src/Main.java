public class Main  {
    public static void main(String[] args) {
        // 1. 조건문 - if
        System.out.println("==if==");
        int waterTemperature = 100;
        if (waterTemperature >= 100) {
            System.out.println("물이 끊는다.");
        } else {
            System.out.println("물을 끓이는중");
        }

//
//        int score = 30;
//        char grade = 0;
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("grade = " + grade);
//         2. Switch 문
        System.out.println("==switch문==\n");

        String fruit = "blueberry2";
        switch (fruit) {
            case "apple":
                System.out.println(fruit + "은(는) 5000원 입니다.");
                break;
            case "blueberry":
                System.out.println(fruit + "은(는) 10,000원 입니다.");
                break;
            default:
                System.out.println("해당 과일이 없습니다.");
        }

        //Q1. number값이 홀수인지 짝수인지 판단하는 코드 작성
        System.out.println("===문제 1===");
        int number =4;

        if (number % 2 == 1) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
        //Q2 grade변환 if -> switch
        System.out.println("===문제 2===");
        int score = 89;
        char grade = 0;
        switch (score/10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade ='C';
                break;
            default:
                grade = 'F';
                break;
        }
        System.out.println("grade = " + grade);
    }
}