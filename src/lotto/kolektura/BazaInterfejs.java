package lotto.kolektura;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;

import lotto.kupony.Kupon;

interface BazaInterfejs{

	public void pobierz(int numerKuponu) throws FileNotFoundException;
	public void zapisz(String kupon)throws FileNotFoundException;
	
	

}
