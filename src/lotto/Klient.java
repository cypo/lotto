package lotto;

import java.util.Random;

public class Klient {

	private static int id;
	private int idKlienta;
	private Kupon kupon;
	private int iloscZakladow;
	private int rodzajZakladu;
	private Random random = new Random();
	
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
			iloscZakladow = random.nextInt(10)+1;
	}

	private void wybierzZaklad() {
		
		for (int i = 0; i < iloscZakladow; i++) {
			rodzajZakladu = random.nextInt(3)+1;
		}
	}
	
	@Override
	public String toString(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("KlientToString: ");
		stringBuffer.append("ID Klienta: "+idKlienta+" ");
		stringBuffer.append("ID Kuponu: "+kupon.getIdKuponu()+" ");
		stringBuffer.append("Iloœæ wybranych zak³adów: "+iloscZakladow+" ");
		stringBuffer.append("Rodzaj zak³adu: "+rodzajZakladu);
		return stringBuffer.toString();
		
	}
	
}
