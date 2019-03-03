package Zadaci;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Zadatak1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);

		String nazivFajla = "";

		File fajl = new File("kolekcije.txt");
		FileReader provjeraFajla = new FileReader(fajl);

		while (!(provjeraFajla.equals(nazivFajla))) {

			System.out.println("unesite imee fajla: ");
			nazivFajla = unos.next();

			if (fajl.getName().equals(nazivFajla)) {
				break;
			} else {
				System.out.println("Pogresan unos fajla za citanje pokusajte ponovo: ");
			}

		}

		int opcija = 1;

		while (opcija != 0) {

			System.out.println(
					"\nUnesite opciju:\n1.Ispis svi rijeci iz fajla:\n2.Ispis unikatnih rijeci iz fajla:\n0.Izlaz iz aplikaacije: ");
			opcija = unos.nextInt();

			if (opcija == 1) {
				System.out.println("\nIspis rijeci iz fajla: ");
				ispisiSveRijeci();
			}

			if (opcija == 2) {
				System.out.println("\nIspis nedupliciranih rijeci: ");
				bezDuplikata();
			}

		}

		unos.close();
	}

	public static void ispisiSveRijeci() throws IOException {

		ArrayList<String> lista = new ArrayList<String>();
		FileReader citacFajl = new FileReader("kolekcije.txt");
		BufferedReader citac = new BufferedReader(citacFajl);

		String linija;
		while ((linija = citac.readLine()) != null) {

			lista.add(linija);
		}
		citac.close();

		for (String e : lista) {

			System.out.println(e + " ");
		}
	}

	public static void bezDuplikata() throws IOException {

		TreeSet<String> listaUnikata = new TreeSet<String>();
		FileReader citacFajl = new FileReader("kolekcije.txt");
		BufferedReader citac = new BufferedReader(citacFajl);

		String linija;
		while ((linija = citac.readLine()) != null) {

			listaUnikata.add(linija);
		}
		citac.close();

		for (String e : listaUnikata) {

			System.out.println(e + " ");
		}

	}

}
