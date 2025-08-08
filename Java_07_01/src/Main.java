// Car 클래스 만들기
class Car {
    String name;
    String type;

    public void printCarInfo(){
        System.out.println("== Car Info ==");
        System.out.println("name = "+ name);
        System.out.println("type = "+ type);
    }
    public void move(){
        System.out.println("move!");
    }
    public void brak(){
        System.out.println("break!");
    }

}

//Car2클래스 - 생성자 , this
class Car2 {
    String name;
    String type;

    Car2(String name, String type) {
        this.name = name;
        this.type = type;
        System.out.println("생성자 출력");
    }
    public void printCarInfo(){
        System.out.println("== Car Info ==");
        System.out.println("name = "+ name);
        System.out.println("type = "+ type);
    }
    public void load(){
        System.out.println("load");
    }
    public void horn(){
        System.out.println("ummmm");
    }
}

public class Main {
    public static void main(String[] args) {
        // usage Car class
        Car myCar1 = new Car();
        myCar1.name = "a";
        myCar1.type = "suv";
        myCar1.printCarInfo();
        myCar1.move();
        myCar1.brak();

        Car2 myCar2 = new Car2("b", "sedan");
        myCar2.printCarInfo();
        myCar2.load();
        myCar2.horn();
    }
}