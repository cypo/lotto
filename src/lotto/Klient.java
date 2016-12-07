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
		kupon = new Kupon(iloscZakladow, rodzajZakladu, idKlienta);
	}
	
	public Kupon getKupon(){
		return kupon;
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
		  case 2:
			  rodzajZakladuTekst = "Maly Lotek";
		  case 3:
			  rodzajZakladuTekst = "Multi Lotek";
		}
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("KlientToString: ");
		stringBuffer.append("ID Klienta: "+idKlienta);
		stringBuffer.append(" | ");
		stringBuffer.append("ID Kuponu: "+kupon.getIdKuponu());
		stringBuffer.append(" | ");
		stringBuffer.append("Ilosc wybranych zakladów: "+iloscZakladow);
		stringBuffer.append(" | ");
		stringBuffer.append("Rodzaj zakladu: "+rodzajZakladuTekst);
		return stringBuffer.toString();
		
	}
	
}
