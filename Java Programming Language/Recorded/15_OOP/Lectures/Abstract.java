
public class Abstract {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        // horse1.eat();
        // horse1.walk();
        System.out.println(horse1.color);
        horse1.changeColor();
        System.out.println(horse1.color);

        // Chicken chick1 = new Chicken();
        // chick1.eat();
        // chick1.walk();

    }
}

abstract class Animal{

    String color;
    Animal(){
        color = "brown";
    }

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk(); // no implementation here
}


class Horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on four legs");
    }
}


class Chicken extends Animal {
    void changeColor() {
        color = "yellow";
    }
    void walk() {
        System.out.println("Walks on two legs");
    }
}
