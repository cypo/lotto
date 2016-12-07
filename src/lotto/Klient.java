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
			//stala - co to jest 3? 
			rodzajZakladu = random.nextInt(3)+1;
		}
	}
	
	@Override
	public String toString(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("KlientToString: ");
		stringBuffer.append("ID Klienta: "+idKlienta+" ");
		stringBuffer.append("ID Kuponu: "+kupon.getIdKuponu()+" ");
		stringBuffer.append("Ilosc wybranych zakladów: "+iloscZakladow+" ");
		stringBuffer.append("Rodzaj zakladu: "+rodzajZakladu);
		return stringBuffer.toString();
		
	}
	
}
