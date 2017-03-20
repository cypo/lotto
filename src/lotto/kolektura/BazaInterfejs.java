package lotto.kolektura;

import java.io.FileNotFoundException;
import java.util.List;

import lotto.kupony.Kupon;

public interface BazaInterfejs{

	public List<Kupon> pobierzMaly() throws FileNotFoundException;
	public List<Kupon> pobierzDuzy() throws FileNotFoundException;
	public List<Kupon> pobierzMulti() throws FileNotFoundException;
	
	public void zapisz(Kupon kupon)throws FileNotFoundException;
	
	

}
