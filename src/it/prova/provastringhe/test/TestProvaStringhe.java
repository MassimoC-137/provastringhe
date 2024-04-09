package it.prova.provastringhe.test;

import java.util.Arrays;

import it.prova.provastringhe.model.ProvaStringhe;

public class TestProvaStringhe {

	public static void main(String[] args) {

//		String input = "Ciao";
//		char[] nuovoArrayStringa = ProvaStringhe.trasformaInArrayDiChar(input);
//		for (int i = 0; i < nuovoArrayStringa.length; i++) {
//			System.out.println(nuovoArrayStringa[i]);
//		}
//
//		ProvaStringhe.stampaCaratteriAlContrario(input);
//		
//		String[] frasi = {"Ciao", "mi", "chiamo", "Massimo", "e", "sto", "studiando", "Java"}; 
//		System.out.println(ProvaStringhe.contaQuanteParoleLunghezzaDispari(frasi));
//	
//		
//		String[] paroleDaQuattro = {"casa", "mare", "remo", "more", "caro"};
//		System.out.println(ProvaStringhe.controllaStringheLunghezzaUguale(paroleDaQuattro));
//		
//		String[] paroleCheTerminanoCon = {"casa", "patata", "pizza", "gatta"}; 
//		char letteraControllo = 'a';
//		System.out.println(ProvaStringhe.terminaConCarattere(paroleCheTerminanoCon, letteraControllo));
//		
//		String[] elenco = {"ciao", "ciao", "caio", "ciao", "coia", "ciao"}; 
//		String nomeDaCercare = "ciao"; 
//		System.out.println(ProvaStringhe.quanteVolteEPresente(elenco, nomeDaCercare));
//		
//		String [] elenco1 = {"ciao", "ciccio", "come", "stai"}; 
//		String [] elenco2 = {"ciao", "ciccio", "come", "stai"};
//		System.out.println(ProvaStringhe.lunghezzeIesime(elenco1, elenco2));
//	
//		String parolaTenet = "SatoRArepOTeneTOperARotaS"; 
//		System.out.println(ProvaStringhe.parolePalindrome(parolaTenet));
//		
//		String[] elenco = {"ciao", "ciao", "ciao", "io", "sono", "Massimo"}; 
//		int nPosizione = 2; 
//		System.out.println(ProvaStringhe.nomiTuttiUgualiInNPosizioni(elenco, nPosizione));
//
//		String nome = ""; 
//		ProvaStringhe.stampaInversaDiUnaStringa(nome);
//		
//		String[] elenco = {"banana", "mela", "pera", "ananas", "mango", "cocco", "uva"}; 
//		String[] frutta = ProvaStringhe.riempiArrayConStringheDi(elenco, 4); 
//		System.out.println(Arrays.toString(frutta));
//		
//		System.out.println(ProvaStringhe.contaVocali("Aiuole sono bellE"));
//		
//		String[] parole = {"il", "radar", "di", "Anna"}; //dichiaro array di stringhe
//		boolean[] risultatoPalindromi = ProvaStringhe.sonoPalindromi(parole); //creo array di boolean 
////	dove chiamo il metodo
//		
//		for (int i = 0; i < parole.length; i ++) {  // ciclo sull'array di stringhe per verificare se sono palindrome
//			System.out.println(parole[i] + " è un palindromo? " + risultatoPalindromi[i]);  
//		}
//		
//		String[] frase = {"io", "sto", "programmando", "in", "Java"}; 
//		System.out.println(ProvaStringhe.trovaParolaPiuCorta(frase));
//		
//		String[] pariODispari = {"mi", "chiamo", "Max", "e", "mi", "piace", "la", "scienza", }; 
//		System.out.println(ProvaStringhe.contaParolaLunghezzaPari(pariODispari));
//		
//		String[] frase = {"In", "girum", "imus", "nocte", "et", "consumimur", "igni"}; 
//		ProvaStringhe.invertiOrdineStringhe(frase);
//		
//		
//		String[] primaFrase = {"Mi", "chiamo", "Massimo", "e", "studio", "data", "science"}; 
//		String[] secondaFrase = {"E", "tu", "come", "ti", "chiami"}; 
//		
//		if (ProvaStringhe.haElementoComune(primaFrase, secondaFrase)) {
//			System.out.println("Le frasi hanno una parola in comune");
//		}else {
//			System.out.println("Nessuna parola in comune");
//		}
//		
	
		String[] arrayConVocali = {"Questo", "e", "un", "array", "con", "delle", "vocali"}; 
//		int quanteVocali = 3; 
//		System.out.println(ProvaStringhe.contaStringheConNumeroVocali(arrayConVocali, quanteVocali));

		System.out.println(ProvaStringhe.contaStringheInizianoConMaiuscola(arrayConVocali));
		
		
		
		
	}

}
