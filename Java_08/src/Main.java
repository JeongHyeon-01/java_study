class Person {
    String name;
    int age;
    public int a1;
    private int a2;

    Person() {}
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    public void printInfo(){
        System.out.println("Person.printInfo");
        System.out.println("name : "+ name);
        System.out.println("age : "+ age);
    }
}

//Student 클래스 - Person 상속 접근제어자 확인
class Student extends Person {
    Student(){
        a1 = 1;
//        a2 = 1;
    }
}
//Student2 클래스 - Person 상속 super사용 오버라이딩
class Student2 extends Person {
    String name;
    int stdId;

    Student2(String name, int age, int stdId){
        this.name = name;
//        super.name = name;
//        super(name, age);
        this.age = age;
        this.stdId = stdId;
    }
    //overriding
    public void printInfo(){
        System.out.println("Student2.printinfo");
        System.out.println("name : "+ name);
        System.out.println("age : "+ age);
        System.out.println("stdId : "+ stdId);
    }
}


public class Main {
    public static void main(String[] args) {
        //상속
        // = 기존 클래스에 기능 추가 및 재정의 하여 새로운 클래스를 정의
        // = 부모클래스 : 상속 대상이 되는 기존클래스
        // = 자식 클래스 : 기존 클래스를 상속하는 클래스
        // 부모클래스의 필드와 메소드가 상속된다. - 생성자, 초기화 블록은 상속되지 않은ㄴ다.
        // 다중상속은 불가능
        // private, default 멤버는 자식클래스에서 접근 불가 -> default의 경우 내부패키지의 자식클래스는 가능하다.
        //super - 부모클래스와 자식클래스의 멤버 이름이 같을때 구분하는 키워드
        // super = 부모 클래스의 생성자를 호출
        System.out.println("==========");
        Student s1 = new Student();
        s1.name = "a";
        s1.age = 19;
        s1.printInfo();

        //오버라이딩
        // 오버로딩과는다름
        // 부모클래스의 메소드를 자식 클래스에서 재정의
        // 오버라이딩 조건
        // 메소드의 선언부는 부모 클래스의 메소드와 동일해야한다.
        // 반환 타입에 한해, 부모 클래스의 반환 타입으로 변환 할수있는 타입으로 변경 가능
        // 반환 타입에 한해 부모클래스의 메소드보다 접근제어자를 더 좁은 범위로 변경 불가
        // 부모클래스의 메소드보다 더큰 범위의 예외선언 불가
        System.out.println("==========");
        Student2 s2 = new Student2("b", 12, 1);
        s2.printInfo();
    }
}