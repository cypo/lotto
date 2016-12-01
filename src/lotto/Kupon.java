package lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Kupon {

	private static int id;
	private int idKuponu;
	private int[][] skresloneZaklady;
	private int iloscZakladow;
	private int rodzajZakladu;
	private Scanner odczyt = new Scanner(System.in);
	private int liczbaKuponow = 0;
	boolean ilosc = false;
	private Random random = new Random();
	
	
	public Kupon(){
		idKuponu = ++id;
		wybierzIloscZakladow();
		wybierzZaklad();
	}

	
	private void wybierzIloscZakladow() {
			iloscZakladow = random.nextInt(10)+1;
	}

	private void wybierzZaklad() {
		
		for (int i = 0; i < iloscZakladow; i++) {
			rodzajZakladu = random.nextInt(3)+1;
		}
	}
	
	public int getIloscZakladow(){
		return iloscZakladow;
	}
	public int getRodzajZakladu(){
		return rodzajZakladu;
	}
	public void setSkresloneZaklady(int[][] skresloneZaklady){
		this.skresloneZaklady = skresloneZaklady;
	}
	
	@Override
	public String toString(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("toString: ");
		stringBuffer.append("Rodzaj zak³adu: "+rodzajZakladu+" ");
		stringBuffer.append("ID kuponu: "+idKuponu+" ");
		stringBuffer.append("Skreœlone liczby: ");
		for(int i=0; i<skresloneZaklady.length; i++){
			stringBuffer.append("[");
			for(int x=0; x<skresloneZaklady[i].length; x++){
				stringBuffer.append(skresloneZaklady[i][x]+", ");
			}
			stringBuffer.append("]");
		}
				
		return stringBuffer.toString();
		
	}

	
}
