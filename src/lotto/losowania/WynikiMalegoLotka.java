package lotto.losowania;

import java.util.Arrays;

public class WynikiMalegoLotka extends WynikiLosowania{

	private static int id;
	
	
	public WynikiMalegoLotka(int[] wylosowaneLiczby){
		super(wylosowaneLiczby);
		id++;
	}
		
	@Override
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Losowanie Malego lotka: ");
		stringBuffer.append("ID: ");
		stringBuffer.append(id);
		stringBuffer.append(" Wyniki losowania: ");
		stringBuffer.append(Arrays.toString(zwrocWylosowaneLiczby()));
		stringBuffer.append(" Data losowania: ");
		stringBuffer.append(zwrocDateLosowania());
		
		return stringBuffer.toString();
	}

}
