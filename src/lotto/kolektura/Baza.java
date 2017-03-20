package lotto.kolektura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lotto.Stale;
import lotto.kupony.Kupon;
import lotto.kupony.KuponDuzy;
import lotto.kupony.KuponMaly;
import lotto.kupony.KuponMulti;

public class Baza implements BazaInterfejs{
	
	
	private static Baza INSTANCE;
	
	//inicjowac przy parsowaniu
	private List<Kupon> listaMaly = null;
	private List<Kupon> listaDuzy = null;
	private List<Kupon> listaMulti = null;
    private PrintWriter zapis = null;
	private File file = new File("baza.txt");
    private Scanner in = null;
    private Kupon kupon = null;
    
    private enum typLosowania{
    	MALY, DUZY, MULTI
    }
    
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
	    zapis.flush();
	}
	
	@Override
	public List<Kupon> pobierzMaly() throws FileNotFoundException{
		odczytajKupony(typLosowania.MALY);
		return listaMaly;
	}
	@Override
	public List<Kupon> pobierzDuzy() throws FileNotFoundException{
		odczytajKupony(typLosowania.DUZY);
		return listaDuzy;
	}
	@Override
	public List<Kupon> pobierzMulti() throws FileNotFoundException{
		odczytajKupony(typLosowania.MULTI);
		return listaMulti;
	}
	
	private void odczytajKupony(typLosowania typ) throws FileNotFoundException {
		
		switch(typ){
        case MALY:
        	listaMaly = new ArrayList<Kupon>();
        	break;
        case DUZY:
        	listaDuzy = new ArrayList<Kupon>();
        	break;
        case MULTI:
        	listaMulti = new ArrayList<Kupon>();
        	break;
        default:
        	System.out.println("Podano nieprawid³owy argument: typ losowania");
        }
		
		in = new Scanner(file);
		int[][] tablica = null;
	    while (in.hasNextLine()) {
			String iloscZakladow = "0";
			String idKuponu = "0";
			String idKlienta = "0";
			String liczby = "";
	    	if(in.hasNext("---"+typ)){
	    		
	    		iloscZakladow = in.findInLine("(?<= Ilosc zakladów: )([0-9]+)");
	    		idKuponu = in.findInLine("(?<= ID kuponu: )([0-9]+)");
	    		idKlienta = in.findInLine("(?<= ID klienta: )([0-9]+)");
	    		liczby = in.findInLine("\\| \\[.*\\] \\|");
	    		
	    		Pattern pattern = Pattern.compile("(\\[.+?\\])");
	    	    Matcher matcher = pattern.matcher(liczby);
	    	    int x=0;
	    	        
	    	        switch(typ){
	    	        case MALY:
	    	        	tablica = new int[Integer.parseInt(iloscZakladow)][Stale.ILOSC_LOSOWANYCH_LICZB_ML];
	    	        	break;
	    	        case DUZY:
	    	        	tablica = new int[Integer.parseInt(iloscZakladow)][Stale.ILOSC_LOSOWANYCH_LICZB_DL];
	    	        	break;
	    	        case MULTI:
	    	        	tablica = new int[Integer.parseInt(iloscZakladow)][Stale.ILOSC_LOSOWANYCH_LICZB_MULTI];
	    	        	break;
	    	        default:
	    	        	System.out.println("Podano nieprawid³owy argument: typ losowania");
	    	        }
	    	        
	    	        while (matcher.find()) {
	    	        	int y=0;
	    	            String group = matcher.group();
	    	            group = group.substring(1, group.length()-1);
	    	         //   System.out.println(group);
	    	            Pattern pojeyncza = Pattern.compile("\\|([0-9]+?)\\|");
		    	        Matcher matchers = pojeyncza.matcher(group);
		    	        while(matchers.find()){
		    	        
		    	        	String groupPoj = matchers.group();
		    	        	groupPoj = groupPoj.substring(1, groupPoj.length()-1);
		    	        //	System.out.println(groupPoj);
		    	        	tablica[x][y]=Integer.parseInt(groupPoj);
		    	        	y++;
		    	        }
		    	        x++;

	    	        }
/*
	    	        for(int i=0; i<tablica.length; i++){
	    	        	for(int y=0; y<tablica[i].length; y++){
	    	        		System.out.println(tablica[i][y]);
	    	        	}
	    	        	System.out.println("---");
	    	        }
*/
	    	        int idKuponuInt = Integer.parseInt(idKuponu);
	    	    	int iloscZakladowInt = Integer.parseInt(iloscZakladow);
	    	    	int idKlientaInt = Integer.parseInt(idKlienta);

	    	    	
	    	    	//int albo enum + default
					switch(typ){
	    	        case MALY:
	    	        	kupon = new KuponMaly(idKuponuInt, iloscZakladowInt, tablica, idKlientaInt);
	    	        	listaMaly.add(kupon);
	    	        	break;
	    	        case DUZY:
	    	        	kupon = new KuponDuzy(idKuponuInt, iloscZakladowInt, tablica, idKlientaInt);
	    	        	listaDuzy.add(kupon);
	    	        	break;
	    	        
	    	        case MULTI:
	    	        	kupon = new KuponMulti(idKuponuInt, iloscZakladowInt, tablica, idKlientaInt);
	    	        	listaMulti.add(kupon);
	    	        	break;
	    	        	
	    	        default:
	    	        	System.out.println("Podano nieprawid³owy argument: typ losowania");
	    	        }

	    	}
	    	
	    	in.nextLine();
        }
	}
	
	
	
	
	
	
}
