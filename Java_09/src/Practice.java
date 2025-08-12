class Car {
    Car () {}
    public void horn() {
        System.out.println("빵빵");
    }
}

class FireTruck extends Car{
    public void horn() {
        System.out.println("위이잉");
    }
}

class Ambulance extends Car {
    public void horn() {
        System.out.println("삐뽀삐뽀");
    }
}

public class Practice {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.horn();

        c1 = new FireTruck();
        c1.horn();

        c1 = new Ambulance();
        c1.horn();

        Car c2[] = {new Car(), new FireTruck(), new Ambulance()};
        for (Car item : c2) {
            item.horn();
        }
    }
}
