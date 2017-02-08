package lotto.kolektura;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import lotto.kupony.Kupon;

class Baza implements BazaInterfejs{
	
	
	private static Baza INSTANCE;
    private List<Kupon> test = null; 
    private String plik="data//baza_danych.bin";
	 
    private Baza(){

    }
 
    public static Baza getInstance(){
        if(INSTANCE==null)
            INSTANCE = new Baza();
        return INSTANCE;
    }
		
	
	
	@Override
	public void zapisz(List<Kupon> kupon) throws IOException {
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(plik));
		output.writeObject(kupon);
		output.flush();
		output.close();
	}
		
	

	@Override
	public List<Kupon> pobierzListe(ObjectInputStream input) throws IOException, ClassNotFoundException {
		test = (List<Kupon>)input.readObject();
		return test;
	}

}
