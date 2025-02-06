package entorno_test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import actividades.A4_1;

import static actividades.A4_1.contarPalabras;
import static actividades.A4_1. contarLetrasDiferentes;
import static actividades.A4_1.contarFrecuenciaLetras;
import static actividades.A4_1.esPalindroma;

class tets {

	@Test
	void testContarPalabra() {
		assertEquals(0,contarPalabras(" "));
		assertNotEquals(1,contarPalabras(" "));
		assertEquals(2,contarPalabras("hol buneas"));
	}
	
	@Test
	void testContarLetrasDiferentes() {
		assertEquals(5,contarLetrasDiferentes("palabra")) ;
		assertEquals(0,contarLetrasDiferentes(" "));
		assertEquals(2,contarLetrasDiferentes("ae"));
		assertEquals(0,contarLetrasDiferentes(null));
	}
	
	@Test
	void testContarFrecunciaPalabra() {
		Map<String,Integer> esperada1 = new HashMap<>(Map.of("mundo",2));
		/*Hemos añadido en el codigo A4_1 el metodo trim para que no nos de fallo*/
	
		assertTrue(esperada1.equals(A4_1.contarFrecuenciaPalabras("mundo mundo")));
		assertFalse(esperada1.equals(A4_1.contarFrecuenciaPalabras("mundo")));
		assertFalse(esperada1.equals(A4_1.contarFrecuenciaPalabras("")));
		
	}
	
	@Test
	void testContarFrecunciaLetra() {
		Map<Character,Integer> esperada2 = new HashMap<>(Map.of('m',2));
	
		assertTrue(esperada2.equals(A4_1.contarFrecuenciaLetras("m m")));
		assertFalse(esperada2.equals(A4_1.contarFrecuenciaLetras("mundo")));
		assertFalse(esperada2.equals(A4_1.contarFrecuenciaLetras("")));
		
	}
	

	
	
	@Test 
	void testEsPalindroma() {
		assertEquals(false,esPalindroma(null));
		assertEquals(true,esPalindroma("ANA"));
		assertEquals(false,esPalindroma(""));
		assertEquals(true,esPalindroma(" ANA"));
		assertEquals(false,A4_1.esPalindroma("aNi"));
		assertEquals(true,esPalindroma(" ANA " ));
		assertEquals(true,esPalindroma(" A1A " ));
	}
}
