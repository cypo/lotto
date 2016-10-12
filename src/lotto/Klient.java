package lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Klient {

	public Klient(){
		wybierzIloscZakladow();
		wybierzZaklady();
	}
	
	private static int id;
	private int iloscZakladow=8;
	private String[] rodzajZakladow;
	private Scanner odczyt = new Scanner(System.in);
	
		
	private void wybierzIloscZakladow(){
		//ilosc zakladow
		System.out.println("Podaj ilosc zakladow");
		iloscZakladow = odczyt.nextInt();
	}
	
	private void wybierzZaklady(){
		rodzajZakladow = new String[iloscZakladow];
		
		for(int i=0; i<iloscZakladow; i++){
			System.out.println("Podaj typ zak³adu nr "+(i+1));
			rodzajZakladow[i]=odczyt.next();
		}

	}
	public int[][] skreslLiczby(){
		//random
		int iloscLosowanychLiczb = 0;
		int iloscDostepnychLiczb = 0;
		int[][] skresloneLiczby = new int[iloscZakladow][];
		
		for(int i=0; i<iloscZakladow; i++){
			
			if(rodzajZakladow[i].equals("DL")){
				//zmienic na sta³e
				System.out.println("1  "+rodzajZakladow[i]);
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_DL;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_DL;
			}
			else if(rodzajZakladow[i].equals("ML")){
				System.out.println("2   "+rodzajZakladow[i]);
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_ML;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_ML;
			}
			else if(rodzajZakladow[i].equals("MM")){
				System.out.println("3   "+rodzajZakladow[i]);
				iloscLosowanychLiczb = Stale.ILOSC_LOSOWANYCH_LICZB_MULTI;
				iloscDostepnychLiczb = Stale.ILOSC_DOSTEPNYCH_LICZB_MULTI;
			}
			else{
				System.out.println("4   "+rodzajZakladow[i]);
				System.out.println("nieprawid³owy rodzaj zak³adu");
			}
						
			int[] wylosowaneLiczby = new int[iloscLosowanychLiczb];
			Random losowanaLiczba = new Random();
			int liczba;
			
			for (int j=0; j<iloscLosowanychLiczb; j++){
				boolean powtorzona = false;
				liczba=losowanaLiczba.nextInt(iloscDostepnychLiczb)+1;
				
				for (int x=0; x<wylosowaneLiczby.length; x++){
					if (liczba==wylosowaneLiczby[x]){
						powtorzona=true;
					}
				}
				if(powtorzona==false){
					wylosowaneLiczby[j]=liczba;
				}
				else{
					j--;
				}
			}	
			Arrays.sort(wylosowaneLiczby);
			skresloneLiczby[i]=wylosowaneLiczby;
		}
		//Arrays.sort(skresloneLiczby);
		
		for(int z=0;z<skresloneLiczby.length; z++){
			for(int a=0; a<skresloneLiczby[z].length; a++){
				System.out.print(skresloneLiczby[z][a]+", ");
			}
			System.out.println();
		}		
		return skresloneLiczby;
	}
	
	private void zarejestrujKupon(){
		Kupon kupon = new Kupon();
		kupon.zarejestruj(skreslLiczby());
	}

}
