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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lotto.kupony.Kupon;
import lotto.kupony.KuponMaly;

class Baza implements BazaInterfejs{
	
	
	private static Baza INSTANCE;
    private List<String> lista = new ArrayList<String>();
    PrintWriter zapis = null;
	File file = new File("baza.txt");
    Scanner in = new Scanner(file);
	 
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
	public void zapisz(Kupon kupon) throws FileNotFoundException {
	    zapis.println(kupon.toString());
	}
	
	public void zamknijPlik(){
		zapis.close();
	}
	
	
	@Override
	public List<Kupon> pobierzMaly() throws FileNotFoundException {
		List<Kupon> listaMaly = new ArrayList<Kupon>();

		int[][] tablica = null;
	    while (in.hasNextLine()) {
			String iloscZakladow = "0";
			String idKuponu = "0";
			String idKlienta = "0";
			String liczby;
	    	if(in.hasNext("---MALY")){
	    		System.out.println("Maly");
	    		iloscZakladow = in.findInLine("(?<= Ilosc zakladów: )([0-9]+)");
	    		System.out.println("ilosc zakladow: "+iloscZakladow);
	    		idKuponu = in.findInLine("(?<= ID kuponu: )([0-9]+)");
	    		System.out.println("id kuponu: "+idKuponu);
	    		idKlienta = in.findInLine("(?<= ID klienta: )([0-9]+)");
	    		System.out.println("id klienta: "+idKlienta);
	    		liczby = in.findInLine("\\| \\[.*\\] \\|");
	    		System.out.println(liczby);
	    		
	    		 	Pattern pattern = Pattern.compile("(\\[.+?\\])");
	    	        Matcher matcher = pattern.matcher(liczby);
	    	        int x=0;
	    	        
	    	        tablica = new int[Integer.parseInt(iloscZakladow)][5];
	    	        while (matcher.find()) {
	    	        	int y=0;
	    	            String group = matcher.group();
	    	            group = group.substring(1, group.length()-1);
	    	            System.out.println(group);
	    	            Pattern pojeyncza = Pattern.compile("\\|([0-9]+?)\\|");
		    	        Matcher matchers = pojeyncza.matcher(group);
		    	        while(matchers.find()){
		    	        
		    	        	String groupPoj = matchers.group();
		    	        	groupPoj = groupPoj.substring(1, groupPoj.length()-1);
		    	        	System.out.println(groupPoj);
		    	        	tablica[x][y]=Integer.parseInt(groupPoj);
		    	        	y++;
		    	        }
		    	        x++;

	    	        }

	    	        System.out.println("QQQQQQQQQ");
	    	        for(int i=0; i<tablica.length; i++){
	    	        	for(int y=0; y<tablica[i].length; y++){
	    	        		System.out.println(tablica[i][y]);
	    	        	}
	    	        	System.out.println("---");
	    	        }
	    	        int idKuponuInt = Integer.parseInt(idKuponu);
	    	    	int iloscZakladowInt = Integer.parseInt(iloscZakladow);
	    	    	int idKlientaInt = Integer.parseInt(idKlienta);

	    	    	Kupon kupon = new Kupon(idKuponuInt, iloscZakladowInt, tablica, idKlientaInt);
	    	    	listaMaly.add(kupon);
	    	    	
	    

	    	}
	    	
	    	in.nextLine();
        }
        in.close();
        
        return listaMaly;
	}
	

	@Override
	public List<Kupon> pobierzDuzy() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Kupon> pobierzMulti() throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
}
