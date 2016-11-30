package lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Klient {

	private static int id;
	private int idKlienta;
	private int iloscZakladow;
	private String[] rodzajZakladow;
	private Scanner odczyt = new Scanner(System.in);
	private int liczbaKuponow = 0;
	boolean ilosc = false;

	public Klient() {
		wybierzIloscZakladow();
		wybierzZaklady();
		idKlienta = ++id;
	}

	private void wybierzIloscZakladow() {
		// ilosc zakladow

		while (!ilosc) {
			System.out.println("Podaj ilosc zakladow");
			iloscZakladow = odczyt.nextInt();
			ilosc = iloscZakladow > 10 ? false : true;
			if (iloscZakladow > 10) {
				System.out.println("Mo¿esz wybraæ max 10 zak³adów");
			}
		}

	}

	private void wybierzZaklady() {
		rodzajZakladow = new String[iloscZakladow];

		for (int i = 0; i < iloscZakladow; i++) {
			System.out.println(
					"Podaj typ zak³adu nr " + (i + 1) + " - DL - duzy lotek, ML - maly lotek, MM - multi lotek");
			rodzajZakladow[i] = odczyt.next();
		}

	}

	private int[][] skreslLiczby() {
		// random
		int iloscLosowanychLiczb = 0;
		int iloscDostepnychLiczb = 0;
		int[][] skresloneLiczby = new int[iloscZakladow][];
		System.out.print("Wybrane zak³ady: ");
		for (int i = 0; i < iloscZakladow; i++) {

			if (rodzajZakladow[i].equals("DL")) {
				System.out.print(rodzajZakladow[i] + ", ");
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_DL;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_DL;
			} else if (rodzajZakladow[i].equals("ML")) {
				System.out.print(rodzajZakladow[i] + ", ");
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_ML;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_ML;
			} else if (rodzajZakladow[i].equals("MM")) {
				System.out.print(rodzajZakladow[i] + ", ");
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_MULTI;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_MULTI;
			} else {
				System.out.print(rodzajZakladow[i] + ", ");
				System.out.println("nieprawid³owy rodzaj zak³adu");
			}

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
		System.out.println("Klient nr: " + idKlienta);
		System.out.println("Skreslone liczby:");
		for (int z = 0; z < skresloneLiczby.length; z++) {
			System.out.print(rodzajZakladow[z] + ": ");
			for (int a = 0; a < skresloneLiczby[z].length; a++) {
				System.out.print(skresloneLiczby[z][a] + ", ");
			}
			System.out.println();
		}
		return skresloneLiczby;
	}

	public void zarejestrujKupon() {
		if (liczbaKuponow < 1) {
			Kupon kupon = new Kupon();
			kupon.zapiszZaklady(skreslLiczby());
			kupon.zarejestrujKupon();
			liczbaKuponow++;
		} else {
			System.out.println("Limit kuponów wykorzystany!");
		}
	}

}
