package Zadaci;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Scanner unos = new Scanner (System.in);
		
		System.out.println("unesite imee fajla: ");
		String  imeFajla = "kolekcije";
		
		
	}
	
	public static void ispisiSveRijeci () throws IOException {
		
		ArrayList<String> lista = new ArrayList<String>();
		FileReader citacFajl = new FileReader("kolekcije.txt");
		BufferedReader citac = new BufferedReader(citacFajl);

		while (citac.readLine() != null) {
			
			String rijeci = citac.readLine();
			lista.add(rijeci);
		}
		
		for (String e : lista) {
			
			System.out.println(e + " ");
		}
	}

}
