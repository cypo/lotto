package lotto;

import java.util.Arrays;
import java.util.Random;


public class Kolektura {

	private Kupon kupon;

	public Kolektura(){
		
	}
	public Kolektura(int iloscKlientow){
	//	przyjmijKlientow(iloscKlientow);
	}
	public Kolektura(Kupon kupon){
		this.kupon = kupon;
	}

	public void skreslChybilTrafil(Kupon kupon){
		this.kupon = kupon;
		int[][] chybilTrafil = skreslLiczby(kupon.getIloscZakladow(), kupon.getRodzajZakladu());
		kupon.setSkresloneZaklady(chybilTrafil);
		
		//return chybilTrafil;
	}
	
	private int[][] skreslLiczby(int iloscZakladow, int rodzajZakladu) {
		// random
		
		int iloscLosowanychLiczb = 0;
		int iloscDostepnychLiczb = 0;
		int[][] skresloneLiczby = new int[iloscZakladow][];
	//	System.out.print("Wybrany rodzaj gry: ");
		
//DL
			if (rodzajZakladu == 1) {
	//			System.out.print("Du�y Lotek");
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_DL;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_DL;
//ML
			} else if (rodzajZakladu == 2) {
		//		System.out.print("Ma�y Lotek");
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_ML;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_ML;
//MM
			} else if (rodzajZakladu == 3) {
	//			System.out.print("Multi Lotek");
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_MULTI;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_MULTI;
			} else {
				System.out.print(rodzajZakladu + ", ");
				System.out.println("nieprawid�owy rodzaj zak�adu");
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
	//	System.out.println();


		for (int z = 0; z < skresloneLiczby.length; z++) {
	//		System.out.print(z+1 + ": ");
			for (int a = 0; a < skresloneLiczby[z].length; a++) {
			//	System.out.print(skresloneLiczby[z][a] + ", ");
			}
	//		System.out.println();
		}
		return skresloneLiczby;
	}

	
	

	
}
