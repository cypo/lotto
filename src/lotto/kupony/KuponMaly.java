package lotto.kupony;



public class KuponMaly extends Kupon {
	private static int id;
	private int idKuponu;

	
	public KuponMaly(int iloscZakladow, int idKlienta) {
		super();
		idKuponu = ++id;
		super.iloscZakladow = iloscZakladow;
		super.idKlienta = idKlienta;
		super.rodzajZakladu = 2;
	}
	public KuponMaly(int id, int iloscZakladow, int[][] skresloneZaklady, int idKlienta){
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
		return "---MALY LOTEK--- "+super.toString();
		
	}
}
