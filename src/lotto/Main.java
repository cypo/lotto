package lotto;



import lotto.maszyny.MaszynaDuzyLotek;
import lotto.maszyny.MaszynaMalyLotek;
import lotto.maszyny.MaszynaMultiLotek;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		MaszynaDuzyLotek duzy = new MaszynaDuzyLotek();
		MaszynaDuzyLotek duzy2 = new MaszynaDuzyLotek();
		duzy.losujIZapisz();
		duzy2.losujIZapisz();
		System.out.println(duzy.zwrocWynikLosowania());
		System.out.println(duzy2.zwrocWynikLosowania());
		
		
		MaszynaMalyLotek maly = new MaszynaMalyLotek();
		maly.losujIZapisz();
		System.out.println(maly.zwrocWynikLosowania());
		
		MaszynaMultiLotek multi = new MaszynaMultiLotek();
		multi.losujIZapisz();
		System.out.println(multi.zwrocWynikLosowania());
		

	}

}