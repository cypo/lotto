package lotto;

import java.io.IOException;

import lotto.kolektura.Baza;
import lotto.kolektura.BazaInterfejs;
import lotto.kolektura.Kolektura;
import lotto.maszyny.MaszynaDuzyLotek;
import lotto.maszyny.MaszynaMalyLotek;
import lotto.maszyny.MaszynaMultiLotek;

public class Main{
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		
		int liczbaKlientow = 10000;
		Klient[] klienci = new Klient[liczbaKlientow];
		Klient klient = null;
		Kolektura kolektura = new Kolektura();
		BazaInterfejs baza = null;
		
		
		for(int i=0; i<liczbaKlientow; i++){
			klient = new Klient();
			klient.setKupon(kolektura.skreslChybilTrafil(klient.getKupon()));
			System.out.println(klient.getKupon().toString());
			klienci[i] = klient; 
		}
		
	
		System.out.println("ODCZYT Z PLIKU:");
		baza = Baza.getInstance();
		System.out.println("Maly: "+baza.pobierzMaly().get(0));
		System.out.println("Duzy: "+baza.pobierzDuzy().get(0));
		System.out.println("Multi: "+baza.pobierzMulti().get(0));


		
		
		System.out.print("\n \n-----------------Losowanie:----------------- \n \n");
		
		MaszynaDuzyLotek duzy = new MaszynaDuzyLotek();
		duzy.losujIZapisz();
		System.out.println(duzy.zwrocWynikLosowania());
		
		MaszynaMalyLotek maly = new MaszynaMalyLotek();
		maly.losujIZapisz();
		System.out.println(maly.zwrocWynikLosowania());
		
		MaszynaMultiLotek multi = new MaszynaMultiLotek();
		multi.losujIZapisz();
		System.out.println(multi.zwrocWynikLosowania());
		

	}

}