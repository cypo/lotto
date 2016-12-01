package lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Klient {

	private static int id;
	private int idKlienta;
	private Kupon kupon;
	

	public Klient(Kupon kupon) {
		idKlienta = ++id;
		this.kupon = kupon;
		System.out.println(kupon.toString());
	}

}
