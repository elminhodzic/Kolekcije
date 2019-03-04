package Zadaci;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Zaddatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);
		System.out.println("unesi brojeve 0 prekida unos: ");
		ArrayList<Integer> listaBrojeva = new ArrayList<Integer>();
		TreeSet<Integer> lista2 = new TreeSet<Integer>();
		HashSet<Integer> lista3 = new HashSet<Integer>();

		int opcija = 1, opcija2 = 1;

		while (opcija != 0) {

			opcija = unos.nextInt();
			if (opcija != 0) {
				listaBrojeva.add(opcija);
				lista2.add(opcija);
				lista3.add(opcija);
			}
		}

		listaBrojeva.remove(listaBrojeva.size() - 1);

		while (opcija2 != 0) {
			System.out.println(
					"Odaberite opciju:\n1.sortirani brojevi.\n2.promjesani brojevi.\n3.sortirani broojevi u silazecem redosljedu");
			opcija2 = unos.nextInt();

			if (opcija2 == 1) {
				System.out.println("Sortirani brojevi:");
				for (Integer e : lista2) {

					System.out.print(e + " ");
				}
				System.out.println("\n");
			}

			if (opcija2 == 2) {

				System.out.println("Izmjesani brojevi: ");

				Collections.shuffle(listaBrojeva);
				for (Integer e : listaBrojeva) {

					System.out.print(e + " ");
				}
				System.out.println("\n");
			}

			if (opcija2 == 3) {
				System.out.println("broejvi sortirani u silazecem redosljedu: ");

				ArrayList<Integer> obrnutaLista = new ArrayList<Integer>();
				obrnutaLista.addAll(lista2);
				for (int i = obrnutaLista.size()-1; i >= 0; i--) {
					
					System.out.print(obrnutaLista.get(i) + " ");
				}
				System.out.println("\n");
			}
		}
	}
}
