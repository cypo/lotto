package lotto.maszyny;

import lotto.Stale;
import lotto.losowania.WynikiDuzegoLotka;
import lotto.losowania.WynikiMalegoLotka;

public class MaszynaMalyLotek extends MaszynaLotto{

	
	private WynikiMalegoLotka wynikLosowania;
	
	public MaszynaMalyLotek() {
		super(Stale.ILOSC_LOSOWANYCH_LICZB_ML, Stale.ILOSC_DOSTEPNYCH_LICZB_ML);
	}
	
	public void losujIZapisz(){
		wynikLosowania = new WynikiMalegoLotka(super.losuj());
		
	}
	public WynikiMalegoLotka zwrocWynikLosowania(){
		return wynikLosowania;
	}

}