package lotto.kupony;



public class KuponMulti extends Kupon {
	private static int id;
	private int idKuponu;

	
	public KuponMulti(int iloscZakladow, int idKlienta) {
		super();
		idKuponu = ++id;
		super.iloscZakladow = iloscZakladow;
		super.idKlienta = idKlienta;
		super.rodzajZakladu = 3;
	}
	public KuponMulti(int id, int iloscZakladow, int[][] skresloneZaklady, int idKlienta){
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
		return "---MULTI LOTEK--- "+super.toString();
		
	}
}
