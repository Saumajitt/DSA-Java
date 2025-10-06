
public class Super {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}


// base/parent class
class Animal {
    String color;
    Animal(){
        System.out.println("Animal constructor is called");
    }

}

// derived/child class
class Horse extends Animal{
    Horse(){
        super.color = "Brown";
        // super();
        System.out.println("Horse constructor is called");
    }
}
