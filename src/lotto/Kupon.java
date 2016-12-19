package lotto;

public class Kupon {

	private static int id;
	private int idKuponuOgolny;
	protected int iloscZakladow;
	protected int[][] skresloneZaklady;
	protected int idKlienta;
	protected int rodzajZakladu;
	
		
	public Kupon(){
		idKuponuOgolny = ++id;
	}
	
	public int getIdKuponuOgolny(){
		return idKuponuOgolny;
	}
	
	public int getIloscZakladow(){
		return iloscZakladow;
	}

	public int getRodzajZakladu() {
		return rodzajZakladu;
	}
	
	public void setSkresloneZaklady(int[][] skresloneZaklady){
		this.skresloneZaklady = skresloneZaklady;
	}
	
	public int[][] getSkresloneZaklady(){
		return skresloneZaklady;
	}
	
	
	
}
