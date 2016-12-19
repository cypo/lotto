package lotto;

import java.util.Random;

public class Klient {

	private static int id;
	private int idKlienta;
	private Kupon kupon;
	private int iloscZakladow;
	private int rodzajZakladu;
	private Random random = new Random();
	private String rodzajZakladuTekst = "";
	
	public Klient(){
		idKlienta = ++id;
		wybierzIloscZakladow();
		wybierzZaklad();

		if(rodzajZakladu == 1){
			kupon = new KuponDuzy(iloscZakladow, idKlienta);
		}
		else if(rodzajZakladu == 2){
			kupon = new KuponMaly(iloscZakladow, idKlienta);
		}
		else if(rodzajZakladu == 3){
			kupon = new KuponMulti(iloscZakladow, idKlienta);
		}
		
	}
	
	public Kupon getKupon(){
		return kupon;
	}
	//debug
	public int getRodzajZakladu(){
		return rodzajZakladu;
	}
	
	public void setKupon(Kupon kupon){
		this.kupon = kupon;
	}

	private void wybierzIloscZakladow() {
			iloscZakladow = random.nextInt(Stale.MAX_ILOSC_ZAKLADOW)+1;
	}

	private void wybierzZaklad() {
		
		for (int i = 0; i < iloscZakladow; i++) {
			rodzajZakladu = random.nextInt(Stale.ILOSC_DOSTEPNYCH_GIER)+1;
		}
	}
	
	@Override
	public String toString(){
		switch (rodzajZakladu) {
		  case 1:
		    rodzajZakladuTekst = "Duzy Lotek";
		    break;
		  case 2:
			  rodzajZakladuTekst = "Maly Lotek";
			  break;
		  case 3:
			  rodzajZakladuTekst = "Multi Lotek";
			  break;
		}
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("KlientToString: ");
		stringBuffer.append("ID Klienta: "+idKlienta);
		stringBuffer.append(" | ");
		stringBuffer.append("ID Kuponu: "+kupon.getIdKuponuOgolny());
		stringBuffer.append(" | ");
		stringBuffer.append("Ilosc wybranych zakladów: "+iloscZakladow);
		stringBuffer.append(" | ");
		stringBuffer.append("Rodzaj zakladu: "+rodzajZakladuTekst);
		int[][] skresloneZaklady = kupon.getSkresloneZaklady();
		stringBuffer.append(" | ");
		stringBuffer.append("Skreslone liczby: ");
		for(int i=0; i<skresloneZaklady.length; i++){
			stringBuffer.append("[");
			for(int x=0; x<skresloneZaklady[i].length; x++){
				if(x!=skresloneZaklady[i].length-1){
					stringBuffer.append(skresloneZaklady[i][x]+", ");
				}
				else{
					stringBuffer.append(skresloneZaklady[i][x]);
				}
			}
			stringBuffer.append("]");
		}
		
		return stringBuffer.toString();
		
	}
	
}
