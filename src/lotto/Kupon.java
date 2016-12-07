package lotto;

public class Kupon {

	private static int id;
	private int idKuponu;
	private int idKlienta;
	private int[][] skresloneZaklady;
	private int iloscZakladow;
	private int rodzajZakladu;
	boolean ilosc = false;
	private String rodzajZakladuTekst = "";
		
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
		
		switch (rodzajZakladu) {
		  case 1:
		    rodzajZakladuTekst = "Duzy Lotek";
		    break;
		  case 2:
			  rodzajZakladuTekst = "Maly Lotek";
			  break;
		  case 3:
			  rodzajZakladuTekst = "Multi Lotek";
			  break;
		}
		
		stringBuffer.append("Rodzaj zakladu: "+rodzajZakladuTekst);
		stringBuffer.append(" | ");
		stringBuffer.append("Ilosc zakladów: "+iloscZakladow);
		stringBuffer.append(" | ");
		stringBuffer.append("ID kuponu: "+idKuponu);
		stringBuffer.append(" | ");
		stringBuffer.append("ID klienta: "+idKlienta);
		stringBuffer.append(" | ");
		stringBuffer.append("Skreslone liczby: ");
		for(int i=0; i<skresloneZaklady.length; i++){
			stringBuffer.append("[");
			for(int x=0; x<skresloneZaklady[i].length; x++){
				if(x!=skresloneZaklady[i].length-1){
					stringBuffer.append(skresloneZaklady[i][x]+", ");
				}
				else{
					stringBuffer.append(skresloneZaklady[i][x]);
				}
			}
			stringBuffer.append("]");
		}
				
		return stringBuffer.toString();
		
	}
	
}
