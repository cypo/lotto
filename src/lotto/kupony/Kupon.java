package lotto.kupony;

public class Kupon {

	private static int id;
	protected int idKuponuOgolny;
	protected int iloscZakladow;
	protected int[][] skresloneZaklady;
	protected int idKlienta;
	protected int rodzajZakladu;
	
		
	public Kupon(){
		idKuponuOgolny = ++id;
	}
	
	public Kupon(int id, int iloscZakladow, int[][] skresloneZaklady, int idKlienta){
		this.idKuponuOgolny = id;
		this.iloscZakladow = iloscZakladow;
		this.skresloneZaklady = skresloneZaklady;
		this.idKlienta = idKlienta;
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
	
	@Override
	public String toString(){
		
		StringBuffer stringBuffer = new StringBuffer();

		stringBuffer.append("Ilosc zakladów: "+iloscZakladow);
		stringBuffer.append(" | ");
		stringBuffer.append("ID kuponu: "+getIdKuponuOgolny());
		stringBuffer.append(" | ");
		stringBuffer.append("ID klienta: "+idKlienta);
		stringBuffer.append(" | ");
		stringBuffer.append("Skreslone liczby: | ");
		for(int i=0; i<skresloneZaklady.length; i++){
			stringBuffer.append("[");
			for(int x=0; x<skresloneZaklady[i].length; x++){
				if(x!=skresloneZaklady[i].length-1){
					stringBuffer.append("|"+skresloneZaklady[i][x]+"|");
				}
				else{
					stringBuffer.append("|"+skresloneZaklady[i][x]+"|");
				}
			}
			stringBuffer.append("] | ");
		}
				
		return stringBuffer.toString();
		
	}
	
}
