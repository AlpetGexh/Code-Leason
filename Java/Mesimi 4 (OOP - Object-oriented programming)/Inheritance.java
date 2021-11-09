package OOP;

/*
 * N� Java, �sht� e mundur t� trash�gohen atributet dhe metodat nga nj� klas� n� tjetr�n. Ne e grupojm� "inheritance concept" n� dy kategori:

	subclass  (child) - klasa q� trash�gon nga nj� klas� tjet�r
	superclass (parent) - klasa nga e cila �sht� trash�guar

P�r t� trash�guar nga nj� klas�, p�rdorni fjal�n "extends"
 * */
class Computer {
	protected String computer = "Dell";

	protected void myComputer() {
		System.out.println("Workstation");
	}
}

public class Inheritance extends Computer {
	private String modalConputer = "HP";

	public static void main(String[] args) {
		Inheritance Computer = new Inheritance();

		Computer.myComputer(); // thirrja e metodes ne Computer

		// Vleata e atributit nga Computer dhe Inheritance
		System.out.println("Kompjuteri im �sht�: " + Computer.computer + " nd�rsa i shkoll�s " + Computer.modalConputer);

	}

}