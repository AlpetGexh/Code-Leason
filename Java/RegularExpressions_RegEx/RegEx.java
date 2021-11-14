package RegularExpressions_RegEx;

import java.util.regex.*; //importi 

/*\
 * �sht� nj� sekuenc� karakteresh q� formon nj� model k�rkimi. Kur k�rkoni p�r t� dh�na n� nj� tekst, mund ta p�rdorni k�t� model k�rkimi p�r t� p�rshkruar at� q� po k�rkoni.
 * 
 *  mund t� jet� nj� karakter i vet�m, ose nj� model m� i nd�rlikuar.
 *  
 * Pattern Klasa - P�rcakton nj� model (p�r t'u p�rdorur n� nj� k�rkim)
 * Matcher Klasa - P�rdoret p�r t� k�rkuar modelin
 * PatternSyntaxException Klasa - Tregon gabim sintaksor n� nj� model shprehjeje t� rregullt
 * */
public class RegEx {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("alpetg2004G17", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Emri: AlpetG2004G17");
		boolean matchFound = matcher.find();
		if (matchFound)
			System.out.println("Teksti p�rputhet");
		else
			System.out.println("Teksti nuk p�rputhet");

		
		/*
		 * Parametri i par� (" Pattern.compile() " )tregon se cili model �sht� duke u
		 * k�rkuar dhe parametri i dyt� ka nj� flamur p�r t� treguar se k�rkimi duhet t�
		 * jet� i pandjesh�m ndaj shkronjave t� vogla. Parametri i dyt� �sht� opsional.
		 * 
		 * matcher()Metod� p�rdoret p�r t� gjetur modelin n� nj� varg. Ai kthen nj�
		 * objekt Matcher i cili p�rmban informacion n� lidhje me k�rkimin q� �sht�
		 * kryer.
		 * 
		 * 
		 * find()Metoda Kthen TRUE n�se model u gjet n� varg dhe t� rreme, n�se ajo nuk
		 * �sht� gjetur.sF
		 * 
		 * 
		 * 
		 * 
		 * 
		 * Pattern.CASE_INSENSITIVE - Rasti i shkronjave do t� injorohet gjat� kryerjes
		 * s� nj� k�rkimi. Pattern.LITERAL - Karakteret speciale n� model nuk do t� ken�
		 * ndonj� kuptim t� ve�ant� dhe do t� trajtohen si karaktere t� zakonshme gjat�
		 * kryerjes s� nj� k�rkimi. Pattern.UNICODE_CASE- P�rdoreni at� s� bashku me
		 * CASE_INSENSITIVEflamurin p�r t� injoruar edhe rastin e shkronjave jasht�
		 * alfabetit anglez
		 */
		
		String str = "Alpetgexha";
		String redax = "[0-9]";
		Pattern p = Pattern.compile(redax);
		Matcher m = p.matcher(str);
		boolean match1 = m.find();
		if (match1)
			System.out.println("Teksti p�rputhet");
		else
			System.out.println("Teksti nuk p�rputhet");
		/*Mathcher*/
		/*
		* 
		* 	|	Find a match for any one of the patterns separated by | as in: cat|dog|fish
		*	.	Find just one instance of any character
		*	^	Finds a match as the beginsning of a string as in: ^Hello
		*	$	Finds a match at the end of the string as in: World$
		*	\d	Find a digit
		*	\s	Find a whitespace character
		*	\b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
		*
		* */

	}

}
