package it.prova.provastringhe.model;

public class ProvaStringhe {
// questo metodo trasforma una stringa in un array di caratteri
	public static char[] trasformaInArrayDiChar(String input) {

		char[] nuovoArrayStringa = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			nuovoArrayStringa[i] = input.charAt(i);
		}

		return nuovoArrayStringa;

	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static void stampaCaratteriAlContrario(String input) {

		for (int i = input.length() - 1; i >= 0; i--) {

			System.out.println(input.charAt(i));

		}
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static int contaQuanteParoleLunghezzaDispari(String[] frasi) {

		int numeroParoleDispari = 0;
		for (int i = 0; i < frasi.length; i++) {
			if (frasi[i].length() % 2 != 0) {
				numeroParoleDispari++;
			}
		}

		return numeroParoleDispari;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean controllaStringheLunghezzaUguale(String[] controlla) {

		for (int i = 0; i < controlla.length - 1; i++) {
			if (controlla[i].length() != controlla[i + 1].length()) {
				return false;
			}
		}
		return true;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean terminaConCarattere(String[] controllo, char lettera) {

		for (int i = 0; i < controllo.length; i++) {
			if (controllo[i].charAt(controllo[i].length() - 1) != lettera) {
				return false;
			}
		}
		return true;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	// questo metodo calcola quante volte una parola data torna in un array dato
	public static int quanteVolteEPresente(String[] elenco, String nomeDaCercare) {

		int volte = 0;
		for (int i = 0; i < elenco.length; i++) {
			if (elenco[i].equals(nomeDaCercare)) {
				volte++;
			}
		}
		return volte;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean lunghezzeIesime(String[] elenco1, String[] elenco2) {

		if (elenco1.length != (elenco2.length)) {
			return false;
		}
		for (int i = 0; i < elenco1.length; i++) {
			if (!elenco1[i].equals(elenco2[i])) {
				return false;
			}
		}
		return true;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean parolePalindrome(String parola) {

		for (int i = 0; i < parola.length(); i++) {
			if (parola.charAt(i) != parola.charAt(parola.length() - 1 - i)) {
				// confronto carattere dall'inizio con ciclo for con carattere dalla posizione
				// -1 -numero indice di i

				return false;

			}

		}
		return true;

	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean nomiTuttiUgualiInNPosizioni(String[] elenco, int nPosizioni) {

		for (int i = 0; i < nPosizioni; i++) {
			if (!elenco[i].equals(elenco[i + 1])) {
				return false;
			}
		}
		return true;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static void stampaInversaDiUnaStringa(String nome) {

		if (nome.length() == 0) {
			System.out.println("Non c'è stringa da stampare invertita");
			;
		} else {
			System.out.print(nome.charAt(nome.length() - 1));
			stampaInversaDiUnaStringa(nome.substring(0, nome.length() - 1));
		}
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static void stampaNumeriDaUnoAdEnne(int n) {

	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static String[] riempiArrayConStringheDi(String[] elenco, int numeroCaratteri) {
		
		int quanteParole = 0; 
		for (int i = 0; i < elenco.length; i++) {
			if (elenco[i].length() == numeroCaratteri) {
				quanteParole ++;
			}
		}
		int index = 0;
		String[] paroloni = new String[quanteParole]; 
		for (int i = 0; i < elenco.length; i++) {
			if (elenco[i].length() == numeroCaratteri) {
				paroloni[index] = elenco[i];
				index++;
			}
		}
		return paroloni;
		
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++
	

	public static int contaVocali(String testo) {
		
		int numeroVocali = 0; 
		for (int j = 0; j < testo.length(); j++) {
			char i = testo.charAt(j);
			if (i == 'A' || i == 'a' || i == 'E' || i == 'e' || i == 'I' || i == 'i' 
					|| i == 'O' || i == 'o' || i == 'U' || i == 'u') {
				numeroVocali++; 
			}
		}
		return numeroVocali;
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean[] sonoPalindromi(String[] array) {
		
		boolean[] risultato = new boolean [array.length]; //creo array booleano vuoto lunghezza frase
		for (int i = 0; i < array.length; i++) { // ciclo sull'array di stringhe
			String parola = array[i].toLowerCase(); //dichiaro parola in minuscola 
			int lunghezza = parola.length(); // dichiaro variabile int ed assegno lunghezza della mia stringa
			boolean palindromo = true; // aiuto controllo settato su true se la parola è palindroma
			for (int j = 0; j < lunghezza/2; j++) { // divido lunghezza in 2 per agevolare il controllo
				if (parola.charAt(j) != parola.charAt(lunghezza - 1 - j)) { //se lettera posizione j diversa da -j
					palindromo = false; // parola non palindroma se verificata la condizione sopra
				}
			}
			risultato[i] = palindromo; //in posizione ciclo for su i assegno il booleano
		}
		return risultato; // ritorno risultato	
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++
	
	public static String trovaParolaPiuCorta(String[] frase) {
		
		String parolina = frase[0]; 
		for (int i = 1; i < frase.length; i ++) {
			if (frase[i].length() < parolina.length()) {
				parolina = frase[i]; 
			}
		}
		return parolina;
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static int contaParolaLunghezzaPari(String[] pariODispari) {
		
		int parolePari = 0; 
		for (int i = 0; i < pariODispari.length; i++) {
			if (pariODispari[i].length() % 2 == 0) {
				parolePari ++; 
			}
		}
		return parolePari; 
	}

	// ++++++++++++++++++++++++++++++++++++++++++

	public static void invertiOrdineStringhe(String[] array) {
		
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public static boolean haElementoComune(String[] primaFrase, String[] secondaFrase) {
		
		for (int i = 0; i < primaFrase.length; i ++) {
			for (int j = 0; j < secondaFrase.length; j ++) {
				if (primaFrase[i].equalsIgnoreCase(secondaFrase[j])) {
					return true; 
				}
			}
		}
		return false; 
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public static int contaStringheConNumeroVocali(String[] arrayQuanteVocali, int numeroVocali) {
		
		int contatore = 0; 
		for (int i = 0; i < arrayQuanteVocali.length; i++) {
			String parolaDaAnalizzare = arrayQuanteVocali[i].toLowerCase();
			int contaVocaliParola = 0; 
			for (int j = 0; j < parolaDaAnalizzare.length(); j++) {
				if (parolaDaAnalizzare.charAt(j) == 'a' 
						||parolaDaAnalizzare.charAt(j) == 'e'
						||parolaDaAnalizzare.charAt(j) == 'i'
						||parolaDaAnalizzare.charAt(j) == 'o'
						||parolaDaAnalizzare.charAt(j) == 'u') {
					contaVocaliParola ++; 
					}
			}
			if (contaVocaliParola == numeroVocali) {
				contatore ++; 
				}	
		}
		return contatore; 
	}
	
	// ++++++++++++++++++++++++++++++++++++++++++

	public static void stampaSottostringheConLunghezza(String[] classicoArray, int lunghezza) {
		
//		poco codice, si userà subString()
		
		
		
	}
	
	public static int contaStringheInizianoConMaiuscola(String[] stringhe) {
		
		int conteggio = 0; 
		for (int i = 0; i < stringhe.length; i++) {
			if (stringhe[i].charAt(0) <= 90 && stringhe[i].charAt(0) >= 65) {
				conteggio++; 
			}
		}
		return conteggio; 
	}
	
	
	
	
	
	
	
	
	
	
}







