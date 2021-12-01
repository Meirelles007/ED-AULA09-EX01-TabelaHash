package view;

import java.util.ArrayList;
import java.util.Hashtable;

import controller.BuilderHash;

public class Principal {
	public static void main(String[] args) {
		BuilderHash hash = new BuilderHash();
		ArrayList<Integer> lista0 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		ArrayList<Integer> lista4 = new ArrayList<Integer>();
		Hashtable<Integer, ArrayList<Integer>> numeros = new Hashtable<Integer, ArrayList<Integer>>();

		int[] vetor = { 2, 7, 8, 8, 9, 10, 99, 11, 23, 32, 23, 35, 63, 2, 3, 6, 12 };
		
		for (int i : vetor) {
			int chave = hash.minhaFuncaoHash(i);
			switch (chave) {
			case 0:
				lista0.add(i);
				numeros.put(chave, lista0);
				break;
			case 2:
				lista2.add(i);
				numeros.put(chave, lista2);
				break;
			case 4:
				lista4.add(i);
				numeros.put(chave, lista4);
				break;
			}

		}
		System.out.println(numeros.toString());
	}

}
