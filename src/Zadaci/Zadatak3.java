package Zadaci;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int brojevi = 1;
		System.out.println("Unesite cijele brojeve 0 prekida unos: ");

		while (brojevi != 0) {
			brojevi = unos.nextInt();

			if (brojevi != 0) {
				lista.add(brojevi);
			}
		}

		int opcija = 1;

		while (opcija != 0) {

			System.out.println(
					"Unesite jednu od ponudjenih opcija:\n1.Zbir svih unesenih brojeva\n2.Prosjek svih unesenih brojeva"
							+ "\n3.Zbir svih parnih brojeva\n4.Zbir svih parnih brojeva\n5.Zbir brojeva na parnim pozicijama"
							+ "\n6.Zbir brrojeva na neparnim pozicijama\n7.Unikatne brojeve\n8.Brojevi koji seponavljaju vise od jednom");
			opcija = unos.nextInt();

			if (opcija == 1) {

				System.out.println("Zbir svih unesenih brojeva je: " + zbirSvihUnesenihBrojeva(lista));
			}

			if (opcija == 2) {

				System.out.println("Prosjek unesenih brojoeva je: " + prosjekUnesenihBrojeva(lista));
			}

			if (opcija == 3) {

				System.out.println("Zbir parnih brojeva je: " + zbirSvihParnihBrojeva(lista));
			}

			if (opcija == 4) {

				System.out.println("Zbir neparnih brojeva je: " + zbirSvihNeparnihBrojeva(lista));
			}

			if (opcija == 5) {

				System.out.println("Zbir brojeva na parnim pozicijama su: " + ZbirbrojevaNaParnimPozicijama(lista));
			}

			if (opcija == 6) {

				System.out.println("Zbir brojeva na neparnim pozicijama su: " + ZbirbrojevaNaNeparnimPozicijama(lista));
			}

			if (opcija == 7) {

				System.out.println("Unikatnni brojevi su: " + unikatniBroojevi(lista));
			}

			if (opcija == 8) {

				System.out.println("Brojevi koji se ponavljaju vise od jednom su: " + brojeviKojiSePonavljaju(lista));
			}
		}

	}

	public static int zbirSvihUnesenihBrojeva(ArrayList<Integer> lista) {

		int rezultat = 0;
		for (int i = 0; i < lista.size(); i++) {

			rezultat += lista.get(i);
		}
		return rezultat;
	}

	public static double prosjekUnesenihBrojeva(ArrayList<Integer> lista) {

		double prosjek = (double) zbirSvihUnesenihBrojeva(lista) / lista.size();

		return prosjek;
	}

	public static int zbirSvihParnihBrojeva(ArrayList<Integer> lista) {

		int zbirParnihBrojeva = 0;

		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i) % 2 == 0) {

				zbirParnihBrojeva += lista.get(i);
			}
		}

		return zbirParnihBrojeva;
	}

	public static int zbirSvihNeparnihBrojeva(ArrayList<Integer> lista) {

		int zbirNepranihBrojeva = 0;

		for (int i = 0; i < lista.size(); i++) {

			if (lista.get(i) % 2 != 0) {

				zbirNepranihBrojeva += lista.get(i);
			}
		}

		return zbirNepranihBrojeva;
	}

	public static int ZbirbrojevaNaParnimPozicijama(ArrayList<Integer> lista) {

		int ZbirParnePozicije = 0;
		for (int i = 0; i < lista.size(); i++) {

			if (i % 2 != 0) {

				ZbirParnePozicije += lista.get(i);
			}
		}

		return ZbirParnePozicije;
	}

	public static int ZbirbrojevaNaNeparnimPozicijama(ArrayList<Integer> lista) {

		int zbirNeparnePozicije = 0;
		for (int i = 0; i < lista.size(); i++) {

			if (i % 2 != 0) {

				zbirNeparnePozicije += lista.get(i);
			}
		}

		return zbirNeparnePozicije;
	}

	public static HashSet<Integer> unikatniBroojevi(ArrayList<Integer> lista) {

		HashSet<Integer> unikatni = new HashSet<Integer>();

		unikatni.addAll(lista);

		return unikatni;
	}

	public static HashSet<Integer> brojeviKojiSePonavljaju(ArrayList<Integer> lista) {

		HashSet<Integer> brojeviNePonavljani = new HashSet<Integer>();
		HashSet<Integer> brojeviPonavljani = new HashSet<Integer>();

		for (int i = 0; i < lista.size(); i++) {

			if (!brojeviNePonavljani.contains(lista.get(i))) {
				brojeviNePonavljani.add(lista.get(i));
				continue;
			}
			brojeviPonavljani.add(lista.get(i));

		}

		return brojeviPonavljani;
	}

}
