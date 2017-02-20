package lotto.kolektura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import lotto.kupony.Kupon;

class Baza implements BazaInterfejs{
	
	
	private static Baza INSTANCE;
    private List<String> lista = new ArrayList<String>();
    PrintWriter zapis = null;
	 
    private Baza() throws FileNotFoundException{
    	zapis = new PrintWriter("baza.txt");
    }
 
    public static Baza getInstance() throws FileNotFoundException{
        if(INSTANCE==null){
        	INSTANCE = new Baza();
        }
        return INSTANCE;
    }

	@Override
	public void pobierz(int numerKuponu) throws FileNotFoundException {
		File file = new File("baza.txt");
	    Scanner in = new Scanner(file);

	    while (in.hasNextLine()) {
	    	lista.add(in.nextLine());
        }
        in.close();
        
        System.out.println(lista.get(numerKuponu-1));
 
	}

	@Override
	public void zapisz(String kupon) throws FileNotFoundException {
	    zapis.println(kupon);
	}
	
	public void zamknijPlik(){
		zapis.close();
	}
	
	
	
	
	
	
	
	
}
