package OOP;

/*
 *	Data abstraction �sht� procesi i fshehjes s� disa detajeve dhe shfaqjes s� p�rdoruesit vet�m t� informacionit thelb�sor.
 *	Abstraksioni mund t� arrihet ose me abstract classes  ose me Interface 
 * 
 * 
 * 	Fjala abstract  �sht� nj� modifikues pa akses, i p�rdorur p�r klasa dhe metoda:
 * 
 * 
 * Abstract class: �sht� nj� klas� e kufizuar q� nuk mund t� p�rdoret p�r t� krijuar objekte (p�r t� hyr� n� t�, duhet t� trash�gohet nga nj� klas� tjet�r).
 * 
 * Abstract method: mund t� p�rdoret vet�m n� nj� klas� abstrakte, dhe ajo nuk ka nj� trup. Trupi sigurohet nga n�nklasa (e trash�guar nga).
 * 
 * */

//Klasat Absatcte
abstract class Computer {

	public abstract void computerStats();

// Regular method
	public void computerShutDown() {
		System.out.println("Alt+f4");
	}
}

//Subclass (inherit nga Animal)
class GPU extends Computer {
	public void computerStats() {
		// The body of computerStats() is provided here
		System.out.println("GTX 3090");
	}
}

class Abstract {// (Main)
	public static void main(String[] args) {
//		Computer obj = new Computer(); //Error sepse p�r t� hyr� n� klas�n abstrakte, ajo duhet t� trash�gohet nga nj� klas� tjet�r
		GPU myPig = new GPU(); // Create a GPU object
		myPig.computerStats();
		myPig.computerShutDown();
	}
}
