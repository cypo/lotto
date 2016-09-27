package lotto.losowania;

import java.util.Arrays;


public class WynikiDuzegoLotka extends WynikiLosowania{
	
	//poprawic :)
	//private static int id;
	
	
	public WynikiDuzegoLotka(int[] wylosowaneLiczby){
		super(wylosowaneLiczby);
	}
		

	//string buffer +append
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Losowanie Duzego lotka: ");
		stringBuffer.append("ID: ");
		stringBuffer.append(getIdLosowania());
		stringBuffer.append(" Wyniki losowania: ");
		stringBuffer.append(Arrays.toString(zwrocWylosowaneLiczby()));
		stringBuffer.append(" Data losowania: ");
		stringBuffer.append(zwrocDateLosowania());
		
		return stringBuffer.toString();
	}
	



}