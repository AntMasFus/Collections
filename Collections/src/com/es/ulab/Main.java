package com.es.ulab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Persona[] persona = new Persona[3];

		persona[0].setNombre("Ana");
		persona[0].setEdad(26);
		persona[0].setAnonacimiento(2010);

		persona[1].setNombre("Alba");
		persona[1].setEdad(21);
		persona[1].setAnonacimiento(1988);

		persona[2].setNombre("Ana");
		persona[2].setEdad(26);
		persona[2].setAnonacimiento(2009);

		persona[3].setNombre("Alba");
		persona[3].setEdad(26);
		persona[3].setAnonacimiento(2007);

		List<Persona> personaList = Arrays.asList(persona);

	}
}
