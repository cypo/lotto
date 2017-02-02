package lotto.kolektura;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lotto.kupony.Kupon;

interface BazaDanych{

	public void pobierz(String rodzajGry);
	public void zapisz(Kupon kupon, ObjectOutputStream output)throws FileNotFoundException, IOException;
	
	
	
}
