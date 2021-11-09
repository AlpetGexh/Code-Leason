package OOP;

/*
 * 
 * N� Java, �sht� gjithashtu e mundur t� vendosen klasa (nj� klas� brenda nj� klase). Q�llimi i klasave t� mbivendosura �sht� t� grupoj� klasat q� i p�rkasin s� bashku, gj� q� e b�n kodin tuaj m� t� lexuesh�m dhe t� mir�mbajtur.
 * 
 * */

class MainClass {
	int x = 10;

	class MainInnerClass {
		int y = 5;
		public int sum(int x) {
			return x + 4;
		}
	}
}

public class InnerClasses {
	public static void main(String[] args) {
		MainClass myOuter = new MainClass();
		MainClass.MainInnerClass myInner = myOuter.new MainInnerClass(); //Thirrja e inner klases
		System.out.println(myInner.y + myOuter.x);
		System.out.println(myInner.sum(5)); //thirrja e funsionit

	}
}
