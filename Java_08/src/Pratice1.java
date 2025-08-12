//Practice1
//

class Animal {
    String desc;
    Animal() {
        this.desc = "동물 클래스 입니다.";
    }

    Animal(String desc) {
        this.desc = desc;
    }
    public void printInfo() {
        System.out.println(this.desc);
    }
}

class Cat extends Animal {
    String desc;
    Cat() {
        super.desc = "고양이 입니다.";
    }
}


public class Pratice1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.printInfo();
    }
}
