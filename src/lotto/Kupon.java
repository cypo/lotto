package lotto;

public class Kupon {

	private static int id;
	private int idKuponu;
	private int[][] skresloneZaklady;
	
	public Kupon(){
		idKuponu = ++id;
	}
	
	public void zapiszZaklady(int[][] kupon){
		skresloneZaklady = kupon;
	}
	
	
	public void zarejestrujKupon(){
		Kolektura kolektura = new Kolektura(skresloneZaklady);
		System.out.println("Zarejestrowano kupon nr: "+idKuponu);
		
	}
	
	
	//kupon - max. 10 zakladow
	//klient moze miec max 1 kupon
}
