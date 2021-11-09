package OOP;

/*
 * Polimorfiz�m do t� thot� "Many Form", dhe ndodh kur kemi shum� klasa q� jan� t� lidhura me nj�ra-tjetr�n sipas trash�gimis�.
 * 	Inheritance na lejon t� trash�gojm� atribute dhe metoda nga nj� klas� tjet�r. Polimorfizmi p�rdor ato metoda p�r t� kryer detyra t� ndryshme. Kjo na lejon t� kryejm� nj� veprim t� vet�m n� m�nyra t� ndryshme.
 * 
 * */
class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

/*
 * Tani mund t� krijojm� Pigdhe Dogobjekte dhe t� th�rrasim animalSound()metod�n
 * n� t� dyja:
 */
class Polymorphism {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myPig = new Pig();
		Animal myDog = new Dog();
		myAnimal.animalSound();
		myPig.animalSound();
		myDog.animalSound();
	}
}