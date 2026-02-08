class Animal {
    void speak() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.speak();  
        d.bark();  
    }
}
