package lotto;

public class Klient {

	private static int id;
	private int iloscZakladow=8;
	int[] rodzajZakladow;
	
	private void wybierzIloscZakladow(){
		//ilosc zakladow
		iloscZakladow = 8;
	}
	
	private void wybierzZaklady(){
	
		
		rodzajZakladow = new int[iloscZakladow];
		
		for(int i=0; i>iloscZakladow; i++){
			//dopisac wypelnianie  /DL,ML,MM
			rodzajZakladow[i]=0;
		}
	}
	private void skreslLiczby(){
		//random
		
	}
	
}
