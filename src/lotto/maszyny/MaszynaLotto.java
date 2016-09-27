package lotto.maszyny;

import java.util.Arrays;
import java.util.Random;

import lotto.losowania.WynikiDuzegoLotka;

public class MaszynaLotto {
	
	private int iloscLosowanychLiczb;
	private int iloscDostepnychLiczb;
	
	public MaszynaLotto(int iloscLosowanychLiczb, int iloscDostepnychLiczb){
		this.iloscLosowanychLiczb = iloscLosowanychLiczb;
		this.iloscDostepnychLiczb = iloscDostepnychLiczb;
	}
	
		
	protected int[] losuj(){
		int[] wylosowaneLiczby = new int[iloscLosowanychLiczb];
		Random losowanaLiczba = new Random();
		int liczba;
		
		for (int i=0; i<iloscLosowanychLiczb; i++){
			boolean powtorzona = false;
			liczba=losowanaLiczba.nextInt(iloscDostepnychLiczb)+1;
			
			for (int x=0; x<wylosowaneLiczby.length; x++){
				if (liczba==wylosowaneLiczby[x]){
					powtorzona=true;
				}
			}
			if(powtorzona==false){
				wylosowaneLiczby[i]=liczba;
			}
			else{
				i--;
			}
		}		
		
		Arrays.sort(wylosowaneLiczby);
		return wylosowaneLiczby;
	}
	
	
	
	
	
	
	
}