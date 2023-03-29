package br.com.alura;

import java.util.ArrayList;

public class Clase2 {
	public static void main(String[] args) {
		String variable1="Clase1";
		String variable2="Clase2";
		String variable3="Clase3";
		String variable4="Clase4";
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add(variable1);
		lista.add(variable2);
		lista.add(variable3);
		lista.add(variable4);
		
		System.out.println(lista);
		//TRES FORMAS DE LEER UNA LISTA
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			}
		
		for (String clase : lista) {
			System.out.println(clase);
			}
		
		lista.forEach(clase -> {
			System.out.println(clase);
		});
	}
}
