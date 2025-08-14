
//내부클래스 구조
class Outer {
    public void print(){
        System.out.println("Outer.print");
    }
    class Inner {
        public void innerPrint(){
            Outer.this.print();
        }
    }
    static class InnerStaticClass {
        void innerStaticPrint() {
            System.out.println("InnerStaticClass.innerStaticPrint");
//            Outer.this.print();
        }
    }
}

abstract class Person {
    public abstract void printInfo();
}

class Student extends Person {
    public void printInfo() {
        System.out.println("Student.printInfo");
    }
}

public class Main {
    public static void main(String[] args) {
        /*내부 클래스
        * 클래스 in 클래스 (클래스 안에 선언한 클래스)
        * 특징
        * 내부클래스에서 외부 클래스 멤버에 접근가능
        * 외부에서 내부 클래스에 접근 불가
        *
        * 인스턴스 클래스
        * 정적 클래스
        * 지역 클래스
        * 익명 클래스
        * */
        //외부 클래스
        Outer o1 = new Outer();
        o1.print();

        //내부클래스
        Outer.Inner i1 = new Outer().new Inner();
        i1.innerPrint();
        //정적
        Outer.InnerStaticClass is1 = new Outer.InnerStaticClass();
        is1.innerStaticPrint();
        //익명
        Person p1 = new Person() {
            @Override
            public void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
        p1.printInfo();
    }
}