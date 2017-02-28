package lotto.kolektura;

import java.io.FileNotFoundException;
import java.util.List;

import lotto.kupony.Kupon;

interface BazaInterfejs{

		//ma zwracac liste kuponow (objektow kupon)
	public List<Kupon> pobierzMaly() throws FileNotFoundException;
	public List<Kupon> pobierzDuzy() throws FileNotFoundException;
	public List<Kupon> pobierzMulti() throws FileNotFoundException;
	
	//ma przyjmowac kupon
	public void zapisz(Kupon kupon)throws FileNotFoundException;
	
	

}
