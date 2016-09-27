package lotto.maszyny;

import lotto.losowania.WynikiDuzegoLotka;
import lotto.Stale;

public class MaszynaDuzyLotek extends MaszynaLotto{

	
	private WynikiDuzegoLotka wynikLosowania;

	
	public MaszynaDuzyLotek() {
		super(Stale.ILOSC_LOSOWANYCH_LICZB_DL, Stale.ILOSC_DOSTEPNYCH_LICZB_DL);
	}

	
	public void losujIZapisz(){
		wynikLosowania = new WynikiDuzegoLotka(losuj());
	}
	
	public WynikiDuzegoLotka zwrocWynikLosowania(){
		return wynikLosowania;
	}

}