package lotto;

public class KuponMaly extends Kupon{
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
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("KuponToString: ");
		
		
		stringBuffer.append("Rodzaj zakladu: Maly Lotek");
		stringBuffer.append(" | ");
		stringBuffer.append("Ilosc zakladów: "+iloscZakladow);
		stringBuffer.append(" | ");
		stringBuffer.append("ID kuponu: "+getIdKuponuOgolny());
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
