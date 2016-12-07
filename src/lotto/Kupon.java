package lotto;

public class Kupon {

	private static int id;
	private int idKuponu;
	private int idKlienta;
	private int[][] skresloneZaklady;
	private int iloscZakladow;
	private int rodzajZakladu;
	boolean ilosc = false;
	
		
	public Kupon(int iloscZakladow, int rodzajZakladu, int idKlienta){
		idKuponu = ++id;
		this.iloscZakladow = iloscZakladow;
		this.rodzajZakladu = rodzajZakladu;
		this.idKlienta = idKlienta;
	}
	public int getIloscZakladow(){
		return iloscZakladow;
	}
	public int getRodzajZakladu(){
		return rodzajZakladu;
	}
	public int getIdKuponu(){
		return idKuponu;
	}
	
	public void setSkresloneZaklady(int[][] skresloneZaklady){
		this.skresloneZaklady = skresloneZaklady;
	}
	
	@Override
	public String toString(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("KuponToString: ");
		stringBuffer.append("Rodzaj zakladu: "+rodzajZakladu+" ");
		stringBuffer.append("Ilosc zakladów: "+iloscZakladow+" ");
		stringBuffer.append("ID kuponu: "+idKuponu+" ");
		stringBuffer.append("ID klienta: "+idKlienta+" ");
		stringBuffer.append("Skreslone liczby: ");
		for(int i=0; i<skresloneZaklady.length; i++){
			stringBuffer.append("[");
			for(int x=0; x<skresloneZaklady[i].length; x++){
				stringBuffer.append(skresloneZaklady[i][x]+", ");
			}
			stringBuffer.append("]");
		}
				
		return stringBuffer.toString();
		
	}
	
}
