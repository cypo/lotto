package lotto.kupony;

import java.io.Serializable;

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

	public int getIdKuponu(){
		return idKuponu;
	}
	
	@Override
	public String toString(){
		return "---MALY LOTEK--- \n"+super.toString();
		
	}
}
