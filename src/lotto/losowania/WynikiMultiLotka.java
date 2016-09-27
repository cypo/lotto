package lotto.losowania;

import java.util.Arrays;

public class WynikiMultiLotka extends WynikiLosowania{
	
	private static int id;
	
	public WynikiMultiLotka(int[] wylosowaneLiczby){
		super(wylosowaneLiczby);
		id++;
	}
		
	
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Losowanie Multi lotka: ");
		stringBuffer.append("ID: ");
		stringBuffer.append(id);
		stringBuffer.append(" Wyniki losowania: ");
		stringBuffer.append(Arrays.toString(zwrocWylosowaneLiczby()));
		stringBuffer.append(" Data losowania: ");
		stringBuffer.append(zwrocDateLosowania());
		
		return stringBuffer.toString();
	}

}
