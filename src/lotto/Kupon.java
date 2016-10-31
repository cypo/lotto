package lotto;

public class Kupon {

	private static int id;
	private int[][] skresloneZaklady;
	
	public void zapiszZaklady(int[][] kupon){
		skresloneZaklady = kupon;
	}
	
	
	public void zarejestrujKupon(){
		Kolektura kolektura = new Kolektura(skresloneZaklady);
		
	}
	
	
	//kupon - max. 10 zakladow
	//klient moze miec max 1 kupon
}
