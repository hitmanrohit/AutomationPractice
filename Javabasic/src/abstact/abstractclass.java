package abstact;
abstract class Animal{
	public abstract void animalSound();
	public void sleep() {
		System.out.println("Zzzz");
	}
}
class Pig extends Animal{
	 public void animalSound() {
		System.out.println("the pig says: wee wee");
	}
}
class Dog extends Animal{
	public void animalSound() {
		System.out.println("the dog says: bhow bhow");
	}
}
class abstractclass {
	public static void main(String[] args) {
		Pig p1= new Pig();
		p1.animalSound();
		p1.sleep();
		Dog d1=new Dog();
		d1.animalSound();
		d1.sleep();
	}

}
