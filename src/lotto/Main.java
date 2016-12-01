package lotto;



import java.util.Scanner;

import lotto.maszyny.MaszynaDuzyLotek;
import lotto.maszyny.MaszynaMalyLotek;
import lotto.maszyny.MaszynaMultiLotek;

public class Main {

	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner odczyt = new Scanner(System.in);
		int iloscKlientow;
		
		System.out.println("Podaj ilosc klientow");
		iloscKlientow = odczyt.nextInt();
		
		
		Kolektura kolektura = new Kolektura(iloscKlientow);
		
		
		
		
	//	Klient klient = new Klient();
	//	klient.zarejestrujKupon();
	//	klient.zarejestrujKupon();
	//	klient.zarejestrujKupon();
	//	Klient klient2 = new Klient();
	//	klient2.zarejestrujKupon();
		System.out.println();
		
		MaszynaDuzyLotek duzy = new MaszynaDuzyLotek();
		MaszynaDuzyLotek duzy2 = new MaszynaDuzyLotek();
		duzy.losujIZapisz();
		duzy2.losujIZapisz();
		System.out.println(duzy.zwrocWynikLosowania());
		System.out.println(duzy2.zwrocWynikLosowania());
		
		
		MaszynaMalyLotek maly = new MaszynaMalyLotek();
		maly.losujIZapisz();
		System.out.println(maly.zwrocWynikLosowania());
		
		MaszynaMultiLotek multi = new MaszynaMultiLotek();
		multi.losujIZapisz();
		System.out.println(multi.zwrocWynikLosowania());
		

	}

}