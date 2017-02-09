package lotto.kupony;

import java.io.Serializable;

public class Kupon implements Serializable{

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
	
	@Override
	public String toString(){
		
		StringBuffer stringBuffer = new StringBuffer();
		//stringBuffer.append("KuponToString: ");
		
		
		//stringBuffer.append("Rodzaj zakladu:");
		//stringBuffer.append(" | ");
		stringBuffer.append("Ilosc zakladów: "+iloscZakladow);
		stringBuffer.append("\n");
		stringBuffer.append("ID kuponu: "+getIdKuponuOgolny());
		stringBuffer.append("\n");
		stringBuffer.append("ID klienta: "+idKlienta);
		stringBuffer.append("\n");
		stringBuffer.append("Skreslone liczby: \n");
		for(int i=0; i<skresloneZaklady.length; i++){
			stringBuffer.append(i+1+". ");
			stringBuffer.append("[");
			for(int x=0; x<skresloneZaklady[i].length; x++){
				if(x!=skresloneZaklady[i].length-1){
					stringBuffer.append(skresloneZaklady[i][x]+", ");
				}
				else{
					stringBuffer.append(skresloneZaklady[i][x]);
				}
			}
			stringBuffer.append("]\n");
		}
				
		return stringBuffer.toString();
		
	}
	
}
