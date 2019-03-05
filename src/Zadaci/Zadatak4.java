package Zadaci;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import javax.xml.crypto.Data;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> aL = new ArrayList<Integer>();
		LinkedList<Integer> lL = new LinkedList<Integer>();

		for (int i = 0; i < 5000000; i++) {

			aL.add(i);
			lL.add(i);
		}
		/*
		 * Arraylist vrijeme potrebdno da izlista pomocu index-a.
		 */
		Instant pocetakBrojanja = Instant.now();
		for (int i = 0; i < aL.size(); i++) {

			System.out.println(aL.get(i));
		}
		Instant krajBrojanja = Instant.now();
		Duration interval = Duration.between(pocetakBrojanja, krajBrojanja);

		/*
		 * ArrayLissta vrijeme potrebdno da izlista pomocu forec petlje.
		 */
		Instant pocetakBrojanja2 = Instant.now();
		for (Integer e : aL) {

			System.out.println(e);
		}
		Instant krajBrojanja2 = Instant.now();
		Duration interval2 = Duration.between(pocetakBrojanja2, krajBrojanja2);

		/*
		 * LinkedList vrijeme potrebno da izlista pomocu index-a.
		 */
		Instant pocetakBrojanja3 = Instant.now();
		for (int i = 0; i < lL.size(); i++) {

			System.out.println(lL.get(i));
		}
		Instant krajbrojanja3 = Instant.now();
		Duration interval3 = Duration.between(pocetakBrojanja3, krajbrojanja3);

		/*
		 * LinkedList vrijeme potrebno da izlista pomocu forec petlje.
		 */
		Instant pocetakBrojanja4 = Instant.now();
		for (Integer e : lL) {

			System.out.println(e);
		}
		Instant krajBrojanja4 = Instant.now();
		Duration interval4 = Duration.between(pocetakBrojanja4, krajBrojanja4);
		
		System.out.println("vrijeme proteklo od index ArrayL brojaca je: " + interval.getSeconds());
		System.out.println("vrijeme proteklo od forec ArrayL brojaca je: " + interval2.getSeconds());
		System.out.println("vrijeme proteklo od index LinkedL brojaca je: " + interval3.getSeconds());
		System.out.println("vrijeme proteklo od forec LinkedL brojaca je: " + interval4.getSeconds());

	}

}
