//클래스명 Animal
// name weight type
// eat sleep walk run

class Animal {
    String name;
    Double weight;
    String type;

    Animal(String name, Double weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public void printInfo() {
        System.out.println("=== Animal Info ===");
        System.out.println("name : " + this.name);
        System.out.println("weight : " + this.weight);
        System.out.println("type : " + this.type);
    }
    public void eat(String target) {
        System.out.println(target + " eat!");
    }
    public void sleep() {
        System.out.println("sleep... Zzzzz");
    }
    public void walk() {
        System.out.println("walk walk walk");
    }
    public void run() {
        System.out.println("run run run");
    }
}

public class Practice {
    public static void main(String[] args) {
        Animal animal1 = new Animal("강아지", 5.0, "포유류");
        Animal animal2 = new Animal("구피", 0.01, "어류");

        animal1.printInfo();
        animal1.eat("바나나");
        animal2.printInfo();
    }
}
