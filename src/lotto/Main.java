package lotto;

import java.io.IOException;
import lotto.kolektura.Kolektura;
import lotto.maszyny.MaszynaDuzyLotek;
import lotto.maszyny.MaszynaMalyLotek;
import lotto.maszyny.MaszynaMultiLotek;

public class Main{
	
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		

		
		int liczbaKlientow = 5;
		Klient[] klienci = new Klient[liczbaKlientow];
		Klient klient = null;
		
		Kolektura kolektura = new Kolektura();
		
		
		for(int i=0; i<liczbaKlientow; i++){
			klient = new Klient();
			klient.setKupon(kolektura.skreslChybilTrafil(klient.getKupon()));
			System.out.println(klient.getKupon().toString());
			klienci[i] = klient; 
			if(i==liczbaKlientow-1){
				kolektura.zakonczZapis();
			}
		}
		
		
		
		System.out.println("ODCZYT Z PLIKU:");
		kolektura.odczyt();
		System.out.println("GET");
		System.out.println(kolektura.getKuponMaly(1).toString());
		
		
		


	//	Scanner odczyt = new Scanner(System.in);
	//	System.out.println("Podaj numer klienta");
	//	int numer = odczyt.nextInt();
	//	odczyt.close();
		
		//System.out.println("ToString obiektu klasy Klient:");
		//System.out.println(klienci[numer-1].toString());
		
		
		//System.out.println("ToString obiektu klasy Kupon:");
		//System.out.println(klienci[numer-1].getKupon().toString());
		
		//System.out.println("ToString obiektu klasy Kupon (odczytane z klienta):");
		//System.out.println(kolektura.getKupon(34).toString());


		
		
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