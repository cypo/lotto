package lotto.maszyny;

import lotto.Stale;
import lotto.losowania.WynikiDuzegoLotka;
import lotto.losowania.WynikiMultiLotka;

public class MaszynaMultiLotek extends MaszynaLotto{
		

	
	private WynikiMultiLotka wynikLosowania;
	
	public MaszynaMultiLotek() {
		super(Stale.ILOSC_LOSOWANYCH_LICZB_MULTI, Stale.ILOSC_DOSTEPNYCH_LICZB_MULTI);
	}
	
	public void losujIZapisz(){
		wynikLosowania = new WynikiMultiLotka(super.losuj());
	}
	
	public WynikiMultiLotka zwrocWynikLosowania(){
		return wynikLosowania;
	}

}