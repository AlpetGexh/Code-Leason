package OOP;
/*
 * 
 * interface �sht�  nj� "abstract class" plot�sisht q� p�rdoret p�r t� grupuar metoda t� lidhura me trupa bosh:
 * 
 * P�r t� hyr� n� metodat e nd�rfaqes, nd�rfaqja duhet t� "implemented" (si� �sht� trash�guar) nga nj� klas� tjet�r me fjal�n implements ky�e (n� vend t� extends). 
 * Trupi i metod�s s� nd�rfaqes sigurohet nga klasa "implement":
 * 
 * */

//interface
interface Animal {
	public void animalSound(); // interface method (does not have a body)

	public void sleep(); // interface method (does not have a body)
}

interface Mouse {
	public void myMouse(); // interface method
}

interface Keyboard {
	public void myKeboard(); // interface method
}

//Multi Interface
class Sets implements Mouse, Keyboard {
	public void myMouse() {
		System.out.println("GXT 131 Ranoo Wireless Gaming Mouse");
	}

	public void myKeboard() {
		System.out.println("HyperX Alloy Origins 60 Mechanical Gaming Keyboard");
	}
}

//Pig "implements" the Animal interface
class Pig implements Animal {
	public void animalSound() {
		// The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}

	public void sleep() {
		// The body of sleep() is provided here
		System.out.println("Zzz");
	}
}

class Intercar { // (Main)
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
		myPig.animalSound();
		myPig.sleep();
		Sets mySet = new Sets();
		mySet.myMouse();
		mySet.myKeboard();

	}
	
	
	/*
	 * Ashtu si klasat abstrakte , nd�rfaqet nuk mund t� p�rdoren p�r t� krijuar objekte (n� shembullin e m�sip�rm, nuk �sht� e mundur t� krijohet nj� objekt "Animal" n� MyMainClass)
	 * 
	 * Metodat e nd�rfaqes nuk kan� nj� trup - trupi sigurohet nga klasa "implement".
	 * 
	 * N� zbatimin e nj� nd�rfaqeje, duhet t� anashkaloni t� gjitha metodat e saj
	 * 
	 * Metodat e nd�rfaqes jan� si parazgjedhje abstractdhe public
	 *
	 * Atributet Interface jan� nga default public, staticdhefinal
	 *
	 * Nj� nd�rfaqe nuk mund t� p�rmbaj� nj� konstruktor (pasi nuk mund t� p�rdoret p�r t� krijuar objekte

	 * *
	/*
	 * 
	 * Pse dhe kur t� p�rdorni nd�rfaqet?
			1) P�r t� arritur sigurin� - fshihni disa detaje dhe tregoni vet�m detajet e r�nd�sishme t� nj� objekti (nd�rfaqes).

			2) Java nuk mb�shtet "trash�gimin� e shum�fisht�" (nj� klas� mund t� trash�goj� vet�m nga nj� superklas�). Megjithat�, mund t� arrihet me nd�rfaqe, sepse klasa mund t� implementoj� nd�rfaqe t� shumta. Sh�nim: P�r t� implementuar nd�rfaqe t� shumta, ndajini ato me presje (shih shembullin m� posht�)

	 * */
}
