package lotto.kolektura;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import lotto.kupony.Kupon;

interface BazaInterfejs{

	public List<Kupon> pobierzListe(ObjectInputStream input) throws IOException, ClassNotFoundException;
	public void zapisz(List<Kupon> kupon)throws IOException;
	
	
	
}
