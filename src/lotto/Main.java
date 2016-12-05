package lotto;



import java.util.Scanner;

import lotto.maszyny.MaszynaDuzyLotek;
import lotto.maszyny.MaszynaMalyLotek;
import lotto.maszyny.MaszynaMultiLotek;

public class Main {

	
	public static void main(String[] args){
	
		int liczbaKlientow = 100;
		Klient[] klienci = new Klient[liczbaKlientow];
		Kolektura kolektura = new Kolektura();
		
	//	Klient klient = new Klient();
	//	Klient klient2 = new Klient();
		
	//	kolektura.skreslChybilTrafil(klient);
	//	kolektura.skreslChybilTrafil(klient2);
		

		
		
		for(int i=0; i<liczbaKlientow; i++){
			Klient klient = new Klient();
			kolektura.skreslChybilTrafil(klient);
			System.out.println(klient.getKupon().toString());
			klienci[i] = klient;
		}
		
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj numer klienta");
		int numer = odczyt.nextInt();
		
		
		System.out.println(klienci[numer-1].toString());
		System.out.println(klienci[numer-1].getKupon().toString());
		
		
		
		//obiekt klient, klient daje input do kolektury i dostaje cos w zamian (kupon)
		
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