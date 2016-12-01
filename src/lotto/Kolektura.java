package lotto;

import java.util.Arrays;
import java.util.Random;


public class Kolektura {

	private int[][] kupon;

	
	public Kolektura(int iloscKlientow){
		przyjmijKlientow(iloscKlientow);
	}
	public Kolektura(int[][] kupon){
		this.kupon = kupon;
	}

	private void przyjmijKlientow(int iloscKlientow){
		
		for (int i=0; i<iloscKlientow; i++){
			
			Kupon kupon = new Kupon();
			int iloscZakladow = kupon.getIloscZakladow();
			int rodzajZakladow = kupon.getRodzajZakladu();
			kupon.setSkresloneZaklady(skreslLiczby(iloscZakladow, rodzajZakladow));
			new Klient(kupon);	
		}	
	}
	
	

	
	private int[][] skreslLiczby(int iloscZakladow, int rodzajZakladu) {
		// random
		
		int iloscLosowanychLiczb = 0;
		int iloscDostepnychLiczb = 0;
		int[][] skresloneLiczby = new int[iloscZakladow][];
		System.out.print("Wybrany rodzaj gry: ");
		
//DL
			if (rodzajZakladu == 1) {
				System.out.print("Du¿y Lotek");
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_DL;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_DL;
//ML
			} else if (rodzajZakladu == 2) {
				System.out.print("Ma³y Lotek");
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_ML;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_ML;
//MM
			} else if (rodzajZakladu == 3) {
				System.out.print("Multi Lotek");
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_MULTI;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_MULTI;
			} else {
				System.out.print(rodzajZakladu + ", ");
				System.out.println("nieprawid³owy rodzaj zak³adu");
			}
			
		for (int i = 0; i < iloscZakladow; i++) {
			int[] wylosowaneLiczby = new int[iloscLosowanychLiczb];
			Random losowanaLiczba = new Random();
			int liczba;

			for (int j = 0; j < iloscLosowanychLiczb; j++) {
				boolean powtorzona = false;
				liczba = losowanaLiczba.nextInt(iloscDostepnychLiczb) + 1;

				for (int x = 0; x < wylosowaneLiczby.length; x++) {
					if (liczba == wylosowaneLiczby[x]) {
						powtorzona = true;
					}
				}
				if (powtorzona == false) {
					wylosowaneLiczby[j] = liczba;
				} else {
					j--;
				}
			}
			Arrays.sort(wylosowaneLiczby);
			skresloneLiczby[i] = wylosowaneLiczby;
		}
		// Arrays.sort(skresloneLiczby);
		System.out.println();
		//System.out.println("Klient nr: " + idKlienta);
	//	System.out.println("Skreslone liczby:");
		for (int z = 0; z < skresloneLiczby.length; z++) {
			System.out.print(z+1 + ": ");
			for (int a = 0; a < skresloneLiczby[z].length; a++) {
				System.out.print(skresloneLiczby[z][a] + ", ");
			}
			System.out.println();
		}
		return skresloneLiczby;
	}

	public void zarejestrujKupon(){
		/////////////////////
	}
	
}
