package lotto.kolektura;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import lotto.kupony.Kupon;

class Zapis implements BazaDanych{


	
	@Override
	public void zapisz(Kupon kupon, ObjectOutputStream output) throws FileNotFoundException, IOException {
		output.writeObject(kupon);
		output.flush();
	}
		
	

	@Override
	public void pobierz(String rodzajGry) {
		// TODO Auto-generated method stub
		
	}

}
