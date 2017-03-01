package lotto.kupony;



public class KuponDuzy extends Kupon {
	private static int id;
	private int idKuponu;
	public String rodzajKuponu = "DUZY";

	
	public KuponDuzy(int iloscZakladow, int idKlienta) {
		super();
		idKuponu = ++id;
		super.iloscZakladow = iloscZakladow;
		super.idKlienta = idKlienta;
		super.rodzajZakladu = 1;
	}
	public KuponDuzy(int id, int iloscZakladow, int[][] skresloneZaklady, int idKlienta){
		this.idKuponuOgolny = id;
		this.iloscZakladow = iloscZakladow;
		this.skresloneZaklady = skresloneZaklady;
		this.idKlienta = idKlienta;
	}

	public int getIdKuponu(){
		return idKuponu;
	}
	
	@Override
	public String toString(){
		return "---DUZY LOTEK--- "+super.toString();
		
	}
	
}
