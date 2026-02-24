class Animal{
    void Sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void Sound(){
        super.Sound();
        System.out.println("Dogs barks");
    }
}
public class parent{
	public static void main(String[] args) {
		Dog obj = new Dog();
	
		obj.Sound();
	}
}
