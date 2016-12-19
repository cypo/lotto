package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class Kolektura {

	List<Kupon> zarejestrowaneKupony = new ArrayList<Kupon>();



	public Kupon skreslChybilTrafil(Kupon kupon){
		int[][] chybilTrafil = skreslLiczby(kupon.getIloscZakladow(), kupon.getRodzajZakladu());
		kupon.setSkresloneZaklady(chybilTrafil);
		zarejestrowaneKupony.add(kupon);
		
		return kupon;
	}
	
	public Kupon getKupon(int id){
		return zarejestrowaneKupony.get(id-1);
	}
	private int[][] skreslLiczby(int iloscZakladow, int rodzajZakladu) {

		
		int iloscLosowanychLiczb = 0;
		int iloscDostepnychLiczb = 0;
		int[][] skresloneLiczby = new int[iloscZakladow][];
		
//DL
			if (rodzajZakladu == 1) {
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_DL;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_DL;
//ML
			} else if (rodzajZakladu == 2) {
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_ML;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_ML;
//MM
			} else if (rodzajZakladu == 3) {
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_MULTI;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_MULTI;
			} else {
				System.out.print(rodzajZakladu + ", ");
				System.out.println("nieprawidlowy rodzaj zakladu");
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
