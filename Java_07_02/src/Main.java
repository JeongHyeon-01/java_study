import car.Car2;

class Car {
    String name;
    String type;

    Car(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo(){
        System.out.println("== Car Info ==");
        System.out.println("name = "+ name);
        System.out.println("type = "+ type);
    }
    //오버로딩 구현 외부 날짜나 차번호 추가입력을 위한
    public void printCarInfo(String date) {
        this.printCarInfo();
        System.out.println("date : " + date);

    }
    public void printCarInfo(int number) {
        this.printCarInfo();
        System.out.println("number : " + number);

    }
    public void printCarInfo(String date, int number) {
        this.printCarInfo();
        System.out.println("date : " + date);
        System.out.println("number : " + number);
    }

}
class Car3 {
    static String name = "None";
    String type;

    Car3(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void printCarInfo() {
        System.out.println("== Car Info ==");
        System.out.println("name = " + name);
        System.out.println("type = " + type);
    }
    //스태틱 메소드
    public static void getName() {
        System.out.println("car name : " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Car mycar1 = new Car("a", "sedan");
        mycar1.printCarInfo();
    //오버로딩
        System.out.println("===오버로딩사용===");
        mycar1.printCarInfo("2022");
        mycar1.printCarInfo(1234);
        mycar1.printCarInfo("2022", 1234);
    //접근제어자
        System.out.println("===접근제어자===");
        Car2 myCar2 = new Car2("a","b","c","d");
        System.out.println(myCar2.name1);
//        System.out.println(myCar2.name2);
//        System.out.println(myCar2.name3);
//        System.out.println(myCar2.name4);
    //static
        System.out.println("===Static===");
        Car3.getName();
    }
}