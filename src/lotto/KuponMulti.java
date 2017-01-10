package lotto;

public class KuponMulti extends Kupon{
	private static int id;
	private int idKuponu;

	
	public KuponMulti(int iloscZakladow, int idKlienta) {
		super();
		idKuponu = ++id;
		super.iloscZakladow = iloscZakladow;
		super.idKlienta = idKlienta;
		super.rodzajZakladu = 3;
	}
		
	public int getIdKuponu(){
		return idKuponu;
	}
	
	@Override
	public String toString(){
		return "MULTI LOTEK "+super.toString();
		
	}
}
