package lotto.losowania;

import java.util.Date;

public class WynikiLosowania {


	private int[] wylosowaneLiczby;
	private Date dataLosowania;
	private int idLosowania;
	private static int id = 1;

	
	public WynikiLosowania(int[] wylosowaneLiczby){
		this.wylosowaneLiczby = wylosowaneLiczby;
		dataLosowania = new Date();
		idLosowania = id++;
		
	}
	
	public Date zwrocDateLosowania(){
		return dataLosowania;
	}
	public int[] zwrocWylosowaneLiczby(){
		return wylosowaneLiczby;
	}
	
	public int getIdLosowania(){
		return idLosowania;
	}

	
	
}