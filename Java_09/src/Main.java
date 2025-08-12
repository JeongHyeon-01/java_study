class Person {
    public void print() {
        System.out.println("Person.print");
    }
}
class Student extends Person {
    public void print() {
        System.out.println("Student.print");
    }
    public void print2() {
        System.out.println("Student.print2");
    }
}
class CollageStudent extends Person {

    public void print() {
        System.out.println("CollageStudent.print");
    }
}

public class Main {
    public static void main(String[] args) {
        /* 다형성
        * 한 객체가 여러 가지 타입을 가질수잇는것
        * 부모클래스 타입의 참조 변수로 자식클래스 인스턴스를 참조하는것
        * instanceof
        *  실제 참조하고있는 인스턴스의 ㅏㅌ입확인
        * */
        System.out.println("=== 다형성 ===");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student();
        //역참조는 불가
//        Student s2 = new Person();

        p1.print();
        s1.print();
        s1.print2();
        p2.print();

        Person p3 = new CollageStudent();
        p3.print();
//        동일관계는 불가
//        CollageStudent c1 = new Student();


        System.out.println("=== 타입 변환 ===");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student();//업 캐스팅

        pp1 = pp2;
        pp1 = ss2;

        ss1 = ss2;
//        ss1 = pp2;// student가 부모를 가리킴

        ss1 = (Student) pp3; // 다운캐스팅

        CollageStudent cc1;
        CollageStudent cc2 = new CollageStudent();
//        ss1 = (Student) cc2;
//        cc1 = (CollageStudent) ss2;


        System.out.println("=== instance of ===");
        Person pe1 = new Person();
        Person st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollageStudent();

        System.out.println(pe1 instanceof Person); //t
        System.out.println(pe1 instanceof Student); //f

        System.out.println(st1 instanceof Student); //t
        System.out.println(st1 instanceof Person); //t

        System.out.println(pe2 instanceof Person); //t
        System.out.println(pe2 instanceof Student); //t

        System.out.println(pe3 instanceof Person); //t
        System.out.println(pe3 instanceof CollageStudent);//t


        if (pe1 instanceof Student) {
            Student stu1 = (Student) pe1;
        }

        if (st1 instanceof Person) {
            Person per1 = (Person)st1;
        }
    }
}