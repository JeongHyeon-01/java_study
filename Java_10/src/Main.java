//추상클래스 Person
abstract class Person {
    abstract void printInfo();
}

//추상클래스 상속
class Student extends Person {
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class Main {
    public static void main(String[] args) {
        /*추상클래스
        * 추상 메소드 abstract Method
        * 자식클래스에서 반드시 오버라이딩 해야하는 메소드
        * 선언만하고 구현내용이 없음
        * 추상클래스
        * 하나 이상의 추상 메소드를 포함하는 클래스
        * 반드시 구현 해야하는 부부네 대해 명시적으로 표현
        * 추상 클래스 자체는 객체 생성 불가
        * */

        //추상클래스 사용
        Student s1 = new Student();
        s1.printInfo();

        Person p2 = new Person() {
            @Override
            void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
        p2.printInfo();
    }
}